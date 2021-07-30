package com.alkemychallenge.movies.persistencia.dao.jdbc.hibernate;

import com.alkemychallenge.movies.model.Genero;

public class HibernateGeneroDAO extends HibernateDAO<Genero> {
    public HibernateGeneroDAO() {
        super(Genero.class);
    }
}
