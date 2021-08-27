package com.alkemychallenge.movies.persistencia;

import com.alkemychallenge.movies.model.Genero;
import com.alkemychallenge.movies.model.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Pelicula, Long> {}
