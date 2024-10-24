package com.jambodev.biblioteca.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.jambodev.biblioteca.repositories.LivroRepository;
import com.jambodev.biblioteca.entities.Livro;

@Service
public class LivroService{
    @Autowired
    LivroRepository repository;
}