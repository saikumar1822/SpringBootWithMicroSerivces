package com.example.springjsondocs.controller;

import java.util.List;

import org.jsondoc.core.annotation.Api;
import org.jsondoc.core.annotation.ApiMethod;
import org.jsondoc.core.annotation.ApiPathParam;
import org.jsondoc.core.annotation.flow.ApiFlow;
import org.jsondoc.core.annotation.flow.ApiFlowSet;
import org.jsondoc.core.pojo.ApiStage;
import org.jsondoc.core.pojo.ApiVisibility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springjsondocs.entity.Employee;
import com.example.springjsondocs.service.EmployeeService;

@RestController

@ApiFlowSet
@Api(name = "employee management system",description = "employee info",group = "management",visibility = ApiVisibility.PUBLIC,stage = ApiStage.BETA)
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@RequestMapping(value = "/saveEmployee",method = RequestMethod.POST)
	@ApiMethod(description = "add new employee")
	@ApiFlow(name = "saving employee",description = "takes the employee and saves into db",preconditions = "user should give employee details")
	public String save(@RequestBody Employee employee) {
		return service.saveEmployee(employee);
	}
	
	@RequestMapping(value ="/getEmployee/{id}",method = RequestMethod.GET)
	@ApiMethod(description = "find employee by id",path = {"id"})
	public Employee getEmployee(@PathVariable 	@ApiPathParam(description = "input employee id to get",name="id")Integer id) {
		return service.getEmployee(id);
	}
	@ApiMethod(description = "delete employee by id",path = {"id"})
	@RequestMapping(value = "/deleteEmployee/{id}",method = RequestMethod.DELETE)
	public List<Employee> deleteEmployee(@PathVariable 	@ApiPathParam(description = "input employee id to delete ",name="id")Integer id) {
		return service.deleteEmployee(id);
	}

}
