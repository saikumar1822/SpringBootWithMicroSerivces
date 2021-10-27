package com.example.springbootmultithreadingexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootmultithreadingexample.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
