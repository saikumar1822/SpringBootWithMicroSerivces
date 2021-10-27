package com.example.SpringJwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringJwt.domain.Role;
import com.example.SpringJwt.domain.User;
import com.example.SpringJwt.repo.RoleRepository;
import com.example.SpringJwt.repo.UserRepository;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private RoleRepository roleRepo;

	@Override
	public User saveUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public Role saveRole(Role role) {
		return roleRepo.save(role);
	}

	@Override
	public void addRoleToUser(String userName, String roleName) {
		User user=userRepo.findByUserName(userName);
		Role role=roleRepo.findByName(roleName);
		user.getRoles().add(role);
		
	}

	@Override
	public User getUser(String userName) {
		
		return userRepo.findByUserName(userName);
	}

	@Override
	public List<User> getUsers() {
		
		return userRepo.findAll();
	}

}
