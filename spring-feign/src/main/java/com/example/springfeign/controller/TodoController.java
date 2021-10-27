package com.example.springfeign.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springfeign.client.TodoClient;
import com.example.springfeign.model.Product;

@RestController
@RequestMapping("/1")
public class TodoController {
    
    @Autowired
    TodoClient todoClient;
    
    @GetMapping()
    public List<Product> getTodos()
    {
        return todoClient.list();
    }
    @PostMapping("/saveProduct")
    public String saveProduct(@RequestBody Product product) {
    	System.out.println("controller***********************");
    	todoClient.add(product);
    	return "welcome";
    }
    
}
