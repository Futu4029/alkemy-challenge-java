package com.alkemychallenge.movies.persistencia;

import com.alkemychallenge.movies.model.Genero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenderRepository extends JpaRepository<Genero, Long> {
}
