package com.example.biblioteca.model.repositories;

import com.example.biblioteca.model.entities.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Integer>{
}
