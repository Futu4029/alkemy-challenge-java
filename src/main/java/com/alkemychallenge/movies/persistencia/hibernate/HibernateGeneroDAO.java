package com.alkemychallenge.movies.persistencia.hibernate;

import com.alkemychallenge.movies.model.Genero;
import com.alkemychallenge.movies.model.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public class HibernateGeneroDAO extends HibernateDAO<Genero> {
    public HibernateGeneroDAO() {super(Genero.class);}

}
