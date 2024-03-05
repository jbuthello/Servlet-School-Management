package com.jsp.service;

import java.util.List;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentService {
StudentDao studentDao=new StudentDao();
	
	public Student saveStudent(Student studentobj)
	{
		return studentDao.saveStudent(studentobj);
	}

	public Student getStudentById(int id) {
		return studentDao.getStudentById(id);
	}

	public Student getStudentById(int id, Student s) {
		return studentDao.getStudentById(id, s);
	}
}
