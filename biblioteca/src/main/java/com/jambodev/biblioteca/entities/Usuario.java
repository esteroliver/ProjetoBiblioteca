package com.jambodev.biblioteca.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity @Data
public class Usuario {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String senha;
    private String localizacao;

    public Usuario(String nome, String email, String senha, String localizacao) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.localizacao = localizacao;
    }

}
