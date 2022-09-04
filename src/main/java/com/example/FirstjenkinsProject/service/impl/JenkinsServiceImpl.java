package com.example.FirstjenkinsProject.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.FirstjenkinsProject.model.JenkinsInformation;
import com.example.FirstjenkinsProject.repository.JenkinsInformationRepository;
import com.example.FirstjenkinsProject.service.JenkinsService;

@Service
public class JenkinsServiceImpl implements JenkinsService {
	
	@Autowired
	private JenkinsInformationRepository jenkinsInformationRepository;

	@Override	
	public ResponseEntity<?> saveJenkinsInformation(JenkinsInformation jenkinsInformation) {
		
		jenkinsInformationRepository.save(jenkinsInformation);
		// TODO Auto-generated method stub
		return ResponseEntity.ok(jenkinsInformation);
	}

	@Override
	public ResponseEntity<?> getAllJenkinsInformation() {
		// TODO Auto-generated method stub
		return ResponseEntity.ok( jenkinsInformationRepository.findAll());
	}
	

}
