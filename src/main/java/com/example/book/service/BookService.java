package com.example.book.service;

import com.example.book.model.Book;
import com.example.book.repository.BookRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookService {

    @Autowired
    private BookRespository bookRespository;


    public Book addBook(Book book) {
        Book bookData=bookRespository.save(book);
        return bookData;
    }

    public Book getBooks(int bookid) {
        return bookRespository.findById(bookid).get();
    }

    public List<Book> getAllBooks() {
        return bookRespository.findAll();
    }

    public List<Book> getBookDetailsWithPagination(int page, int size) {
        return bookRespository.findAll(Pageable.ofSize(size).withPage(page)).getContent();
    }
}
