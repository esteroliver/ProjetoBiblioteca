package com.jambodev.biblioteca.component;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.filter.OncePerRequestFilter;

import com.jambodev.biblioteca.configuration.SecurityConfiguration;
import com.jambodev.biblioteca.jwt.JwtTokenService;
import com.jambodev.biblioteca.repositories.UsuarioRepository;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UserAuthenticationFilter extends OncePerRequestFilter {
    
    @Autowired
    private JwtTokenService jwt_ts;

    @Autowired
    private UsuarioRepository ur;

    private boolean checkIfEndpointIsNotPublic(HttpServletRequest request){
        String request_url = request.getRequestURI();
        return !Arrays.asList(SecurityConfiguration.ENDPOINTS_WITH_AUTHENTICATION_NOT_REQUIRED).contains(request_url);
    }

    private String recoveryToken(HttpServletRequest request){
        String header = request.getHeader("Authorization");
        if (header != null){
            return header.replace("Bearer ", "");
        }
        return null;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterchain) throws ServletException, IOException {
        if (checkIfEndpointIsNotPublic(request)) {
            String token = recoveryToken(request);
            if (token != null) {
                // TO DO
            }
        }
    }
}
