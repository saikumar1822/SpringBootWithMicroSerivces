package com.example.springprofileexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springprofileexample.model.User;
import com.example.springprofileexample.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService service;
	@GetMapping("/")
	@Profile("dev")
	public List<User> getAllUsers(){
		return service.getUsers();
	}

}
