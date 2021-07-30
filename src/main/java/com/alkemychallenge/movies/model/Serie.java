package com.alkemychallenge.movies.model;


import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.ArrayList;

@Entity
public class Serie extends Show{

    public Serie(String image, String titulo, LocalDate fecha, Integer calificacion, ArrayList<Personaje> list){
        super(image, titulo, fecha, calificacion, list);
    }

}
