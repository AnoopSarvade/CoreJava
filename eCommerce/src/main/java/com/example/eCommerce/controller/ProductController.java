package com.example.eCommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.eCommerce.entity.Product;
import com.example.eCommerce.respository.ProductRepo;

@RestController
@RequestMapping("/eCommerce")
public class ProductController {
	
	@Autowired
	private ProductRepo productRepo;
	
	@GetMapping("/products")
	public List<Product> getAllProduct(){
		
		List<Product> ls = productRepo.findAll();
		
		return ls;
	}

}
