<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test Jsp</title>
</head>
<body>

	<h3>Test JSP</h3>
	<br>
	<%!
	public int add(int a, int b){
		return a+b;
	}
	%>
	<%
		int i = 1, j = 2;
		int k = i + j;
	%>
	The Value of K is : <%=k %>
	<br>
	<%
	 k= add(678,789);
	%>
The Value of K is : <%=k %>

<% for( i=0;i<=5;i++){ %>
<br> The new value of i = <%=i %>

<%} %>
</body>
</html>