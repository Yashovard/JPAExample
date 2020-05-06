package com.example.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.model.Student;

public class Delete {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPAExample");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();

		Student student = entityManager.find(Student.class, 103);
		entityManager.remove(student);
		entityManager.getTransaction().commit();

		entityManagerFactory.close();
		// entityManager.close();
		System.out.println("Delete........");
	}

}
