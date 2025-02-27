package com.jambodev.biblioteca.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jambodev.biblioteca.entities.Usuario;
import com.jambodev.biblioteca.repositories.UsuarioRepository;

@Service
public class UsuarioService{

    @Autowired
    UsuarioRepository ur;

    public Usuario cadastro(String nome, String email, String senha, String nome_usuario) {
        return ur.save(new Usuario(nome, email, senha, nome_usuario));
    }

    public void login(String email, String senha) throws Exception {
        throw new Exception("Essa funcionalidade não está implementada!");
    }

    public void deletar(String email, String senha) {
        ur.deleteById(null);
    }

    public Usuario Perfil(String username) throws Exception {
        var opt = ur.findByNome_usuario(username);
        if (opt.isEmpty()) throw new Exception("Usuario nao encontrado");
         
        return opt.get();
    }

}