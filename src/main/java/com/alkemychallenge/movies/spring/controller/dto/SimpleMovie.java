package com.alkemychallenge.movies.spring.controller.dto;

import java.time.LocalDate;

public class SimpleMovie{
    private int id;
    private String image;
    private String titulo;
    private LocalDate fecha;

    public SimpleMovie(int id, String image, String titulo, LocalDate fecha){
        this.id = id;
        this.image = image;
        this.titulo = titulo;
        this.fecha = fecha;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}