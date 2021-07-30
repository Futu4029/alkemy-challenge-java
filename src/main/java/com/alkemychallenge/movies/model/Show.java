package com.alkemychallenge.movies.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@MappedSuperclass
public abstract class Show {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String image;
    @Column(unique = true)
    private String titulo;
    private LocalDate fecha = LocalDate.now();
    private Integer calificacion;
    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    private List<Personaje> list = new ArrayList<Personaje>();

    public Show(String image, String titulo, LocalDate fecha, Integer calificacion, List<Personaje> list){
        this.image = image;
        this.titulo = titulo;
        this.fecha = fecha;
        this.calificacion = calificacion;
        this.list = list;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() { return id; }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public List<Personaje> getArrayList() {
        return list;
    }

    public void setArrayList(ArrayList<Personaje> arrayList) {
        this.list = arrayList;
    }
}
