package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;
@WebServlet("/teacherinfo")
public class TeacherSaveController extends HttpServlet{
	Teacher teacher=new Teacher();
	TeacherService teacherService=new TeacherService();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String t_name=req.getParameter("t_name");
		String t_email=req.getParameter("t_email");
		String t_password=req.getParameter("t_password");
		
		teacher.setT_name(t_name);
		teacher.setT_email(t_email);
		teacher.setT_password(t_password);
		
		Teacher t=teacherService.saveTeacher(teacher);
		PrintWriter printWriter= resp.getWriter();
		printWriter.write("<html><body><h1>"+"Welcome "+t_name+"</h1></body></html>");
		
		System.out.println("Teacher record inserted sucessfully");
	}
	

}
