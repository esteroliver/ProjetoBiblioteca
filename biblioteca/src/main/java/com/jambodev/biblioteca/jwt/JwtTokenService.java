package com.jambodev.biblioteca.jwt;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.jambodev.biblioteca.user_details.UsuarioDetails;

@Service
public class JwtTokenService {
    private static final String SECRET_KEY = "cc68a05ab508e923b41e10e94c85ea11768fd86ef958188deae43f8f298d342f";
    private static final String ISSUER = "jambodev-biblio-api";

    private Instant creationDate(){
        return ZonedDateTime.now(ZoneId.of("America/Recife")).toInstant();
    }

    private Instant expirationDate(){
        return ZonedDateTime.now(ZoneId.of("America/Recife")).plusDays(2).toInstant();
    }

    public String generateToken(UsuarioDetails usuario){
        try{
            Algorithm alg = Algorithm.HMAC256(SECRET_KEY);
            return JWT.create()
                    .withIssuer(ISSUER)
                    .withIssuedAt(creationDate())
                    .withExpiresAt(expirationDate())
                    .withSubject(usuario.getUsername())
                    .sign(alg);
        } catch (JWTCreationException exception) {
            throw new JWTCreationException("Erro ao gerar token.", exception);
        }
    }

    public String getSubjectFromToken(String token){
        try{
            Algorithm alg = Algorithm.HMAC256(SECRET_KEY);
            return JWT.require(alg)
                    .withIssuer(ISSUER)
                    .build()
                    .verify(token)
                    .getSubject();
        } catch (JWTVerificationException exception) {
            throw new JWTVerificationException("Token inválido ou expirado.");
        }
    }

}
