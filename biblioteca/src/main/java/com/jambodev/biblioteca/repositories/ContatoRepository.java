package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jambodev.biblioteca.entities.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long>{
    
}