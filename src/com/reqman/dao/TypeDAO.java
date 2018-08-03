package com.reqman.dao;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean(name="typedao")
@RequestScoped
public class TypeDAO {/*

	//retrieve from database
		public List<type> getlist()
		{
			
			
		List<type> list = new ArrayList<type>();
			  Session session; 
			    String result=null;
			       SessionFactory hsf = HibernateSessionFactory.getSessionFactory();
		        session = hsf.openSession();
		        try{
		        	session.beginTransaction();
		        	list =session.createQuery("from type").list();
		        	session.getTransaction().commit();
		            System.out.println("done");	        	
		        	
		        }catch(Exception e){
		        	  System.out.println("error"+e);
		        }		
			
			return list;
			
		}
		public void delete(String type){
			 Session session; 
			  Transaction trns = null;
		       SessionFactory hsf = HibernateSessionFactory.getSessionFactory();
	        session = hsf.openSession();
	        try{     
	       trns= session.beginTransaction();    
	        	type type1 = (type) session.load(type.class, new String (type));   
	        	 session.delete(type1);    
	        	 session.getTransaction().commit(); 
			
	        }catch(Exception e){
	        	  if (trns != null) {  
	        		  trns.rollback();  
	        		  } 
	        	
	        	  System.out.println("error"+e);
	        }	
	}
*/}
