package com.jambodev.biblioteca.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.jambodev.biblioteca.entities.Livro;
import com.jambodev.biblioteca.services.LivroService;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/livros")
public class LivroController {
    @Autowired
    LivroService ls;

    @GetMapping("")
    public List<Livro> getMethodName() {
        return ls.listarLivros();
    }
    
}
