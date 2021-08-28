package com.alkemychallenge.movies.spring.controller.dto;

import com.alkemychallenge.movies.model.Pelicula;
import com.alkemychallenge.movies.model.Personaje;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Transformer{
    private static Transformer _transform;
    private Transformer(){}
    public static Transformer get_transform(){
        if(_transform == null){
            _transform = new Transformer();
            System.out.println("Tenemos el transformer");
        }
        return _transform;
    }

    public ArrayList<SimpleCharacter> charsToSimpleChars(ArrayList<Personaje> personajes){
        ArrayList<SimpleCharacter> response = new ArrayList<SimpleCharacter>();
        personajes.stream().map(e -> new SimpleCharacter(e.getImage(), e.getNombre())).collect(Collectors.toList());
        return response;
    }

    public List<SimpleMovie> moviesToSimpleMovies(ArrayList<Pelicula> movies){
        List<SimpleMovie> response = new ArrayList<SimpleMovie>();
        movies.stream().map(e -> new SimpleMovie(e.getId(), e.getImage(),e.getTitulo(),e.getFecha())).collect(Collectors.toList());
        return response;
    }
}

