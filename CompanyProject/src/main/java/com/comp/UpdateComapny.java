package com.comp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateComapny {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("venkySir");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Company company=entityManager.find(Company.class, 1000);
		company.setCname("HeroHonda");
		company.setPhno(9999999999l);
		
		entityTransaction.begin();
		entityManager.merge(company);
		entityTransaction.commit();
		

	}

}
