package com.alkemychallenge.movies.model;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Pelicula extends Show {

    public Pelicula(String image, String titulo, LocalDate fecha, Integer calificacion, List<Personaje> list){
        super(image, titulo, fecha, calificacion, list);
    }
}
