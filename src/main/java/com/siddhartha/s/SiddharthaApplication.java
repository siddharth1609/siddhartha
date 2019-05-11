package com.siddhartha.s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = { "com.siddhartha.s", "com.siddhartha.s.serviceImpl",
		"com.siddhartha.s.repository", "com.siddhartha.s.service" })
//@SpringBootApplication()
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//@EnableJpaRepositories("com.siddhartha.s.repository")
public class SiddharthaApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {

		SpringApplication.run(SiddharthaApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SiddharthaApplication.class);
	}

}
