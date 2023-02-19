package com.comp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveCompany {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("venkySir");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		Company company=new Company();
		company.setCid(1000);
		company.setCname("Honda");
		company.setPhno(900896851l);
		company.setGstno(101);
		company.setWebsite("https/honda:india/");
		
		Company company1=new Company();
		company1.setCid(1001);
		company1.setCname("suzuki");
		company1.setPhno(900896555l);
		company1.setGstno(102);
		company1.setWebsite("https/suzuki:india/");
		
		Company company2=new Company();
		company2.setCid(1002);
		company2.setCname("RoyalEnfield");
		company2.setPhno(777796555l);
		company2.setGstno(103);
		company2.setWebsite("https/royalenfield:india/");
		
		entityTransaction.begin();
		entityManager.persist(company);
		entityManager.persist(company1);
		entityManager.persist(company2);
		entityTransaction.commit();
	}

}
