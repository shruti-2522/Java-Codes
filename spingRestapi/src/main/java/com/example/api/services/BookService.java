package com.example.api.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

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
		try
		{
		b2 = books.stream().filter(e -> e.getBid() == id).findFirst().get();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return b2;
	}

	// adding the book
	public Book addBook(Book b) {
		books.add(b);
		return b;
	}

	// Delete book

	public void delBook(int bid) {
		books.stream().filter(book->book.getBid() != bid).collect(Collectors.toList());
		
	}
		/*books.stream().filter(book -> {
			if (book.getBid() != bid) {
				return true;
			} else {
				return false;
			}

		}).collect(Collectors.toList());
	}*/
	
	
	//Update the book
	public void updateBook(Book book,int id)
	{
	books=books.stream().map(b->{
			if(b.getBid()==id)
			{
				b.setBname(book.getBname());
				b.setBprice(book.getBprice());
			}
			return b;
		}).collect(Collectors.toList());
	}
	
}
