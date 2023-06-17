package com.ust.rest.repository;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.stereotype.Repository;

import com.ust.rest.entity.Employee;
@Repository
public class EmployeeRepository 
{
	
	private ArrayList<Employee> emp =new ArrayList<>();
	public EmployeeRepository() 
	{
		Employee e=new Employee();
		e.setEmpid(101);
		e.setName("Raniya");
		e.setAge(10);
		e.setDescription("mba");
		emp.add(e);
		
		Employee e1=new Employee();
		e1.setEmpid(101);
		e1.setName("annu");
		e1.setAge(10);
		e1.setDescription("a");
		emp.add(e1);
		
		Employee e2=new Employee();
		e2.setEmpid(101);
		e2.setName("Rachel");
		e2.setAge(10);
		e2.setDescription("pilot");
		emp.add(e2);
		
		Employee e3=new Employee();
		e3.setEmpid(101);
		e3.setName("Archana");
		e3.setAge(10);
		e3.setDescription("navy officer");
		emp.add(e3);
	}

	public boolean create(Employee employee) {
		
		if(emp.add(employee)) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

	public ArrayList<Employee> show() 
	{
		
		return emp;
	}
//didnt understand
	public Employee showsingle(int empid) {
		Employee employee=null;
		Iterator<Employee> empl=emp.iterator();
		
		while(empl.hasNext()) 
		{
			employee=empl.next();
			if(employee.getEmpid()==empid) 
			{
				break;
			}
		}
			if(employee!=null) 
			{
				return employee;
			}
			else {
				return null;
				}
			}
	}

