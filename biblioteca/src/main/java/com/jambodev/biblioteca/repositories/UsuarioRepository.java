package com.jambodev.biblioteca.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jambodev.biblioteca.entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

    public Optional<Usuario> findByNome_usuario(String nome_usuario);

    public Optional<Usuario> findByEmail(String email);
    
}