package com.example.dev_day;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class DevDayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevDayApplication.class, args);
	}

}
