package com.alkemychallenge.movies.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "show_type",
        discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("pelicula")
public class Pelicula extends Show {

    public Pelicula(String image, String titulo, LocalDate fecha, Integer calificacion, List<Personaje> list){
        super(image, titulo, fecha, calificacion, list);
    }

    public Pelicula(){ super(null, null, null, null, null);}
}
