package com.coursecube.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.coursecube.springboot"})
public class StartMyBootApp{
	
	public static void main(String[] args) {		
		SpringApplication.run(StartMyBootApp.class, args);		
	}
}
