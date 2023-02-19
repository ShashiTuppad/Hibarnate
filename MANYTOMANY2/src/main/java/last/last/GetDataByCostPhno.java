package last.last;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetDataByCostPhno {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("venkySir");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Query query=entityManager.createQuery("select c from Cab c where c.cost=?1 and c.phno=?2");
		query.setParameter(1,120.0);
		query.setParameter(2, 9988553322l);


		List<Cab> cab = query.getResultList();

		for(Cab cab1: cab) {
			System.out.println("The driver phno is: "+cab1.getDname());
			System.out.println("cab cost is: "+cab1.getCost());
			System.out.println("car id is: "+cab1.getCid());
			System.out.println("driver contact number: "+cab1.getPhno());
			System.out.println("AC or NON_AC :"+cab1.getType());
			
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

}
}
