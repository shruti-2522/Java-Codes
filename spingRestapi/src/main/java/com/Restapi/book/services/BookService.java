package com.Restapi.book.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PutMapping;

import com.Restapi.book.entities.Book;

@Component
public class BookService {

	private static List<Book> list = new ArrayList<>();

	static {
		list.add(new Book(1, "SADP", "Darekar Sir"));
		list.add(new Book(2, "Machine Learning", "Deore mam"));
		list.add(new Book(3, "Web Framework", "Shewale mam"));
	}

	// get all books

	public List<Book> getAllBook() {
		return list;

	}

	// get Single book by id
	public Book getBookById(int id) {
		Book b1 = null;
		try
		{
		b1 = list.stream().filter(e -> e.getBid() == id).findFirst().get();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return b1;
	}

	// Add Book
	public Book addBook(Book b) {
		list.add(b);
		return b;
	}

	// Delete Book

	public void delBook(int id) {
		list = list.stream().filter(book -> {
			if (book.getBid() != id) {
				return true;
			} else {
				return false;
			}

		}).collect(Collectors.toList());

	}

	// Update Book
	@PutMapping("/book/{id}")
	public void updateBook(Book b, int id) {
		list = list.stream().map(b1 -> {
			if (b.getBid() == id) {
				b.setBname(b.getBname());
				b.setAuthor(b.getAuthor());
			}
			return b;
		}).collect(Collectors.toList());
	}

}
