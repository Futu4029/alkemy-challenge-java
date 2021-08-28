package com.alkemychallenge.movies.service;

import com.alkemychallenge.movies.model.Serie;
import java.util.List;

public interface SerieService {
    Serie getById(Long id);
    Serie save(Serie item);
    void deleteById(Long id);
    List<Serie> findAll();
}
