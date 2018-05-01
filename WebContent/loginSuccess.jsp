<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page import="org.koushik.javabrains.dto.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success</title>
</head>
<body>
	<!-- <h3>
		Welcome -->
		<%-- <%=((User)session.getAttribute("user")).getUserName()%> --%>
		 <%-- <%=((User)request.getAttribute("user")).getUserName()%>
		!
	</h3> --%>
	<h3>
	Welcome
	<jsp:useBean id="user" scope="request" class="org.koushik.javabrains.dto.User">
		<jsp:setProperty property="userName" name="user" value="NewUser"/>
	</jsp:useBean>
	<%-- <%=user.getUserName() %> --%>
	<jsp:getProperty property="userName" name="user"/>
	</h3>
</body>
</html>