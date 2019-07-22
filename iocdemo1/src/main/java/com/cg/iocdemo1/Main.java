package com.cg.iocdemo1;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//Address address = context.getBean("address", Address.class);
Resource rs= new ClassPathResource("spring.xml");
XmlBeanFactory factory = new XmlBeanFactory(rs);
		// Get Bean of Type Employee AND ID emp
		Employee emp = factory.getBean("emp", Employee.class);

		// Get Bean with ID emp, but DON'T assign Type
		Employee emp2 = (Employee) factory.getBean("emp");

		System.out.println("Emp :" + emp.hashCode());
		System.out.println("Emp2 :" + emp2.hashCode());
		System.out.println("First Phone: "+emp.getContacts().get(0));
		System.out.println(""+emp.getAddress().getCity());
		System.out.println();
	}

	}


