package com.eddy.s3test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class S3testApplication {

	public static void main(String[] args) {
		SpringApplication.run(S3testApplication.class, args);
	}

}
