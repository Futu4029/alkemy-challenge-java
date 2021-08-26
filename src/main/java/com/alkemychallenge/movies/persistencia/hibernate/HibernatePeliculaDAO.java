package com.alkemychallenge.movies.persistencia.hibernate;

import com.alkemychallenge.movies.model.Pelicula;

public class HibernatePeliculaDAO extends HibernateDAO<Pelicula> {
    public HibernatePeliculaDAO() {
        super(Pelicula.class);
    }
}
