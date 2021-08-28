package com.alkemychallenge.movies.persistencia;

import com.alkemychallenge.movies.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TvShowRepository extends JpaRepository<Serie, Long> {}