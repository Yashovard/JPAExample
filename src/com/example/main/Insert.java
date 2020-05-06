package com.example.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.model.Student;

public class Insert {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPAExample");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();

		Student student = new Student();
		student.setId(106);
		student.setName("Prakhar");
		student.setAddress("Dhar");

		/*
		 * Student student2 = new Student(); student.setId(102);
		 * student.setName("Kamesh"); student.setAddress("Sendhwa");
		 * 
		 * Student student3 = new Student(); student.setId(103);
		 * student.setName("Arpan"); student.setAddress("Keli");
		 */

		entityManager.persist(student);
		// entityManager.persist(student2);
		// entityManager.persist(student3);

		entityManager.getTransaction().commit();
		entityManagerFactory.close();
		entityManager.close();
		System.out.println("Done....");
	}

}
