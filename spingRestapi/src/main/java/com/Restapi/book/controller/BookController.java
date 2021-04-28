package com.Restapi.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	// @RequestMapping(value="/books",method=RequestMethod.GET)
	// @ResponseBody

	// get ALL Book Handler
	@GetMapping("/books")
	public List<Book> getBook() {

		/*
		 * Book b=new Book(); b.setBid(1); b.setBname("Java Frameowrks");
		 * b.setAuthor("Durgesh Tiwari");
		 */
		return this.bookService.getAllBook();
	}

	// get Single book Hnadler
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable("id") int id) {
		return bookService.getBookById(id);
	}

	// Create Book Hnadler
	@PostMapping("/books")
	public Book addBook(@RequestBody Book b1) {
		Book b = this.bookService.addBook(b1);
		return b;
	}

	// Delete book handler:
	@DeleteMapping("/books/{id}")
	public void delBook(@PathVariable("id") int id) {
		this.bookService.delBook(id);
	}

	// Update Book Handler
	@PutMapping("/books/{id}")
	public Book updatBook(@RequestBody Book book, @PathVariable("id") int id) {

		this.bookService.updateBook(book, id);
		return book;
	}
}