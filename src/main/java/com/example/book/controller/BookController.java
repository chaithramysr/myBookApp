package com.example.book.controller;

import com.example.book.model.Book;
import com.example.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping(value = "/")
    public String greet() {
        return "Welcome to Book Seller";
    }

    @PostMapping(value = "/addBook", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Book addBook(@RequestBody Book book) {
         return bookService.addBook(book);
    }

    @GetMapping(value = "/getBookById/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Book getBookById(@PathVariable("id") int bookid) {
        return bookService.getBooks(bookid);
    }

    @GetMapping(value = "/getAllBooks",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }


}
