package com.example.ticketCompra.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Data
@Getter
@Setter
public class CD {

    private Long id;

    private String nombre;

    private LocalDate lanzamiento;

    private int duracion;

    private String genero;

    private double precio;

    private Artista artista;


    public CD(Long id, String nombre, LocalDate lanzamiento, int duracion, String genero, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.lanzamiento = lanzamiento;
        this.duracion = duracion;
        this.genero = genero;
        this.precio = precio;
    }

    public CD(Long id, String nombre, LocalDate lanzamiento, int duracion, String genero, double precio, Artista artista) {
        this.id = id;
        this.nombre = nombre;
        this.lanzamiento = lanzamiento;
        this.duracion = duracion;
        this.genero = genero;
        this.precio = precio;
        this.artista = artista;
    }
}
