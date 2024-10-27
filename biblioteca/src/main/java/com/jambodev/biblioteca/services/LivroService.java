package com.jambodev.biblioteca.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.jambodev.biblioteca.repositories.LivroRepository;
import com.jambodev.biblioteca.entities.Livro;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService{
    @Autowired
    LivroRepository lr;

    public List<Livro> listarLivros(){
        return lr.findAll();
    }

    public Livro buscarLivro(Long id) throws Exception{
        Optional<Livro> livro_optional = lr.findById(id);
        if(livro_optional.isEmpty()){
            throw new Exception("Livro não existe.");
        }
        return livro_optional.get();
    }

    public Livro criarLivro(Livro livro){
        lr.save(livro);
        return livro;
    }

    public Livro atualizarLivro(Livro livro) throws Exception{
        Optional<Livro> livro_optional = lr.findById(livro.getId());
        if(livro_optional.isEmpty()){
            throw new Exception("Livro não existe.");
        }
        lr.save(livro);
        return livro;
    }

    public void deletarLivro(Livro livro) throws Exception{
        Optional<Livro> livro_optional = lr.findById(livro.getId());
        if(livro_optional.isEmpty()){
            throw new Exception("Livro não existe.");
        }
        lr.delete(livro);
    }
}