package com.alkemychallenge.movies.persistencia;

import com.alkemychallenge.movies.model.Pelicula;
import com.alkemychallenge.movies.model.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<Personaje, Long> {}
