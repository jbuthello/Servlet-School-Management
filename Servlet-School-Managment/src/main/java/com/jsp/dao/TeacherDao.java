package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Student;
import com.jsp.dto.Teacher;

public class TeacherDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jb");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Teacher saveTeacher(Teacher teacher) {

		entityTransaction.begin();
		entityManager.persist(teacher);
		entityTransaction.commit();

		return teacher;
	}

	public List<Student> getAllStudents() {
		String sql = "SELECT s FROM Student s";
		Query query = entityManager.createQuery(sql);
		List<Student> students = query.getResultList();
		return students;
	}

	public Student getStudentById(int id) {
		Student s = entityManager.find(Student.class, id);
		if (s != null) {
			return s;
		} else {
			return null;
		}
	}

	public Student updateStudentById(Student student, int id) {

		Student s = entityManager.find(Student.class, id);
		if (s != null) {
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
		}
		return student;
	}
}
