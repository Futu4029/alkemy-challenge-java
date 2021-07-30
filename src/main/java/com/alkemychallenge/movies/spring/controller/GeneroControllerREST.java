package com.alkemychallenge.movies.spring.controller;

import com.alkemychallenge.movies.service.impl.GeneroServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/genero")
public class GeneroControllerREST {
    private GeneroServiceImpl generoService;
    public GeneroControllerREST(GeneroServiceImpl generoService){
        this.generoService = generoService;
    }


}
