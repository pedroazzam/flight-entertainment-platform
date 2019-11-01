package com.immfly.jrbptest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.immfly.jrbptest.models.Channel;
import com.immfly.jrbptest.service.ChannelService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ChannelController {
	
	@Autowired
	ChannelService channelService;
	
	@GetMapping("/channel/all")
	public List<Channel> findAll(){
		System.out.println("GET ALL CHANNELS");//DELETE ME!
		return channelService.findall();
	}

}
