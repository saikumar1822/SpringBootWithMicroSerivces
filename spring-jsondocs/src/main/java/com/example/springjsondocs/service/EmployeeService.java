package com.example.springjsondocs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springjsondocs.dao.EmployeeRepository;
import com.example.springjsondocs.entity.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repo;
	
	public List<Employee> deleteEmployee(int id){
		repo.deleteById(id);
		return repo.findAll();
	}
	
	public String saveEmployee(Employee employee) {
		repo.save(employee);
		return "new employee added with id:"+employee.getId();
	}
	
	public Employee getEmployee(int id) {
		return repo.findById(id).get();
	}

}
