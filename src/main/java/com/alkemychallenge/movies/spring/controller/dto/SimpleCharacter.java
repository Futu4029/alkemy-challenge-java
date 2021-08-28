package com.alkemychallenge.movies.spring.controller.dto;

class SimpleCharacter{
    private String image;
    private String nombre;

    public SimpleCharacter(String image, String nombre){
        this.image = image;
        this.nombre = nombre;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
