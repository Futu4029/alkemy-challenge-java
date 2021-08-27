package com.alkemychallenge.movies.service.impl;

import com.alkemychallenge.movies.model.Genero;
import com.alkemychallenge.movies.persistencia.GenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class GeneroServiceImpl {
    @Autowired
    private final GenderRepository genderRepository;


    public GeneroServiceImpl(GenderRepository genderRepository){
            this.genderRepository = genderRepository;
    }

    @Transactional
    public Optional<Genero> findById(Long id){
        return genderRepository.findById(id);
    }

    @Transactional
    public List<Genero> findAll(){
        return genderRepository.findAll();
    }

    @Transactional
    public void save(Genero item){
        genderRepository.save(item);
    }
}
