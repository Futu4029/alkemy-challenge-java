package com.alkemychallenge.movies;

import com.alkemychallenge.movies.model.Genero;
import com.alkemychallenge.movies.model.Pelicula;
import com.alkemychallenge.movies.model.Show;
import com.alkemychallenge.movies.persistencia.GenderRepository;
import com.alkemychallenge.movies.persistencia.hibernate.HibernateGeneroDAO;
import com.alkemychallenge.movies.service.impl.GeneroServiceImpl;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.util.ArrayList;

public class GeneroServiceTest extends HibernateGeneroDAO {

    Pelicula peliTest;
    ArrayList<Show> listaDePelis;
    GenderRepository genderRepository = Mockito.mock(GenderRepository.class);
    GeneroServiceImpl generoService= new GeneroServiceImpl(genderRepository);
    @BeforeEach
    void setup(){
        peliTest = new Pelicula("asd", "Bates Motel", LocalDate.now(),4, new ArrayList());
        listaDePelis = new ArrayList<Show>();
    }

    @Test
    void testCrearGenero(){
        Genero generoTest = new Genero("Terror", "asd", listaDePelis);
        genderRepository.save(generoTest);
        Assertions.assertEquals("Terror", generoService.findAll().get(0).getNombre());
    }
}
