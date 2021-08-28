package com.alkemychallenge.movies.service;

import com.alkemychallenge.movies.model.Genero;
import java.util.List;

public interface GeneroService {

    Genero getById(Long id);
    Genero save(Genero item);
    void deleteById(Long id);
    List<Genero> findAll();

}
