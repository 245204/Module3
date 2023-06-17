package com.ust.rest.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.rest.entity.Employee;
import com.ust.rest.repository.EmployeeRepository;

@Service
public class EmployeeService {
@Autowired
EmployeeRepository repository;
	public boolean create(Employee employee) {
		
		return repository.create(employee) ;
	}
	public ArrayList<Employee> show() {
		
		return repository.show();
	}
//	public Employee showsingle(int empid) {
//		
//		return repository.showsingle(empid);
//	}
	public Employee showsingle(int empid) {
		
		return repository.showsingle(empid);
	}

}
