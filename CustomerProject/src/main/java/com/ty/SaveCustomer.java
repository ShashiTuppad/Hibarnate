package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveCustomer {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("venkySir");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		Customer customer=new Customer();
		customer.setId(201);
		customer.setName("Shashi");
		customer.setAge(22);
		customer.setGender("male");
		customer.setPhno(93980989129l);

		Customer customer1=new Customer();
		customer1.setId(202);
		customer1.setName("Shashi");
		customer1.setAge(22);
		customer1.setGender("male");
		customer1.setPhno(93980989129l);

		Customer customer2=new Customer();
		customer2.setId(203);
		customer2.setName("Shashi");
		customer2.setAge(22);
		customer2.setGender("male");
		customer2.setPhno(93980989129l);

		entityTransaction.begin();
		entityManager.persist(customer);
		entityManager.persist(customer1);
		entityManager.persist(customer2);
		entityTransaction.commit();





	}

}
