package com.alkemychallenge.movies;

import com.alkemychallenge.movies.model.Genero;
import com.alkemychallenge.movies.model.Pelicula;
import com.alkemychallenge.movies.persistencia.dao.jdbc.hibernate.HibernateGeneroDAO;
import com.alkemychallenge.movies.service.impl.GeneroServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

public class GeneroServiceTest {

    HibernateGeneroDAO generoDAO = new HibernateGeneroDAO();
    GeneroServiceImpl generoService = new GeneroServiceImpl(generoDAO);
    Pelicula peliTest;
    @BeforeEach
    void setup(){
        peliTest = new Pelicula("asd", "Bates Motel", LocalDate.now(),4, new ArrayList());
    }

    @Test
    void testCrearGenero(){
        Genero generoTest = new Genero(1, "Terror", "asd", peliTest);
        generoService.crear(generoTest);

    }
}
