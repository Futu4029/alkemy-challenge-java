package com.alkemychallenge.movies.spring.controller.dto;

import com.alkemychallenge.movies.model.Pelicula;
import com.alkemychallenge.movies.model.Personaje;

import javax.persistence.Column;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PeliculaDTO {
    private int id;
    private String image;
    private String titulo;
    private LocalDate fecha = LocalDate.now();
    private Integer calificacion;
    private List<Personaje> list = new ArrayList<Personaje>();

    public PeliculaDTO(int id, String image, String titulo, LocalDate fecha, Integer calificacion, List<Personaje> list) {
        this.id = id;
        this.image = image;
        this.titulo = titulo;
        this.fecha = fecha;
        this.calificacion = calificacion;
        this.list = list;
    }

    public PeliculaDTO desdeModelo(Pelicula pelicula){
        return new PeliculaDTO(pelicula.getId(), pelicula.getImage(), pelicula.getTitulo(), pelicula.getFecha(), pelicula.getCalificacion(), pelicula.getArrayList());
    }

    public Pelicula aModelo(){
        return new Pelicula(this.image, this.titulo, this.fecha, this.calificacion, this.list);
    }
}
