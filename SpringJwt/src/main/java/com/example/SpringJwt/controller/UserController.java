package com.example.SpringJwt.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.SpringJwt.domain.Role;
import com.example.SpringJwt.domain.User;
import com.example.SpringJwt.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getUser(){
		return ResponseEntity.ok().body(userService.getUsers());
	}
	
    @PostMapping("/user/save")
	public ResponseEntity<User>saveUser(@RequestBody User user){
	URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/user/save").toUriString());
		return ResponseEntity.created(uri).body(userService.saveUser(user));
	}
    
    @PostMapping("/role/save")
   	public ResponseEntity<Role> saveRole(@RequestBody Role role){
   	URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/role/save").toUriString());
   		return ResponseEntity.created(uri).body(userService.saveRole(role));
   	}
    
    @PostMapping("/role/addToUser")
   	public ResponseEntity<Role> saveRole(@RequestBody Role role){
   	URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/role/save").toUriString());
   		return ResponseEntity.created(uri).body(userService.saveRole(role));
   	}

}
