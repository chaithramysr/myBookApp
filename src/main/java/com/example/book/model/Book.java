package com.example.book.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "bookData")
@Getter
@Setter
public class Book {
    @Id
    private int id;
    private String name;
    private double price;
    private String author;
    private int quantity;
}
