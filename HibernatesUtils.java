package com.todos.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


@SuppressWarnings("deprecation")
public class HibernatesUtils {

	private static HibernatesUtils instance=new HibernatesUtils();
    private SessionFactory sessionFactory;
    
    public static HibernatesUtils getInstance(){
            return instance;
    }
    
    private HibernatesUtils(){
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml"); 
                
        sessionFactory = configuration.buildSessionFactory();
    }
    
    public static Session getSession(){
        Session session =  getInstance().sessionFactory.openSession();
        
        return session;
    }
}
