package com.exmple.api.entities;



public class Book {
	
	private int bid;

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", bprice=" + bprice + "]";
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int bid, String bname, int bprice) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bprice = bprice;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public int getBprice() {
		return bprice;
	}

	public void setBprice(int bprice) {
		this.bprice = bprice;
	}

	private String bname;
	private int bprice;

}
