package com.alkemychallenge.movies.service.JPA;

import com.alkemychallenge.movies.model.Serie;
import com.alkemychallenge.movies.persistencia.TvShowRepository;
import com.alkemychallenge.movies.service.SerieService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class SerieServiceImpl implements SerieService {

    private final TvShowRepository tvShowRepository;

    public SerieServiceImpl(TvShowRepository tvShowRepository){
        this.tvShowRepository = tvShowRepository;
    }

    @Override
    public Serie getById(Long id) {
        return tvShowRepository.getById(id);
    }

    @Transactional
    @Override
    public Serie save(Serie item){
        return tvShowRepository.save(item);
    }

    @Override
    public void deleteById(Long id) {
        tvShowRepository.deleteById(id);
    }

    @Override
    public List<Serie> findAll() {
        return tvShowRepository.findAll();
    }

}
