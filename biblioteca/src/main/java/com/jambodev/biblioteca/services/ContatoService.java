package com.jambodev.biblioteca.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.jambodev.biblioteca.repositories.ContatoRepository;
import com.jambodev.biblioteca.entities.Contato;
import java.util.List;
import java.util.Optional;

@Service
public class ContatoService{
    @Autowired
    ContatoRepository cr;

    public List<Contato> listarContatos(){
        return cr.findAll();
    }

    public Contato buscarContato(Long id) throws Exception {
        Optional<Contato> contato_optional = cr.findById(id);
        if(contato_optional.isEmpty()){
            throw new Exception("Contato não existe.");
        }
        return contato_optional.get();
    }

    public Contato criarContato(Contato contato){
        cr.save(contato);
        return contato;
    }

    public Contato atualizarContato(Contato contato) throws Exception{
        Optional<Contato> contato_optional = cr.findById(contato.getId());
        if(contato_optional.isEmpty()){
            throw new Exception("Contato não existe.");
        }
        cr.save(contato);
        return contato;
    }

    public void deletarContato(Contato contato) throws Exception{
        Optional<Contato> contato_optional = cr.findById(contato.getId());
        if(contato_optional.isEmpty()){
            throw new Exception("Contato não existe.");
        }
        cr.delete(contato);
    }
}