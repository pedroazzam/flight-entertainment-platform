package com.immfly.jrbptest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.immfly.jrbptest.models.Content;
import com.immfly.jrbptest.service.ContentService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ContentController {
	
	@Autowired
	ContentService contentService;
	
	@GetMapping("/content/all")
	public List<Content> findAll(){
		System.out.println("GET ALL CONTENTS");//DELETE ME!
		return contentService.findall();
	}

}
