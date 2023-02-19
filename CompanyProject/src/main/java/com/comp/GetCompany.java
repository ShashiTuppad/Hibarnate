package com.comp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetCompany {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("venkySir");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		Company company=entityManager.find(Company.class, 1001);



		System.out.println("The company Id is: "+company.getCid());
		System.out.println("The company Name : "+company.getCname());
		System.out.println("The company Phno : "+company.getPhno());
		System.out.println("The company GST No : "+company.getGstno());
		System.out.println("The company website: "+company.getWebsite());



	}

}
