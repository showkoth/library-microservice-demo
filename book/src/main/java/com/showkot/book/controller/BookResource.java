package com.showkot.book.controller;


import com.showkot.book.model.Book;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;


@RestController
@RequestMapping("/api")
public class BookResource {

    ConcurrentMap<String, Book> books = new ConcurrentHashMap<>();

    @GetMapping("/book/{id}")
    public Book getBook(@PathVariable String id){
        return books.get(id);
    }

    @GetMapping("/book")
    public List<Book> getAllBooks(){
        return new ArrayList<Book>(books.values());
    }

    @PostMapping("/book")
    public Book addBook(@RequestBody Book book){
        books.put(book.getBookId(), book);
        return book;
    }

}
