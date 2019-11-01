package com.immfly.jrbptest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.immfly.jrbptest.models.Channel;
import com.immfly.jrbptest.repository.ChannelRepository;

@Service
public class ChannelServiceImpl implements ChannelService{
	
	ChannelRepository channelRepository;
	
	@Autowired
	public ChannelServiceImpl(ChannelRepository newChannelRepository) {
		channelRepository = newChannelRepository;
	}
	
	@Override
	public List<Channel> findall(){
		return channelRepository.findAll();
	}

}
