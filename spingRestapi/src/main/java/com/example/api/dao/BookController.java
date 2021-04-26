package com.example.api.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<List<Book>> book() {

		/*
		 * Book b1=new Book(); b1.setBid(1); b1.setBname("Web Framework");
		 * b1.setBprice(200);
		 */

		 List<Book> list=bookService.getAllBooks();
		 if(list.size()<=0)
		 {
			 return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		 }
		 return ResponseEntity.of(Optional.of(list));
	}
	
	
	//Get book by id
	
	@GetMapping("/books/{id}")
	public ResponseEntity<Book> getBook(@PathVariable int id)
	{
		Book b2=bookService.getBookById(id);
		if(b2==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		 return ResponseEntity.of(Optional.of(b2));
		
	}
	
	@PostMapping("/books")
	public ResponseEntity<Book> addBook(@RequestBody Book b1)
	{
		Book b=null;
		try
		{
		b=this.bookService.addBook(b1);
		System.out.println(b);
		return ResponseEntity.of(Optional.of(b));
		}
		catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
	//Delete Book Handler
	@DeleteMapping("books/{bid}")
	public ResponseEntity<Void> delBook(@PathVariable("bid") int id)
	{
		try
		{
		this.bookService.delBook(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		
		}
		catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			
		}
		
	}
	
	//update book handler
	@PutMapping("/books/{bid}")
	public ResponseEntity<Book> updateBook(@RequestBody Book b1,@PathVariable("bid") int id)
	{
		try
		{
		this.bookService.updateBook(b1,id);
		return ResponseEntity.ok().body(b1);
		}
		
		catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}
