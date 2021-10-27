package com.example.springprofileexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springprofileexample.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
