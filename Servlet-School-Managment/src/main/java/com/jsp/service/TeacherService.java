package com.jsp.service;

import java.util.List;

import com.jsp.dao.TeacherDao;
import com.jsp.dto.Student;
import com.jsp.dto.Teacher;

public class TeacherService {
TeacherDao teacherDao=new TeacherDao();
	
	public Teacher saveTeacher(Teacher teacherobj)
	{
		return teacherDao.saveTeacher(teacherobj);
	}

	public List<Student> getAllStudents(){
		return teacherDao.getAllStudents();
	}
}
