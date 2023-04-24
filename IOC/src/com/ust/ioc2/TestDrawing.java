package com.ust.ioc2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.ust.ioc.autowiring.B;

public class TestDrawing {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		B b = (B) context.getBean("b");
		System.out.println(b);
		context.registerShutdownHook();

		/*
		 * BeanFactory factory=new XmlBeanFactory(new FileSystemResource("beans.xml"));
		 * 
		 * Object obj=factory.getBean("line");//getbean is a super type Line
		 * li=(Line)obj;//to change to obj type we use this down cast li.Drawline();
		 */

		// ClassPathXmlApplicationContext context
		// ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		/*
		 * ConfigurableApplicationContext context=new
		 * ClassPathXmlApplicationContext("beans"); context.registerShutdownHook();
		 * 
		 * boolean exists=context.containsBean("line"); System.out.println(exists);
		 * if(exists) { Object object=context.getBean("line"); if(object instanceof
		 * Line) { Line l1=(Line)object; l1.Drawline(); }
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * Boolean type=context.isSingleton("line"); System.out.println(type); Object
		 * object1=context.getBean("line"); Object object2=context.getBean("line"); Line
		 * line1 =(Line)context.getBean("line"); Line
		 * line2=(Line)context.getBean("line"); if(line1.hashCode()==line2.hashCode()) {
		 * System.out.println("line is singleton"); } else {
		 * System.out.println("line is not a singleton"); }
		 */
	}

}
