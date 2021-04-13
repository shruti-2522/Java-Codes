package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.studentDao;
import com.spring.jdbc.entities.Student;

public class App {

	public static void main(String[] args) {

		// Spring JDBC
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		JdbcTemplate temp = context.getBean("jdbcTemplate", JdbcTemplate.class);

		/*
		 * //Insert Query String
		 * query="insert into student(id,name,city) values(?,?,?)";
		 * 
		 * //Fire Query: int r=temp.update(query,4,"Pradhunya Shewale","Tehre");
		 * System.out.println("Number Of Record Inserted.."+ r);
		 */

		studentDao studentDao = context.getBean("studentDao", studentDao.class);

		Student student = new Student();
		student.setId(7);
		student.setName("Lajari Borse");
		student.setCity("Lakhmapur");

		int result = studentDao.insert(student);
		System.out.println("Data Inserted..."+result);

	}
}
