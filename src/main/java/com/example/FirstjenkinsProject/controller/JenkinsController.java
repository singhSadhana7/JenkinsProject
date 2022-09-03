package com.example.FirstjenkinsProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class JenkinsController {
	
	@GetMapping
	public String printMassage() {
		return "This API is running by Jenkins";
	}
	

}
