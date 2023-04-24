package com.ust.ioc.autowiring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Qualifier;

public class B {
	
	A a;
	
	public B(A a) {
		this.a=a;
		System.out.println("from B()constructor......");
	}
	@Qualifier("a")
	public void setA(A a) {
		//set method is used to set the value
		System.out.println("setA() called..");
		this.a=a;
	}

	public B() {
	
	}
	
	@PostConstruct //same as init method()
	public void setUp() {
		System.out.println("from setUp()........");
	}
	@PreDestroy
	public void windup() {
		System.out.println("from windup().......");
	}
	
	
}
