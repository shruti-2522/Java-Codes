package com.Restapi.book.entities;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	private String fname;
	private String lname;
	private String lang;

	@Override
	public String toString() {
		return "Author [aid=" + aid + ", fname=" + fname + ", lname=" + lname + ", lang=" + lang + "]";
	}

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Author(int aid, String fname, String lname, String lang) {
		super();
		this.aid = aid;
		this.fname = fname;
		this.lname = lname;
		this.lang = lang;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}
}
