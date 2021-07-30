package com.alkemychallenge.movies.service.runner;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryProvider {
    private static SessionFactory sessionFactory = null;
    public SessionFactoryProvider(){ }
    static {
        try{
            loadSessionFactory();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void loadSessionFactory(){
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.setProperty("hibernate.connection.username", "root");
        configuration.setProperty("hibernate.connection.password", "root");
        configuration.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/alkemy-challenge?createDatabaseIfNotExist=true&serverTimezone=UTC");
        configuration.setProperty("connection.driver_class", "com.mysql.cj.jdbc.Driver");
        configuration.setProperty("dialect", "org.hibernate.dialect.MySQL8Dialect");
        sessionFactory = configuration.buildSessionFactory();
    }
    SessionFactoryProvider instance = new SessionFactoryProvider();

    public static Session getSession() throws HibernateException {

        Session retSession=null;
        try {
            retSession = sessionFactory.openSession();
        }catch(Throwable t){
            System.err.println("Exception while getting session.. ");
            t.printStackTrace();
        }
        if(retSession == null) {
            System.err.println("Session is discovered null");
        }

        return retSession;
    }
}
