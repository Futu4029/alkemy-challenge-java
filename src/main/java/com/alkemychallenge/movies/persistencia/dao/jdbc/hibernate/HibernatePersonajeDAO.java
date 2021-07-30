package com.alkemychallenge.movies.persistencia.dao.jdbc.hibernate;

import com.alkemychallenge.movies.model.Pelicula;
import com.alkemychallenge.movies.model.Personaje;

public class HibernatePersonajeDAO  extends HibernateDAO<Personaje> {
    public HibernatePersonajeDAO() {
        super(Personaje.class);
    }
}
