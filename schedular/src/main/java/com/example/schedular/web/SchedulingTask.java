package com.example.schedular.web;

import java.util.Calendar;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
public class SchedulingTask {
	@Scheduled(initialDelay = 1000, fixedRate = 10000)
	public void run() {
		System.out.println(" task is runnign"+" "+Calendar.getInstance().getTime());
	}

}
