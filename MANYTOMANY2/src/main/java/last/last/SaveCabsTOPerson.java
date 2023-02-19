package last.last;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveCabsTOPerson {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("venkySir");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		Person person1=new Person();

		person1.setName("nanu");
		person1.setAge(22);
		person1.setGender('M');
		person1.setPhno(9008427972l);
		person1.setLocation("GADAG");

		Person person2=new Person();

		person2.setName("ninu");
		person2.setAge(24);
		person2.setGender('F');
		person2.setPhno(9008427975l);
		person2.setLocation("BENGALURU");

		Person person3=new Person();

		person3.setName("avanu");
		person3.setAge(25);
		person3.setGender('M');
		person3.setPhno(6865427972l);
		person3.setLocation("CHAMARAJPETA");

		Cab cab1=new Cab();

		cab1.setDname("ashok");
		cab1.setCost(120.0);
		cab1.setType("AC");
		cab1.setPhno(9988553322l);

		Cab cab2=new Cab();

		cab2.setDname("ramesh");
		cab2.setCost(280.0);
		cab2.setType("NON-AC");
		cab2.setPhno(8888553322l);

		Cab cab3=new Cab();

		cab3.setDname("sudeep");
		cab3.setCost(220.0);
		cab3.setType("AC");
		cab3.setPhno(7778553322l);

		Cab cab4=new Cab();

		cab4.setDname("bali");
		cab4.setCost(290.0);
		cab4.setType("AC");
		cab4.setPhno(9925253322l);

		Cab cab5=new Cab();

		cab5.setDname("kalil");
		cab5.setCost(320.0);
		cab5.setType("AC");
		cab5.setPhno(9988555325l);

		List<Cab> list1=new ArrayList<Cab>();

		list1.add(cab1);
		list1.add(cab5);
		list1.add(cab2);

		List<Cab> list2=new ArrayList<Cab>();

		list2.add(cab3);
		list2.add(cab1);
		list2.add(cab2);

		List<Cab> list3=new ArrayList<Cab>();

		list3.add(cab2);
		list3.add(cab5);
		list3.add(cab4);
		
		person1.setCabs(list1);
		person2.setCabs(list2);
		person3.setCabs(list3);
		
		entityTransaction.begin();
		entityManager.persist(person1);
		entityManager.persist(person2);
		entityManager.persist(person3);
		entityManager.persist(cab1);
		entityManager.persist(cab2);
		entityManager.persist(cab3);
		entityManager.persist(cab4);
		entityManager.persist(cab5);
		entityTransaction.commit();

	}

}
