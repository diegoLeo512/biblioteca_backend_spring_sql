package com.diegoinc.biblioteca.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diegoinc.biblioteca.model.Libro;
import com.diegoinc.biblioteca.service.LibroService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/libro")
@RequiredArgsConstructor
public class LibroController {

    private final LibroService libroService;
     
    @GetMapping
    public ResponseEntity<List<Libro>> obtenerTodosLosLibros() {
        List<Libro> libros = libroService.obtenerTodosLosLibros();

        return new ResponseEntity<>(libros, HttpStatus.OK);
    }
    
}
