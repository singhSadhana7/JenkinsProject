package com.example.FirstjenkinsProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.FirstjenkinsProject.model.JenkinsInformation;

@Repository
public interface JenkinsInformationRepository extends JpaRepository<JenkinsInformation, Long> {

}
