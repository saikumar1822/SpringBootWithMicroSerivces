package com.example.SpringJwt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.SpringJwt.domain.Role;
import com.example.SpringJwt.domain.User;

@Service
public interface UserService {
User saveUser(User user);
Role saveRole(Role role);
void addRoleToUser(String userName,String roleName);
User getUser(String userName);
List<User> getUsers();
}
