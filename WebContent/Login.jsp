<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<%if(request.getAttribute("result")==Boolean.valueOf(false)){%>
	 <%@include file="/loginFail.jsp" %>
<%} %> 
	<br />
	<form action="login" method="post">
		<br />User Name:<input type="text" name="userId" /><br /> <br />
		Password:<input type="password" name="password" /><br /> <input
			type="submit" value="Login">

	</form>
</body>
</html>