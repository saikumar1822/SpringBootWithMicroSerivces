package com.example.crudwithrest.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudwithrest.model.Product;
import com.example.crudwithrest.repository.ProductRepository;



@Service
@Transactional
public class ProductService {
 
    @Autowired
    private ProductRepository repo;
     
    public List<Product> listAll() {
        return repo.findAll();
    }
     
    public void save(Product product) {
        repo.save(product);
        
    }
     
    public Product get(long id) {
    	if (id==0) {
    		throw new NullPointerException();
    	}else {
    		
        return repo.findById(id).get();
    	}
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }
}
