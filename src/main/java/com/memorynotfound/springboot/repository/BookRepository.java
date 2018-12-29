package com.memorynotfound.springboot.repository;

import com.memorynotfound.springboot.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findById(Long Id);
}
