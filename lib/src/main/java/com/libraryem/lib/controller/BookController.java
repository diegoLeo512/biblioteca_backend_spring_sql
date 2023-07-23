package com.libraryem.lib.controller;

import org.springframework.web.bind.annotation.RestController;

import com.libraryem.lib.model.Book;
import com.libraryem.lib.service.BookService;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {
     private final BookService libroService;
    @GetMapping
    public ResponseEntity<List<Book>> obtenerTodosLosLibros() {
        List<Book> libros = libroService.obtenerTodosLosLibros();

        return new ResponseEntity<>(libros, HttpStatus.OK);
    }

}
