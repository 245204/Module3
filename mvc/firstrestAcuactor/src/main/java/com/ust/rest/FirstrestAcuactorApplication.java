package com.ust.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstrestAcuactorApplication {

	final static Logger logger= LoggerFactory.getLogger(FirstrestAcuactorApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(FirstrestAcuactorApplication.class, args);
		logger.info("Application started successfully");
		logger.error("error");
		logger.warn("warning message");
		logger.debug("debugging");
		logger.trace("tracing");
		
	}

}
