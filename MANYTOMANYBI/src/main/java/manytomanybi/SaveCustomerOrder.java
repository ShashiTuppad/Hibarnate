package manytomanybi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveCustomerOrder {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("venkySir");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		Customer customer1=new Customer();
		customer1.setName("Shashi");
		customer1.setGender('M');
		customer1.setLocation("Gadag");
		customer1.setPhno(9008427356l);

		Customer customer2=new Customer();
		customer2.setName("shree");
		customer2.setGender('M');
		customer2.setLocation("bengalore");
		customer2.setPhno(9558427356l);

		Orders order1=new Orders();

		order1.setItem("Fan");
		order1.setCost(4000.00);
		order1.setRating(4.2);
		order1.setQnt(1);

		Orders order2=new Orders();

		order2.setItem("Pant");
		order2.setCost(400.00);
		order2.setRating(4.8);
		order2.setQnt(1);

		Orders order3=new Orders();

		order3.setItem("Iphone");
		order3.setCost(44000.00);
		order3.setRating(5.0);
		order3.setQnt(2);
		
		List<Customer> cust1=new ArrayList<Customer>();
		cust1.add(customer1);
		cust1.add(customer2);
		
		List<Customer> cust2=new ArrayList<Customer>();
		cust2.add(customer2);
		cust2.add(customer1);
		
		List<Customer> cust3=new ArrayList<Customer>();
		cust3.add(customer2);
	
		List<Orders> list1=new ArrayList<Orders>();
		list1.add(order1);
		list1.add(order2);
		list1.add(order3);
		
		List<Orders> list2=new ArrayList<Orders>();
		list1.add(order1);
		list1.add(order2);
		
		customer1.setOrders(list1);
		customer2.setOrders(list2);
		
		order1.setCustomers(cust1);
		order2.setCustomers(cust2);
		order3.setCustomers(cust3);
		
		entityTransaction.begin();
		entityManager.persist(customer1);
		entityManager.persist(customer2);
		entityTransaction.commit();
		
		
		
		
		
		





	}

}
