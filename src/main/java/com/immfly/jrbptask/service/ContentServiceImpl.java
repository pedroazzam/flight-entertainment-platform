package com.immfly.jrbptask.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.immfly.jrbptask.models.Content;
import com.immfly.jrbptask.repository.ContentRepository;

@Service
public class ContentServiceImpl implements ContentService{
	
	ContentRepository contentRepository;
	
	@Autowired
	public ContentServiceImpl(ContentRepository newContentRepository) {
		contentRepository = newContentRepository;
	}
	
	@Override
	public List<Content> findall(){
		return contentRepository.findAll();
	}
	

}
