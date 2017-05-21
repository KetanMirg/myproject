<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body{
background:blue;
}


</style>
</head>
<body>
<form action="j_spring_security_check" method="post">
User Name: <input type="text" name="j_username"><br>
Password: <input type="password" name="j_password"><br>
<input name="submit" type="submit" value="submit"><br>
<input name="reset" type="reset"><br>


</form>
</body>
</html>