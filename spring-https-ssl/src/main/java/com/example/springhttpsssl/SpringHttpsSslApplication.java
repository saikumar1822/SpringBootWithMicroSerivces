package com.example.springhttpsssl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringHttpsSslApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHttpsSslApplication.class, args);
	}

	@GetMapping("/getData")
	public String getMessage() {
		return "Accessed by HTTPS protocol";
	}
}
