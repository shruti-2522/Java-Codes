package com.Restapi.book.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.Restapi.book.entities.Book;

@Component
public class BookService {

	private static List<Book> list=new ArrayList<>();
	
	static
	{
		list.add(new Book(1,"SADP","Darekar Sir"));
		list.add(new Book(2,"Machine Learning","Deore mam"));
		list.add(new Book(3,"Web Framework","Shewale mam"));
	}
	
	
	//get all books
	
	public List<Book> getAllBook(){
		return list;
		
	}
	
	//get Single book by id
	public Book getBookById(int id)
	{
		Book b1=null;
		b1=list.stream().filter(e->e.getBid()==id).findFirst().get();
		return b1;
	}
	
	//Add Book
	public  Book addBook(Book b)
	{
		list.add(b);
		return b;
	}
	
	
}
