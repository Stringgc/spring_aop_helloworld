package com.spring.aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.aop.log.Log;
import com.spring.service.impl.FirstPrint;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		
		
		FirstPrint obj2 = (FirstPrint)context.getBean("FirstPrint");

	
		obj2.print();

	}

}
