package com.example.ticketCompra.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Artista {

    private Long id;

    private String nombre;

    private boolean activo;


    public Artista(Long id, String nombre, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.activo = activo;
    }
}
