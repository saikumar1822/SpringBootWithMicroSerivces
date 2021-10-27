package com.example.springmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.example.springmail.service.SimpleMailService;

@SpringBootApplication
public class SpringMailApplication {
	@Autowired
	private SimpleMailService service;

	public static void main(String[] args) {
		SpringApplication.run(SpringMailApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() {
		service.sendSimpleMail("nani74k@gmail.com", "this is the mail body", "this is email subject");

	}
}
