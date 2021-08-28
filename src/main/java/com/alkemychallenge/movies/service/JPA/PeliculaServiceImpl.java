package com.alkemychallenge.movies.service.JPA;

import com.alkemychallenge.movies.model.Pelicula;
import com.alkemychallenge.movies.persistencia.MovieRepository;
import com.alkemychallenge.movies.service.PeliculaService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class PeliculaServiceImpl implements PeliculaService {

    private final MovieRepository movieRepository;

    public PeliculaServiceImpl(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    @Override
    public Pelicula getById(Long id){
        return movieRepository.getById(id);
    }

    @Override
    public List<Pelicula> findAll(){
        return movieRepository.findAll();
    }

    @Transactional
    @Override
    public Pelicula save(Pelicula item){
        return movieRepository.save(item);
    }

    @Override
    public void deleteById(Long id) {
        movieRepository.deleteById(id);
    }
}
