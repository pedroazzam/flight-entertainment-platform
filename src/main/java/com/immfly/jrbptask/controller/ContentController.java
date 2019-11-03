package com.immfly.jrbptask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.immfly.jrbptask.models.Content;
import com.immfly.jrbptask.service.ContentService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
@Api(value="REST API - CONTENT")
public class ContentController {
	
	@Autowired
	ContentService contentService;
	
	@GetMapping("/content/all")
	@ApiOperation(value="Return all Contents")
	public List<Content> findAll(){
		System.out.println("GET ALL CONTENTS");//DELETE ME!
		return contentService.findall();
	}

}
