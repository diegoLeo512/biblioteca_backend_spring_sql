package com.libraryem.lib.controller;

import org.springframework.web.bind.annotation.RestController;

import com.libraryem.lib.model.book;
import com.libraryem.lib.service.bookService;

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
     private final bookService libroService;
    @GetMapping
    public ResponseEntity<List<book>> obtenerTodosLosLibros() {
        List<book> libros = libroService.obtenerTodosLosLibros();

        return new ResponseEntity<>(libros, HttpStatus.OK);
    }

}
