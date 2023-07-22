package com.libraryem.lib.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.libraryem.lib.model.Book;


public interface BookRepository extends JpaRepository<Book, Integer> {

    
}
