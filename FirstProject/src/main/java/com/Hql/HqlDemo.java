package com.Hql;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.FirstProject.StudentInfo;

public class HqlDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();

		// HQL SYNTAX:

		// String query="from StudentInfo where city='Malegaon'";

		// Dynamic :
		//String query = "from StudentInfo where city=:x";
		
		//Alise
		String query = "from StudentInfo as s1 where s1.city=:x and s1.name=:n";
		
		Query q1 = s.createQuery(query);
		
		q1.setParameter("x", "Pachora");
		q1.setParameter("n", "Nikita Morankar");

		// Single-unique and
		// Multiple-list

		List<StudentInfo> list = q1.getResultList();
		for (StudentInfo stud : list) {
			System.out.println(stud.getName() + ":" + stud.getCert().getCourse());
		}

		s.close();

		factory.close();

	}
}