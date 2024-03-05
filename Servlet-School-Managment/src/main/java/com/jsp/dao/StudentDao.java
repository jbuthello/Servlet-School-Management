package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Student;

public class StudentDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jb");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public Student saveStudent(Student student) {
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		
		return student;
	}	
	
	public Student getStudentById(int id) {
		Student s=entityManager.find(Student.class, id);
		if(s!=null) {	return s;	}
			else {		return null;		}
	}
	
	public Student updateStudentById(Student student, int id) {
	
		Student s=entityManager.find(Student.class, id);
		if(s!=null) {
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
		}
		return student;
	}

	public Student getStudentById(int id, Student s) {
		
		if(s!=null) {
			entityTransaction.begin();
			entityManager.merge(s);
			entityTransaction.commit();
		}
		return s;
	}
}
