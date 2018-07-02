package com.siddhartha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.siddhartha" })
public class SiddharthaApplication {

	public static void main(String[] args) {

		SpringApplication.run(SiddharthaApplication.class, args);
	}
}
