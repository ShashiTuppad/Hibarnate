package manytomany.com;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveStudentCourse {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("venkySir");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();


		Student student1=new Student();

		student1.setName("shashi");
		student1.setAge(22);
		student1.setGender('M');
		student1.setMarks(70);
		student1.setPhno(9380989129l);

		Student student2=new Student();

		student2.setName("shree");
		student2.setAge(22);
		student2.setGender('M');
		student2.setMarks(80);
		student2.setPhno(7777989129l);

		Student student3=new Student();

		student3.setName("jani");
		student3.setAge(22);
		student3.setGender('F');
		student3.setMarks(70);
		student3.setPhno(9380666629l);

		Courses courses1=new Courses();
		courses1.setName("java");
		courses1.setDuration("6 months");
		courses1.setFees(35500.00);
		courses1.setTrainer("Keshav Sir");

		Courses courses2=new Courses();
		courses2.setName("advance java");
		courses2.setDuration("4 months");
		courses2.setFees(46500.00);
		courses2.setTrainer("UdaySir");

		Courses courses3=new Courses();
		courses3.setName("Hibernate");
		courses3.setDuration("2 months");
		courses3.setFees(35500.00);
		courses3.setTrainer("Keshav Sir");

		Courses courses4=new Courses();
		courses4.setName("Spring");
		courses4.setDuration("1 months");
		courses4.setFees(56500.00);
		courses4.setTrainer("Akshta");

		Courses courses5=new Courses();
		courses5.setName("python");
		courses5.setDuration("5 months");
		courses5.setFees(65500.00);
		courses5.setTrainer("Shashi");

		List<Courses> list1=new ArrayList<Courses>();

		list1.add(courses1);
		list1.add(courses5);
		list1.add(courses2);

		List<Courses> list2=new ArrayList<Courses>();

		list2.add(courses2);
		list2.add(courses4);
		list2.add(courses1);

		List<Courses> list3=new ArrayList<Courses>();

		list3.add(courses3);
		list3.add(courses1);
		list3.add(courses5);
		
		
		student1.setCourses(list1);
		student2.setCourses(list2);
		student3.setCourses(list3);
		
		
		entityTransaction.begin();
		entityManager.persist(student1);
		entityManager.persist(student2);
		entityManager.persist(student3);
		entityManager.persist(courses1);
		entityManager.persist(courses2);
		entityManager.persist(courses3);
		entityManager.persist(courses4);
		entityManager.persist(courses5);
		entityTransaction.commit();
		
		













	}

}
