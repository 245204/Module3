package com.ust.rest.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.rest.resource.Product;
import com.ust.rest.services.ProductService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/product/api.2.0")
@Api(value = "Product Service API 2.0", description = "REST endpoint for Product API")
public class ProductResource {
	@Autowired
	ProductService service;

	@GetMapping
	@RequestMapping("/retrieve/{productId}")
	@ApiOperation(value = "Returns the Product entity")
	public Product fetchProduct(@PathVariable long productId) {
		return service.getProduct(productId);
	}

	@GetMapping
	@RequestMapping("/retrieve/all")
	@ApiOperation(value = "Returns all the Product entity")
	public List<Product> fetchProducts() {
		return service.getProducts();
	}

	@PostMapping
	@ApiOperation(value = "Post the Product entity")
	@RequestMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> addProduct(@RequestBody Product product) {
		
		 Exception exception=null; 
		 Product tempProduct=null;
		 try {
		 tempProduct=service.add(product); 
		 }
		 catch(Exception e)
		 { 
			 exception =e;
		 
		 
		 }
		 if(tempProduct!=null) 
		 { 
			 return ResponseEntity.status(HttpStatus.CREATED).body(tempProduct); 
			 }else 
			 { 
				 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(exception); }
		

//		Product result = service.add(product);
//		if (result) {
//			return ResponseEntity.status(HttpStatus.CREATED).body(true);
//		} else {
//			return ResponseEntity.status(HttpStatus.CREATED).body(false);
//
//		}
	}

	@PutMapping
	@ApiOperation(value = "Update the Product entity")
	@RequestMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Product updateProduct(@RequestBody Product product) {
		return service.updateProduct(product);
	}

	@DeleteMapping
	@ApiOperation(value = "Delete the Product entity")
	@RequestMapping(value = "/delete/{productId}")
	public void deleteProduct(@PathVariable long productId) {
		service.deleteProduct(productId);
	}

}
