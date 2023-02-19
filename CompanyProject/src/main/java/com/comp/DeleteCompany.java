package com.comp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteCompany {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("venkySir");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Company company= entityManager.find(Company.class, 103);

		if(company!=null) {
	    entityTransaction.begin();
		entityManager.remove(company);
		entityTransaction.commit();
		}
		else {
		System.out.println("DATA ALREADY DELETED");
		}

	}

}
