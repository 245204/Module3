package com.ust.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestLogin {
	public static void main(String[] args) {
//  Login login=new Login();
//	login.setUsername("Johndoe");
//	login.setPassword("winnyminny");
//	String result=login.validate();
//	System.out.println(result);
		
		BeanFactory factory=new XmlBeanFactory (new FileSystemResource("beans.xml"));
		
		Object obj=factory.getBean("connection"); //getBean is a inbuilt method
		Connection con=(Connection)obj; //we downcast the obj to make it to the connection
		System.out.println(obj);
		
		Object obj2=factory.getBean("Login");
		Login login =(Login)obj2;
		login.validate();
		
	}

	

}
