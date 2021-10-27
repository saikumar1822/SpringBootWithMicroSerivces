package com.example.schedular;

import java.util.Calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;


@SpringBootApplication
@EnableScheduling
public class SchedularApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(
				 SchedularApplication.class , args);
		
	
	}
	@Scheduled(initialDelay = 1000, fixedRate = 10000)
	public void call() {
		System.out.println(" task is runnign classS"+" "+Calendar.getInstance().getTime());
	}

}
