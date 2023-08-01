package com.diegoinc.biblioteca.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.diegoinc.biblioteca.model.Libro;
import com.diegoinc.biblioteca.repository.LibroRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class LibroService {
    LibroRepository libroRep;

    public List<Libro> obtenerTodosLosLibros() {

       
        return libroRep.findAll();
    }
    
}
