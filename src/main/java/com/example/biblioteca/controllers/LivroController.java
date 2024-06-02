package com.example.biblioteca.controllers;

import com.example.biblioteca.model.entities.Livro;
import com.example.biblioteca.model.services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    //buscar todos os livros
    @GetMapping
    public ResponseEntity<List<Livro>> listar() {
        List<Livro> livros = livroService.findAll();
        if (livros.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(livros);
        }
    }

    // Salvar livro
    @PostMapping
    public ResponseEntity<Livro> salvar(@RequestBody Livro livro) {
        Livro savedLivro = livroService.save(livro);
        return new ResponseEntity<>(savedLivro, HttpStatus.CREATED);
    }

    // Deletar livro
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id) {
        livroService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Atualizar livro
    @PutMapping("/{id}")
    public ResponseEntity<Livro> atualizar(@PathVariable Integer id, @RequestBody Livro livro) {
        Livro updatedLivro = livroService.update(id, livro);
        if (updatedLivro != null) {
            return new ResponseEntity<>(updatedLivro, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Buscar livro por id
    @GetMapping("/{id}")
    public ResponseEntity<Livro> buscarPorId(@PathVariable Integer id) {
        Livro livro = livroService.findById(id);
        if (livro != null) {
            return new ResponseEntity<>(livro, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
