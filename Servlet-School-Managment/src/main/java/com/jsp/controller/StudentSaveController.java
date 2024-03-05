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
@WebServlet("/studentinfo")
public class StudentSaveController extends HttpServlet{
	
	StudentService studentService=new StudentService();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Student student=new Student();
		String s_name=req.getParameter("first_s_name");
		String s_middle_name=req.getParameter("middle_s_name");
		String S_family_name=req.getParameter("family_s_name");
		String s_address=req.getParameter("s_address");
		String s_city=req.getParameter("s_city");
		String s_dist=req.getParameter("s_dist");
		String s_state=req.getParameter("s_state");
		String s_parent_mob=req.getParameter("s_parent_mob");
		String s_mob=req.getParameter("s_mob");		
		String s_email=req.getParameter("s_email");
		String s_password=req.getParameter("s_password");
		
		if(s_name!=null && s_email!=null && s_password!=null) {
			student.setS_first_name(s_name);
			student.setS_middle_name(s_middle_name);
			student.setS_family_name(S_family_name);
			student.setS_address(s_address);
			student.setS_city(s_city);
			student.setS_dist(s_dist);
			student.setS_state(s_state);
			student.setS_parent_mob(s_parent_mob);
			student.setS_mob(s_mob);
			student.setS_email(s_email);
			student.setS_password(s_password);
			Student s=studentService.saveStudent(student);
			PrintWriter printWriter= resp.getWriter();
			
			printWriter.write("<html><body><h1>"+"Welcome "+s_name+"</h1></body></html>");
			
			System.out.println("Student is saved.");
		}
	}

}
