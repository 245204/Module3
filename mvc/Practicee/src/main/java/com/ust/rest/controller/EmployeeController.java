package com.ust.rest.controller;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.rest.entity.Employee;
import com.ust.rest.service.EmployeeService;



@RestController
@RequestMapping //("/employee/api.0")
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@PostMapping
	@RequestMapping(value="/create",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> addemployee(@RequestBody Employee employee) {
		
		boolean result= service.create(employee);
		if(result) {
			return ResponseEntity.status(HttpStatus.CREATED).body(true);
		}
		else {
			return ResponseEntity.status(HttpStatus.CREATED).body(false);
		}
		
	}
	@GetMapping ("/reterive")
//@RequestMapping("/reterive") //this will also work.cause for get this..when we give in requestmapping it will work anyway
	public ArrayList<Employee> show(){
		return service.show();
	}
	@GetMapping
	@RequestMapping("/reterive/{empid}")
	public Employee showsingle(@PathVariable int empid) {
		return service.showsingle(empid);
	}

	
	
	

}


