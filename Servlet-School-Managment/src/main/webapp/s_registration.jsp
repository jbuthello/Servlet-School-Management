<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>
<form action="studentinfo" method="post">
<div>
<label>First Name:</label>
<input type="text" name="first_s_name" placeholder="Enter your name">
</div>
<div>
<label>Middle Name:</label>
<input type="text" name="middle_s_name" placeholder="Enter your name">
</div>
<div>
<label>Family Name:</label>
<input type="text" name="family_s_name" placeholder="Enter your name">
</div>
<div><label>Address:</label><input type="text" name="s_address" placeholder="Enter your name"></div><br><br>
<div><label>City:</label><input type="text" name="s_city" placeholder="Enter your name"></div><br><br>
<div><label>District:</label><input type="text" name="s_dist" placeholder="Enter your name"></div><br><br>
<div><label>State:</label><input type="text" name="s_state" placeholder="Enter your name"></div><br><br>
<div><label>Parent Mob.:</label><input type="text" name="s_parent_mob" placeholder="Enter your name"></div><br><br>
<div><label>Student Mo.:</label><input type="text" name="s_mob" placeholder="Enter your name"></div><br><br>
<div><label>Email:</label><input type="text" name="s_email" placeholder="Enter your email"></div><br><br>
<div><label>Password:</label>   <input type="password" name="s_password" placeholder="you know the deal"></div><br><br>
<input type="submit" name="submit">

</form>
</body>
</html>