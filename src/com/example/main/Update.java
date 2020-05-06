package com.example.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.model.Student;

public class Update {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPAExample");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Student student = entityManager.find(Student.class, 102);

		System.out.println("Before Updatetion...........");
		System.out.println("   " + student.getId());
		System.out.println("   " + student.getName());
		System.out.println("   " + student.getAddress());

		student.setAddress("Indore");

		System.out.println("After Updatetion...........");
		System.out.println("   " + student.getId());
		System.out.println("   " + student.getName());
		System.out.println("   " + student.getAddress());
	}

}
