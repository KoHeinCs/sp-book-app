package com.zawmoehtike.spbookstoreapp.controller;

import com.zawmoehtike.spbookstoreapp.domain.Book;
import com.zawmoehtike.spbookstoreapp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping(value = "/books", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    
    @GetMapping(value="/{id}")
    public Book findBookById(@PathVariable ("id") int id) {
    	return bookRepository.getOne(id);
    			
    }
}
