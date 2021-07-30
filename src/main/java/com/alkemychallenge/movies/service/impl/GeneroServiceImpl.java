package com.alkemychallenge.movies.service.impl;

import com.alkemychallenge.movies.model.Genero;
import com.alkemychallenge.movies.persistencia.dao.jdbc.hibernate.HibernateGeneroDAO;
import com.alkemychallenge.movies.service.runner.TransactionRunner;
import org.hibernate.Session;

public class GeneroServiceImpl {
    HibernateGeneroDAO generoDAO;
    public GeneroServiceImpl(HibernateGeneroDAO generoDAO){
        this.generoDAO = generoDAO;
    }

    public Genero crear(Genero genero){
        Session session = new TransactionRunner().getSession();
            return generoDAO.crear(genero);
    }
    public Genero recuperar(int id){
        return generoDAO.recuperar(id);
    }
}
