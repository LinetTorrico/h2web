package com.memorynotfound.springboot.controller;

import com.memorynotfound.springboot.model.Book;
import com.memorynotfound.springboot.repository.BookRepository;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/product")
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")
public class BookRestController {
    @Autowired
    BookRepository repository;



    @GetMapping("/books")
    public List<Book> getAllBooks() {
        System.out.println("Get all Customers...");

        List<Book> customers = new ArrayList<>();
        repository.findAll().forEach(customers::add);
        //customers.setStatus("OK");
        return customers;
    }
 /*   @GetMapping(value = "/allusers", produces = "application/json")
    public String getAll() {
        try {
            List<Map<String,Object>> result = reviewerListService.getAll();
            buildResponse.setData(result);
            buildResponse.setTotal(result.size());
            buildResponse.setStatus("OK");
            buildResponse.setSuccess("true");
        } catch (Exception e) {
            logger.error("Error getting all users", e);
            buildResponse.setStatus(Functions.getMessage(STATUS_STATUS_ERROR));
            buildResponse.setType(Functions.getMessage(STATUS_STATUS_ERROR));
            buildResponse.setSuccess(Functions.getMessage(ERROR));
        }
        return buildResponse.getResult();
    }
*/
    @GetMapping(value = "books/{Id}")
    public List<Book> findById(@PathVariable Long Id) {

        List<Book> customers = repository.findById(Id);
        return customers;
    }


}
