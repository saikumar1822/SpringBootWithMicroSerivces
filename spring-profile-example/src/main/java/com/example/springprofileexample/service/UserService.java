package com.example.springprofileexample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.example.springprofileexample.model.User;
import com.example.springprofileexample.repository.UserRepository;

@Service
@Profile(value = {"local", "dev"})
public class UserService {
	@Autowired
	private UserRepository repo;
	
	public List<User> getUsers(){
		return repo.findAll();
	}

}
