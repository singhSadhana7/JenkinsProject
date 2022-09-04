package com.example.FirstjenkinsProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FirstjenkinsProject.model.JenkinsInformation;
import com.example.FirstjenkinsProject.service.JenkinsService;

@RestController
@RequestMapping("api/v1")
public class JenkinsController {
	
	
	@Autowired
	private JenkinsService jenkinsService;
	
	@GetMapping
	public ResponseEntity<?> getAllJenkinsInformation() {
		return jenkinsService.getAllJenkinsInformation(); 
	}
	
	@PostMapping
	public ResponseEntity<?> saveJenkinsInformation(@RequestBody JenkinsInformation jenkinsInformation){
     return jenkinsService.saveJenkinsInformation(jenkinsInformation);
		
	}
	

}
