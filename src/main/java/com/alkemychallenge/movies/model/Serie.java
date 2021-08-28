package com.alkemychallenge.movies.model;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "show_type",
discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("serie")
public class Serie extends Show{

    public Serie(String image, String titulo, LocalDate fecha, Integer calificacion, ArrayList<Personaje> list){
        super(image, titulo, fecha, calificacion, list);
    }

    public Serie() { super(null,null,null,null,null); }
}
