package com.alkemychallenge.movies.service.JPA;

import com.alkemychallenge.movies.model.Genero;
import com.alkemychallenge.movies.persistencia.GenderRepository;
import com.alkemychallenge.movies.service.GeneroService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GeneroServiceImpl implements GeneroService {

    private final GenderRepository genderRepository;

    public GeneroServiceImpl(GenderRepository genderRepository){
            this.genderRepository = genderRepository;
    }

    public Genero getById(Long id){
        return genderRepository.getById(id);
    }

    public List<Genero> findAll() {
        return genderRepository.findAll();
    }

    @Transactional
    public Genero save(Genero item){
        return genderRepository.save(item);
    }

    @Override
    public void deleteById(Long id) {
        genderRepository.deleteById(id);
    }
}
