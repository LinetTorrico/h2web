package com.memorynotfound.springboot;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping("/product")
//@Api(value="onlinestore", description="Operations pertaining to products in Online Store")
public class BookRestController {
    @Autowired
    BookRepository repository;

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        System.out.println("Get all Customers...");

        List<Book> customers = new ArrayList<>();
        repository.findAll().forEach(customers::add);

        return customers;
    }


    @GetMapping(value = "books/{Id}")
    public List<Book> findById(@PathVariable Long Id) {

        List<Book> customers = repository.findById(Id);
        return customers;
    }


}
