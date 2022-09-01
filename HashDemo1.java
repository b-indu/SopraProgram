package com.map;

import java.util.HashMap;

public class HashDemo1 {
	public static void main(String[] args) {
		
		//syntax of the hashMap
		HashMap m = new HashMap();
		
		// adding the value in HashMap
		  m.put(101, "bindu");
		  m.put(102, "shivam");
		  m.put(103,"ashish");
		  m.put(104,"kajal");
		  m.put(105, "rahul");
		  m.put(106, "kajal");
		  m.put(106,"kajal");
		  
		  System.out.println(m);
		  
		  //get the element of the form key value 
		 
		  System.out.println( m.get(101));
		  System.out.println(m.get("shivam"));
		  System.out.println(m.containsKey(101));
		  System.out.println(m.containsValue("ashish"));
		  System.out.println(m.isEmpty());//false
		  System.out.println("The size of the element   " +m.size());
		  // when we clear the hashMap value that time 
		  m.clear();
		  System.out.println(m);
		 
	}
}
