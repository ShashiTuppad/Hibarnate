package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteCustomer {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("venkySir");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		Customer customer= entityManager.find(Customer.class, 203);

		if(customer!=null) {
	    entityTransaction.begin();
		entityManager.remove(customer);
		entityTransaction.commit();
		}
		else {
		System.out.println("DATA ALREADY DELETED");
		}

	}

}
