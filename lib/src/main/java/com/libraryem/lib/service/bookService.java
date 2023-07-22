package com.libraryem.lib.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.libraryem.lib.model.book;
import com.libraryem.lib.repository.bookRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class bookService {

    private final bookRepository repository;

    public List<book> obtenerTodosLosLibros() {
        return repository.findAll();
    }
    
}
