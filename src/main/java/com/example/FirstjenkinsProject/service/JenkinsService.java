package com.example.FirstjenkinsProject.service;

import org.springframework.http.ResponseEntity;

import com.example.FirstjenkinsProject.model.JenkinsInformation;

public interface JenkinsService {

	ResponseEntity<?> saveJenkinsInformation(JenkinsInformation jenkinsInformation);

	ResponseEntity<?> getAllJenkinsInformation();

}
