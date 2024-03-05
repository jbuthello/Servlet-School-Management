package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

@WebServlet("/updateStudent")
public class UpdateController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		StudentService studentService=new StudentService();
		String id2=req.getParameter("id");
		int id=Integer.parseInt(id2);
		System.out.println(id);
		String s_name=req.getParameter("name");
		String s_email=req.getParameter("email");
		Student s=studentService.getStudentById(id);
		
		if(s!=null) {
				s.setS_first_name(s_name);
				s.setS_email(s_email);
		}
		Student update_Student=studentService.getStudentById(id, s);
		if(update_Student!=null) {
		PrintWriter printWriter=resp.getWriter();
		printWriter.write("<html><body><h1>"+s_name+"  Updated"+"</h1></body></html>");
		}
	}
}
