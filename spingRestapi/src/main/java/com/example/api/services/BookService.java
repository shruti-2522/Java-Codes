package com.example.api.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.exmple.api.entities.Book;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@Component
public class BookService {

	public static List<Book> books = new ArrayList<>();
	static {
		books.add(new Book(1, "Web Framework", 200));
		books.add(new Book(2, "SADP", 200));
		books.add(new Book(3, "Machine Learning", 300));
	}

	// get all books
	public List<Book> getAllBooks() {
		return books;
	}

	// get Single Book By id
	public Book getBookById(int id) {
		Book b2 = null;
		b2 = books.stream().filter(e -> e.getBid() == id).findFirst().get();
		return b2;
	}
	
	//adding the book
	public Book addBook(Book b)
	{
		books.add(b);
		return b;
	}

}
