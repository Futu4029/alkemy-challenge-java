package com.alkemychallenge.movies.persistencia;

import com.alkemychallenge.movies.model.Pelicula;
import com.alkemychallenge.movies.model.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Personaje, Long> {
}
