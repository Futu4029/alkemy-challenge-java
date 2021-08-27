package com.alkemychallenge.movies.persistencia;

import com.alkemychallenge.movies.model.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenderRepository extends JpaRepository<Genero, Long> {}
