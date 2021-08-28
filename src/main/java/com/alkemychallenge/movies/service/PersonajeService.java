package com.alkemychallenge.movies.service;

import com.alkemychallenge.movies.model.Personaje;

import java.util.List;

public interface PersonajeService {
    Personaje getById(Long id);
    Personaje save(Personaje item);
    void deleteById(Long id);
    List<Personaje> findAll();
}
