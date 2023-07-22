package com.libraryem.lib.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.libraryem.lib.model.Book;
import com.libraryem.lib.repository.BookRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository repository;

    public List<Book> obtenerTodosLosLibros() {
        return repository.findAll();
    }
    
}
