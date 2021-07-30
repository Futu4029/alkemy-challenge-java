package com.alkemychallenge.movies.service.impl;

import com.alkemychallenge.movies.model.Pelicula;
import com.alkemychallenge.movies.persistencia.dao.jdbc.hibernate.HibernatePeliculaDAO;
import com.alkemychallenge.movies.service.runner.TransactionRunner;
import org.hibernate.Session;

import java.util.List;

public class PeliculaServiceImpl {
    HibernatePeliculaDAO peliculaDAO;

    public PeliculaServiceImpl(HibernatePeliculaDAO peliculaDAO){
        this.peliculaDAO = peliculaDAO;
    }

    public Pelicula crear(Pelicula pelicula){
        Session session = new TransactionRunner().getSession();
        return peliculaDAO.crear(pelicula);
    }
    public Pelicula recuperar(int id){
        return peliculaDAO.recuperar(id);
    }

    public List<Pelicula> recuperarTodo(){
        return peliculaDAO.recuperarTodos();
    }

    public void actualizar(Pelicula pelicula){peliculaDAO.actualizar(pelicula);}

    public void deleteById(int id){peliculaDAO.deleteById(id);}
}
