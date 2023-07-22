package com.libraryem.lib.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.libraryem.lib.model.book;


public interface bookRepository extends JpaRepository<book, Long> {

    
}
