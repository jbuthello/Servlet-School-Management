<%@page import="com.jsp.service.TeacherService"%>
<%@page import="com.jsp.dto.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.service.StudentService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Students</title>
</head>
<body style="margin-top: 10%; margin-left: 10%; align-content: space-between;">

<% TeacherService teacherService=new TeacherService(); %>
<%List<Student> students=teacherService.getAllStudents(); %>
<table border="1">
<tr>
<th>StudentID</th>
<th>Name</th><th>Address</th><th>City</th>
<th>District</th><th>State</th><th>Parent Mob.</th>
<th>Student Mob.</th>
<th>Email</th>
<th>Update</th>
</tr>
<tr></tr>
<%for(Student s: students){ %>
<tr>
<td><%=s.getId()%></td>
<td><%= s.getS_first_name() + " " + s.getS_middle_name() + " " + s.getS_family_name() %></td>
<td><%=s.getS_address() %></td>
<td><%=s.getS_city() %></td>
<td><%=s.getS_dist() %></td>
<td><%=s.getS_state() %></td>
<td><%=s.getS_parent_mob() %></td>
<td><%=s.getS_mob() %></td>
<td><%=s.getS_email()%></td>
<td><a href="updateStudent.jsp?id=<%=s.getId()%>">Update</a></td>
</tr>
<%} %>
</table>

<%-- <% StudentService studentService=new StudentService(); %>
<%List<Student> students=studentService.getAllStudents(); %>
<table border="2px">
<tr>
<th>StudentID</th>
<th>Name</th>
<th>Email</th>
</tr>
<tr></tr>
<%for(Student s: students){ %>
<tr>
<td><%=s.getId()%></td>
<td><%=s.getS_name()%></td>
<td><%=s.getS_email()%></td>
</tr>
<%} %>
</table> --%>


</body>
</html>