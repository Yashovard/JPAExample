package com.example.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.model.Student;

public class Find {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPAExample");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Student student = entityManager.find(Student.class, 101);
		System.out.println("   " + student.getId());
		System.out.println("   " + student.getName());
		System.out.println("   " + student.getAddress());

	}

}
