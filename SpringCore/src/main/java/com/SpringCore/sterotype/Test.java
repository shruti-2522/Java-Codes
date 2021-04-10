package com.SpringCore.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/SpringCore/sterotype/stereoconfig.xml");
		Student s=context.getBean("student",Student.class);
		System.out.println(s);
		System.out.println(s.getAddr());
	}
	

}
