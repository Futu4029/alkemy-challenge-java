package com.alkemychallenge.movies.service.JPA;

import com.alkemychallenge.movies.model.Personaje;
import com.alkemychallenge.movies.persistencia.CharacterRepository;
import com.alkemychallenge.movies.service.PersonajeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonajeServiceImpl implements PersonajeService {

    private final CharacterRepository characterRepository;

    public PersonajeServiceImpl(CharacterRepository characterRepository){
        this.characterRepository = characterRepository;
    }

    @Override
    public Personaje getById(Long id) {
        return characterRepository.getById(id);
    }

    @Transactional
    @Override
    public Personaje save(Personaje item){
        return characterRepository.save(item);
    }

    @Override
    public void deleteById(Long id) {
        characterRepository.deleteById(id);
    }

    @Override
    public List<Personaje> findAll() {
        return characterRepository.findAll();
    }
}
