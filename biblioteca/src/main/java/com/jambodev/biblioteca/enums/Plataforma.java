package com.jambodev.biblioteca.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Plataforma {
    DISCORD("Discord"),
    INSTAGRAM("Instagram"),
    WHATSAPP("Whatsapp");

    private String valor;
}
