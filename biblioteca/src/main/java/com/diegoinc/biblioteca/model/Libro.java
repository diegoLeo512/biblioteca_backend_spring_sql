package com.diegoinc.biblioteca.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "books")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    
    String nombre;

    String autor;

    Integer paginas;
    
    Integer unidades_disp;
    
}
