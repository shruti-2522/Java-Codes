package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entities.Student;

public class studentDaoImpl implements studentDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student student) {

		// Insert Query
		String query = "insert into student(id,name,city)values(?,?,?)";
		int r = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());

		return r;
	}

	public int change(Student student) {

		// Update Query

		String query1 = "update student set name=?,city=? where id=?";
		int res = this.jdbcTemplate.update(query1, student.getName(), student.getCity(), student.getId());

		return res;
	}

	@Override
	public int delete(Student student) {
		// Delete Query

		String query2 = "delete from student where id=?";
		int res = this.jdbcTemplate.update(query2, student.getId());
		return res;
	}

}
