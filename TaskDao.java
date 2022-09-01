package com.todos.dao;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.todos.entity.Task;
import com.todos.utils.HibernatesUtils;



	public class TaskDao {
		
		public void saveTask(String name,String desc, String status, String time, int userId){
	        Session session = HibernatesUtils.getSession();
	        Transaction transaction = null;
	        try {
	            transaction = session.beginTransaction();
	            Task tasks = new Task();
	      	    tasks.setName(name);
	      	    tasks.setDesc(desc);
	      	    tasks.setStatus(status);
	      	    tasks.setTime(time);
	      	    tasks.setUserId(userId);
	            transaction.commit();
	            System.out.println("Records inserted sucessessfully");
	        } catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	    }
		
	    public List<Task> getTasks(){
	    	Session session = HibernatesUtils.getSession(); 
	        Query query = session.createQuery("from Tasks");
	        List<Task> tasks = query.list();
	        session.close();
	        return tasks;
	    }
		
	    public int updateTasks(Task b){
	        if(b.getId() <=0)  
	              return 0;  
	           Session session = HibernatesUtils.getSession(); 
	           Transaction tx = session.beginTransaction();
	           String hql = "update Tasks set name = :name, desc= :desc, status= :status, time = :time where id = :id";
	           Query query = session.createQuery(hql);
	           query.setInteger("id",b.getId());
	           query.setString("name",b.getName());
	           query.setString("desc",b.getDesc());
	           query.setString("status",b.getStatus());
	           query.setString("time",b.getTime());
	           int rowCount = query.executeUpdate();
	           System.out.println("Rows affected: " + rowCount);
	           tx.commit();
	           session.close();
	           return rowCount;
	   }
	    
	    public int deleteTasks(int id) {
	    	Session session = HibernatesUtils.getSession(); 
	        Transaction tx = session.beginTransaction();
	        String hql = "delete from Tasks where id = :id";
	        Query query = session.createQuery(hql);
	        query.setInteger("id",id);
	        int rowCount = query.executeUpdate();
	        System.out.println("Rows affected: " + rowCount);
	        tx.commit();
	        session.close();
	        return rowCount;
	    }
}
