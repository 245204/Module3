package com.ust.rest.entity;

public class Employee {
	private int empid;
	private String name;
	private int age;
	private String description;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int empid, String name, int age, String description) {
		super();
		this.empid = empid;
		this.name = name;
		this.age = age;
		this.description = description;
	}

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
}
