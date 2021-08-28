package com.alkemychallenge.movies.service;

import com.alkemychallenge.movies.model.Pelicula;
import java.util.List;

public interface PeliculaService {

    Pelicula getById(Long id);
    Pelicula save(Pelicula item);
    void deleteById(Long id);
    List<Pelicula> findAll();
}

