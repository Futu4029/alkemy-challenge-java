package com.alkemychallenge.movies.persistencia.dao.jdbc.hibernate;

import com.alkemychallenge.movies.service.runner.TransactionRunner;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class HibernateDAO<T> {
    private Class<T> clazz;
    public HibernateDAO(Class<T> clazz){
        this.clazz = clazz;
    }


    public T crear(T item){
        Session session = new TransactionRunner().getSession();
        session.save(item);
        return item;
    }

    public T recuperar(int id){
        Session session = new TransactionRunner().getSession();
        return session.get(clazz, id);
    }

    public List<T> recuperarTodos(){
        Session session = new TransactionRunner().getSession();
        String hql = ("select t from "+ clazz.getName() +" t order by t.id asc");
        Query<T> query = session.createQuery(hql, clazz);

        return query.getResultList();
    }

    public void actualizar(T item){
        Session session = new TransactionRunner().getSession();
        session.merge(item);
    }

    public void deleteById(int id){
        Session session = new TransactionRunner().getSession();
        T obj = this.recuperar(id);
        session.delete(obj);
    }

}
