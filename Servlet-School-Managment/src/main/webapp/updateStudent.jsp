<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Student</title>
</head>
<body style="margin-top: 10%; margin-left: 45%">
<form action="updateStudent" method="post">
StudentId: <input type="number" name="id" value="<%request.getParameter("id");%>"></input><br><br>
UpdatedName: <input type="text" name="name"><br><br>
UpdatedEmail:<input type="email" name="email"><br><br>
<input type="submit" style="height:2cm width:5cm;">
</form>

</body>
</html>