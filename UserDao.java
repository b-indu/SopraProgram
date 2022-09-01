package com.todos.dao;


import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.todos.entity.Users;
import com.todos.utils.HibernatesUtils;

import org.hibernate.Query;



public class UserDao {
	
	public void saveUsers(String name,String mail, String password, String phone, int id){
        Session session = HibernatesUtils.getSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            Users users = new Users();
            users.setID(id);
      	    users.setEmail(mail);
      	    users.setName(name);
      	    users.setPassword(password);
      	    users.setPhone_no(phone);
            session.save(users);
            transaction.commit();
            System.out.println("Records inserted sucessessfully");
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
	
    public List<Users> getUsers(){
    	Session session = HibernatesUtils.getSession(); 
        Query query = session.createQuery("from Users");
        List<Users> books = query.list();
        session.close();
        return books;
    }
	
    public int updateUsers(Users b){
        if(b.getID() <=0)  
              return 0;  
        	Session session = HibernatesUtils.getSession(); 
           Transaction tx = session.beginTransaction();
           String hql = "update Users set name = :name, password=:password where id = :id";
           Query query = session.createQuery(hql);
           query.setInteger("id",b.getID());
           query.setString("name",b.getName());
           query.setString("password",b.getPassword());
           query.setString("phone",b.getPhone_no());
           int rowCount = query.executeUpdate();
           System.out.println("Rows affected: " + rowCount);
           tx.commit();
           session.close();
           return rowCount;
   }
    
    public int deleteUsers(int id) {
    	Session session = HibernatesUtils.getSession(); 
        Transaction tx = session.beginTransaction();
        String hql = "delete from Users where id = :id";
        Query query = session.createQuery(hql);
        query.setInteger("id",id);
        int rowCount = query.executeUpdate();
        System.out.println("Rows affected: " + rowCount);
        tx.commit();
        session.close();
        return rowCount;
    }
	
}