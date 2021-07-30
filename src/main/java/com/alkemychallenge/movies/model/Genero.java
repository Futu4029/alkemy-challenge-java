package com.alkemychallenge.movies.model;

import javax.persistence.*;

@Entity
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(unique = true)
    private String nombre;
    private String image;
    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    private Show peliOSerie;

    public Genero(int id, String nombre, String image, Show peliOSerie){
        this.id = id;
        this.nombre = nombre;
        this.image = image;
        this.peliOSerie = peliOSerie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Show getPeliOSerie() {
        return peliOSerie;
    }

    public void setPeliOSerie(Show peliOSerie) {
        this.peliOSerie = peliOSerie;
    }
}
