package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.SpringOrm.entites.Student;
import com.spring.orm.SpringOrmDao.studentDao;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		studentDao studentdao = context.getBean("studentDao", studentDao.class);

		Student s = new Student(1, "Shruti Amrutkar", "Dhule");
		int r = studentdao.insert(s);
		System.out.println("Data Inserted" + r);

	}
}
