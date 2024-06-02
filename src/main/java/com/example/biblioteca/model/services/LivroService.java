package com.example.biblioteca.model.services;

import com.example.biblioteca.model.entities.Livro;
import com.example.biblioteca.model.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository repository;

    //buscar todos os livros
    public List<Livro> findAll(){
        return repository.findAll();
    }

    //buscar livro por id
    public Livro findById(Integer id){
        return repository.findById(id).get();
    }

    //salvar livro
    public Livro save(Livro livro){
        return repository.save(livro);
    }
    //deletar livro
    public void delete(Integer id){
        repository.deleteById(id);
    }
    //atualizar livro
    public Livro update(Integer id, Livro livro){
        return repository.save(livro);
    }
}
