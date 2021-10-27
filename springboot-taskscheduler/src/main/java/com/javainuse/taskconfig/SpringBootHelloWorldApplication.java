package com.javainuse.taskconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootHelloWorldApplication {

	public static void main(String[] args) {

		SpringApplication.run(
				 SpringBootHelloWorldApplication.class,  args);
	}
}   