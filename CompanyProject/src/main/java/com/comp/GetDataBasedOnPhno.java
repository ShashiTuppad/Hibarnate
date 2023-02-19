package com.comp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetDataBasedOnPhno {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("venkySir");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		 Query query=entityManager.createQuery("select c from Company c where c.phno=?1");
		 query.setParameter(1,900896555l);
		
		
	        List<Company> company = query.getResultList();
	        
	        for(Company company1: company) {
	        	System.out.println("The company Id is: "+company1.getCid());
	    		System.out.println("The company Name : "+company1.getCname());
	    		System.out.println("The company Phno : "+company1.getPhno());
	    		System.out.println("The company GST No : "+company1.getGstno());
	    		System.out.println("The company website: "+company1.getWebsite());
	    		System.out.println("---------------------------------------------- ");
	        }

	}

}
