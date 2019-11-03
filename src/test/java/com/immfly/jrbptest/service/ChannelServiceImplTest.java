package com.immfly.jrbptest.service;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.immfly.jrbptask.repository.ChannelRepository;
import com.immfly.jrbptask.service.ChannelServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChannelServiceImplTest {
	
	@InjectMocks
	ChannelServiceImpl channelServiceImpl;
	
	@Mock
	ChannelRepository channelRepository;
	
	@Test
	public void findAll() {
		channelServiceImpl.findall();
		verify(channelRepository).findAll();
	}

}
