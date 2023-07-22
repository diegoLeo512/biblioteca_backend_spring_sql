package com.libraryem.lib.model;


import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import javax.persistence.Table;
import javax.persistence.Entity;


import lombok.Data;

@Data
@Entity
@Table(name = "books")
public class Book {
    @Id
    Integer id;
    @NotNull
    @NotBlank
    String nombre;

    String autor;

    Integer paginas;
    
    @NotNull
    @NotBlank
    Integer unidades_disp;
    
}
