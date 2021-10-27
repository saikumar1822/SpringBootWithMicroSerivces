package com.example.springjsondocs.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.jsondoc.core.annotation.ApiObject;
import org.jsondoc.core.annotation.ApiObjectField;
@Entity
@ApiObject
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiObjectField(name = "employee id",description = "auto generated id ")
	private int id;
	@ApiObjectField(name = "employee name",description = "name by voterid")
	private String name;
	@ApiObjectField(name = "department",description = "department section")
	private String dept;
	@ApiObjectField(name = "salary",description = "annual income")
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int id, String name, String dept, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	public Employee() {
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	

}
