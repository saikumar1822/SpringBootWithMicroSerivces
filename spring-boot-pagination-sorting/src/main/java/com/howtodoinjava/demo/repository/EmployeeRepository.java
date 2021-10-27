package com.howtodoinjava.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.howtodoinjava.demo.model.User;
 
@Repository
public interface EmployeeRepository
        extends PagingAndSortingRepository<User, Integer> {
 
}