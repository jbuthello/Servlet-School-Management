package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/teacher")
public class TeacherController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String register=req.getParameter("register");
		String update=req.getParameter("update");
		String delete=req.getParameter("delete");
		String getbyid=req.getParameter("getbyid");
		String getAll=req.getParameter("getAll");
		
		if(register!=null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("t_registration.jsp");
			requestDispatcher.forward(req, resp);
		}else if(update!=null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("updateteacher.jsp");
			requestDispatcher.forward(req, resp);
			
		}else if(delete!=null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("deleteteacher.jsp");
			requestDispatcher.forward(req, resp);
			
		}else if(getbyid!=null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("getbyid.jsp");
			requestDispatcher.forward(req, resp);	
		}

		else if(getAll!=null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("getAll.jsp");
			requestDispatcher.forward(req, resp);
		}
	}
}
