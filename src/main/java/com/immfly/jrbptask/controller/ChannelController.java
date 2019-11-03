package com.immfly.jrbptask.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.immfly.jrbptask.models.Channel;
import com.immfly.jrbptask.service.ChannelService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
@Api(value = "REST API - CHANNEL")
public class ChannelController {

	@Autowired
	ChannelService channelService;

	@GetMapping("/channel/all")
	@ApiOperation(value = "Return all Channels")
	public List<Channel> findAll() {
		System.out.println("GET ALL CHANNELS");// DELETE ME!
		return channelService.findall();
	}
	
	@GetMapping("/channel/ratingreport")
	@ApiOperation(value = "Generate RatingReport.csv")
	public void avgRatingReport() throws IOException {
		ArrayList<ArrayList<String>> report = new ArrayList<ArrayList<String>>();
		ArrayList<String> singleList = new ArrayList<String>();
		List<Channel> channels = channelService.findall();
		BigDecimal avrChanel = new BigDecimal(0);
		
		for (int i = 0; i < channels.size(); i++) {
			singleList = new ArrayList<String>();
			singleList.add(channels.get(i).getTitle());
			
			avrChanel = avgRatings(channels.get(i));
			singleList.add(avrChanel.toString());
			
			report.add(singleList);
		}
		
		FileWriter csvWriter = new FileWriter("RatingReport.csv");
		csvWriter.append("channel title");
		csvWriter.append(",");
		csvWriter.append("average rating");
		csvWriter.append("\n");
		for (List<String> rowData : report) {
		    csvWriter.append(String.join(",", rowData));
		    csvWriter.append("\n");
		}
		csvWriter.flush();
		csvWriter.close();
		
		
	}
	
	public BigDecimal avgRatings(Channel channel) {
		try {
			BigDecimal sumRating = new BigDecimal(0);
			int cti = 0;
			BigDecimal avgRating = new BigDecimal(0);

			if (!channel.getContent().isEmpty()) {
				for (int i = 0; i < channel.getContent().size(); i++) {
					sumRating = sumRating.add(channel.getContent().get(i).getRating());
					cti++;
				}
			}
			if (!channel.getSubchannel().isEmpty()) {
				for (int i = 0; i < channel.getSubchannel().size(); i++) {
					if (!channel.getSubchannel().get(i).getContent().isEmpty()) {
						for (int n = 0; i < channel.getSubchannel().get(i).getContent().size(); n++) {
							sumRating = sumRating.add(channel.getSubchannel().get(i).getContent().get(n).getRating());
							cti++;
						}
					}
				}
			}
			avgRating = sumRating.divide(BigDecimal.valueOf(cti).movePointLeft(2));
			return avgRating;
		} catch (Exception e) {
			// TODO: handle exception
			throw new IllegalArgumentException("Unable to calculate the Rating!");
		}

	}

}
