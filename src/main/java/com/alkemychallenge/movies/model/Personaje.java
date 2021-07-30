package com.alkemychallenge.movies.model;

import javax.persistence.*;

@Entity
public class Personaje {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String image;
    @Column(unique = true)
    private String nombre;
    private Integer edad;
    private Integer peso;
    private String historia;
    @OneToMany
    private Show peliOSerie;


    public Personaje(int id, String image, String nombre, Integer edad, Integer peso, String historia, Show peliOSerie) {
        this.id = id;
        this.image = image;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.historia = historia;
        this.peliOSerie = peliOSerie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public Show getPeliOSerie() {
        return peliOSerie;
    }

    public void setPeliOSerie(Show peliOSerie) {
        this.peliOSerie = peliOSerie;
    }
}
