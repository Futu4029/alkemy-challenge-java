package com.alkemychallenge.movies.persistencia.hibernate;

import com.alkemychallenge.movies.model.Personaje;

public class HibernatePersonajeDAO  extends HibernateDAO<Personaje> {
    public HibernatePersonajeDAO() {
        super(Personaje.class);
    }
}
