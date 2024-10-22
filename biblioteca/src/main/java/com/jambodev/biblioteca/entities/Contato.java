package com.jambodev.biblioteca.entities;

import com.jambodev.biblioteca.enums.Plataforma;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity @Data
public class Contato {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Plataforma plataforma;
    private String arroba;

    @ManyToOne
    private Usuario usuario;
}
