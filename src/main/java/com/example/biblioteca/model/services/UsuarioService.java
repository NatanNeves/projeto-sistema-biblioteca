package com.example.biblioteca.model.services;

import java.util.List;

import com.example.biblioteca.model.entities.Usuario;
import com.example.biblioteca.model.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    //buscar todos os usuarios
    public List<Usuario> findAll(){
        return repository.findAll();
    }
    //salvar usuario
    public Usuario save(Usuario usuario){
        return repository.save(usuario);
    }
    //deletar usuario
    public void delete(Integer id){
        repository.deleteById(id);
    }
    //atualizar usuario
    public Usuario update(Usuario usuario){
        return repository.save(usuario);
    }
    //buscar usuario por id
    public Usuario findById(Integer id){
        return repository.findById(id).get();
    }
}
