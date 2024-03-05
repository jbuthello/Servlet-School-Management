<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%!String name[]=new String[3]; %>
<%name[0]="name1";
name[1]="name2";
name[2]="name3";%>

<% for(int i=0;i<name.length;i++){ %>
<%= name[i] %>
<%} %>

</body>
</html>