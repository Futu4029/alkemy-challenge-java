package com.alkemychallenge.movies;

import com.alkemychallenge.movies.model.Genero;
import com.alkemychallenge.movies.model.Pelicula;
import com.alkemychallenge.movies.model.Serie;
import com.alkemychallenge.movies.persistencia.GenderRepository;
import com.alkemychallenge.movies.service.JPA.GeneroServiceImpl;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class GeneroServiceTest{

    Pelicula peliTest;
    ArrayList<Pelicula> listaDePelis = Lists.newArrayList(new Pelicula("url", "Bates Motel", LocalDate.now(),4, new ArrayList()));
    ArrayList<Serie> listaDeSerie = Lists.newArrayList(new Serie("url", "Hannibal", LocalDate.now(),4, new ArrayList()));
    GenderRepository genderRepository = Mockito.mock(GenderRepository.class);
    GeneroServiceImpl generoService= new GeneroServiceImpl(genderRepository);

    @Test
    void saveGeneroTest(){
        Genero generoTest = new Genero("Terror", "url", listaDePelis, listaDeSerie);
        generoService.save(generoTest);
        verify(genderRepository, times(1)).save(generoTest);
    }

    @Test
    void findAllTest(){
        Genero generoTest = new Genero("Terror", "url", listaDePelis, listaDeSerie);
        generoService.save(generoTest);
        generoService.findAll();
        verify(genderRepository, times(1)).findAll();
    }

    @Test
    void getByIdTest(){
        Genero generoTest = new Genero("Terror", "url", listaDePelis, listaDeSerie);
        generoService.save(generoTest);
        generoService.getById(1L);
        verify(genderRepository, times(1)).getById(1L);
    }

    @Test
    void deleteByIdTest(){
        Genero generoTest = new Genero("Terror", "url", listaDePelis, listaDeSerie);
        generoService.save(generoTest);
        generoService.deleteById(1L);
        verify(genderRepository, times(1)).deleteById(1L);
    }
}
