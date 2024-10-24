package com.jambodev.biblioteca.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.jambodev.biblioteca.repositories.ContatoRepository;
import com.jambodev.biblioteca.entities.Contato;

@Service
public class ContatoService{
    @Autowired
    ContatoRepository repository;
}