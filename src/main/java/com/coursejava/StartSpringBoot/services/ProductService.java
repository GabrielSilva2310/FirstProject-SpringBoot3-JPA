package com.coursejava.StartSpringBoot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coursejava.StartSpringBoot.entities.Product;
import com.coursejava.StartSpringBoot.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository product;
	
	public List<Product> findAll(){
		return product.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj=product.findById(id);
		return obj.get();
	}
	

}
