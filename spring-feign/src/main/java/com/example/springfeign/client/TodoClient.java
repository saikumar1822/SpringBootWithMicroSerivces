package com.example.springfeign.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.springfeign.model.Product;

@FeignClient(name="TodoClient", url="http://localhost:8097")
public interface TodoClient {
   
    @GetMapping(value="/products",consumes=MediaType.APPLICATION_JSON_VALUE)
	public List<Product> list();
    
    @PostMapping("/products")
	public void add(@RequestBody Product product);
}