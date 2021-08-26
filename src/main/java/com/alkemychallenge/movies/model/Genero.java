package com.alkemychallenge.movies.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private String nombre;
    private String image;
    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    private List<Show> pelisOSeries;

    public Genero(String nombre, String image, List<Show> peliOSerie){
        this.nombre = nombre;
        this.image = image;
        this.pelisOSeries = peliOSerie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Show> getPelisOSeries() {
        return pelisOSeries;
    }

    public void setPelisOSeries(List<Show> pelisOSeries) {
        this.pelisOSeries = pelisOSeries;
    }
}
