package com.example.api.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.services.BookService;
import com.exmple.api.entities.Book;

//@Controller

@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	// @RequestMapping(value="/books",method = RequestMethod.GET)

	@GetMapping("/books")
	// @ResponseBody
	public List<Book> book() {

		/*
		 * Book b1=new Book(); b1.setBid(1); b1.setBname("Web Framework");
		 * b1.setBprice(200);
		 */

		return this.bookService.getAllBooks();
	}
	
	//Get book by id
	
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable int id)
	{
		return bookService.getBookById(id);
		
	}
	
	@PostMapping("/books")
	public Book addBook(@RequestBody Book b1)
	{
		Book b=this.bookService.addBook(b1);
		System.out.println(b);
		return b;
	}
	
}
