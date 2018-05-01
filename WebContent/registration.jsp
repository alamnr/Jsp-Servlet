<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
	
	<br />
	<form action="process.jsp" method="post">
		<br />User Name:<input type="text" name="userName" /><br /> <br />
		User Id:<input type="text" name="userId" /><br />
		Address Line 1:<input type="text" name="address1" /><br />
		Address Line 2:<input type="text" name="address2" /><br />
		City:<input type="text" name="city" /><br />
		State:<input type="text" name="state" /><br />
		Pincode:<input type="text" name="pinCode" /><br />
		
		 <input	type="submit" value="Login">

	</form>
</body>
</html>