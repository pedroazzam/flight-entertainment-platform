package com.immfly.jrbptest.service;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.immfly.jrbptask.repository.ContentRepository;
import com.immfly.jrbptask.service.ContentServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ContentServiceImplTest {
	
	@InjectMocks
	ContentServiceImpl contentServiceImpl;
	
	@Mock
	ContentRepository contentRepository;
	
	@Test
	public void findAll() {
		contentServiceImpl.findall();
		verify(contentRepository).findAll();
	}

}
