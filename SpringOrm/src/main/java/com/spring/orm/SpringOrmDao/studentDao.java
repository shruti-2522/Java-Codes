package com.spring.orm.SpringOrmDao;


import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.SpringOrm.entites.Student;

public class studentDao {

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	private HibernateTemplate hibernateTemplate;

  @Transactional
	public int insert(Student student) {
		Integer i = (Integer) this.hibernateTemplate.save(student);
		return i;
	}

}
