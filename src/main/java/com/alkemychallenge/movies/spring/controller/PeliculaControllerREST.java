package com.alkemychallenge.movies.spring.controller;

import com.alkemychallenge.movies.model.Pelicula;
import com.alkemychallenge.movies.service.impl.PeliculaServiceImpl;
import com.alkemychallenge.movies.spring.controller.responseClasses.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/movies")
public class PeliculaControllerREST {
    private final PeliculaServiceImpl peliculaService;
    public PeliculaControllerREST(PeliculaServiceImpl peliculaService){
        this.peliculaService = peliculaService;
    }

    @PostMapping
    public SimpleMovie create(@RequestBody Pelicula pelicula){
        Pelicula peliculaCreada = peliculaService.crear(pelicula);
        return new SimpleMovie(peliculaCreada.getId(), peliculaCreada.getImage(), peliculaCreada.getTitulo(), peliculaCreada.getFecha());
    }

    @GetMapping
    public List<SimpleMovie> getMovies(){
        return peliculaService.recuperarTodo().stream().map(e -> new SimpleMovie(e.getId(), e.getImage(),e.getTitulo(),e.getFecha())).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public Pelicula getById(@PathVariable int id){
        return peliculaService.recuperar(id);
    }

    @PostMapping("/{id}")
    public void actualizar(@PathVariable int id, Pelicula pelicula){
        pelicula.setId(id);
        peliculaService.actualizar(pelicula);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        peliculaService.deleteById(id);
    }
}
