package com.jambodev.biblioteca.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.jambodev.biblioteca.repositories.UsuarioRepository;
import com.jambodev.biblioteca.entities.Usuario;

@Service
public class UsuarioService{
    @Autowired
    UsuarioRepository repository;
}