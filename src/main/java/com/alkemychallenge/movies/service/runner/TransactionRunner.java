package com.alkemychallenge.movies.service.runner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public final class TransactionRunner {
    private static Session session = SessionFactoryProvider.getSession();

    public static Session getSession() {
        if(haySesionAbierta()) {
            return session;
        }else{
            throw new RuntimeException("No hay ninguna session en el contexto");
        }
    }
    public static void runTrx(Transaction bloque){

        try {
            session = getSession();
            session.beginTransaction();
            bloque.commit();
        } catch (HibernateException exObj) {
            if(bloque!=null){
                bloque.rollback();
            }
            exObj.printStackTrace();
        } finally {
            session.close();
        }
    }

    private static boolean haySesionAbierta(){
         return session!=null;
    }
}
