package com.jambodev.biblioteca.user_details;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.jambodev.biblioteca.entities.Usuario;

import lombok.Getter;

@Getter
public class UsuarioDetails implements UserDetails{

    private Usuario usuario;

    public UsuarioDetails(Usuario usuario){
        this.usuario = usuario;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("USUARIO"));
    }

    @Override
    public String getUsername() {
        return usuario.getNome_usuario();
    }

    @Override 
    public String getPassword(){
        return usuario.getSenha();
    }
}
