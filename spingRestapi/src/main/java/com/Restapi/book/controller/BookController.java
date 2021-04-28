package com.Restapi.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Restapi.book.entities.Book;
import com.Restapi.book.services.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	//@RequestMapping(value="/books",method=RequestMethod.GET)
	//@ResponseBody
	@GetMapping("/books")
	public List<Book> getBook()
	{
		
		/*
		 * Book b=new Book(); b.setBid(1); b.setBname("Java Frameowrks");
		 * b.setAuthor("Durgesh Tiwari");
		 */
		return this.bookService.getAllBook();
	}
	
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable("id")int id)
	{
		return bookService.getBookById(id);
	}

}
