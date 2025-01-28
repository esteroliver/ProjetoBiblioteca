package com.jambodev.biblioteca.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
    public static final String [] ENDPOINTS_WITH_AUTHENTICATION_NOT_REQUIRED = {
        "/usuarios/login", //url que usaremos para fazer login
        "/usuarios" //url que usaremos para criar um usuário
    };
}
