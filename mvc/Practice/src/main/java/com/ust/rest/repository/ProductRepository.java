package com.ust.rest.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.ust.rest.entity.Product;

@Repository
public class ProductRepository {
	private ArrayList<Product> productc=new ArrayList<>();//to make the product class in a list form
	

	public ProductRepository() {//this is a constructor in which we set the elements
		Product p1=new Product();
		p1.setName("apple");
		p1.setQty(4);
		productc.add(p1);
		
		Product p2=new Product();
		p2.setName("orange");
		p2.setQty(77);
	}
	
}
