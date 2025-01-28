package com.jambodev.biblioteca.user_details;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jambodev.biblioteca.entities.Usuario;
import com.jambodev.biblioteca.repositories.UsuarioRepository;

@Service
public class UsuarioDetailsService implements UserDetailsService {

    @Autowired
    UsuarioRepository ur;

    @Override
    public UsuarioDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        Optional<Usuario> usuario = ur.findByNome_usuario(username);
        if(usuario.isEmpty()){
            throw new UsernameNotFoundException("Esse usuário não foi encontrado: " + username);
        }
        UsuarioDetails usuario_details = new UsuarioDetails(usuario.get());
        return usuario_details;
    }
}
