package com.diegoinc.biblioteca.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.diegoinc.biblioteca.model.Libro;

public interface LibroRepository extends JpaRepository<Libro,Integer>{
    
}
