package com.alkemychallenge.movies.spring.controller;

import com.alkemychallenge.movies.service.JPA.GeneroServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gender")
public class GeneroControllerREST {
    private GeneroServiceImpl generoService;
    public GeneroControllerREST(GeneroServiceImpl generoService){
        this.generoService = generoService;
    }


}
