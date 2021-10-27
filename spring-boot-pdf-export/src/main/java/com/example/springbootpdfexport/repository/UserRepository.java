package com.example.springbootpdfexport.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootpdfexport.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
