<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="user" class="org.koushik.javabrains.dto.User" scope="request">

<jsp:setProperty property="*" name="user" />
<%-- <jsp:setProperty property="userName" name="user" /> --%>
<%-- <jsp:setProperty property="userName" name="user" param="userName"/> --%> 
<%-- <jsp:setProperty property="userId" name="user" param="userId"/>
<jsp:setProperty property="address1" name="user" param="address1"/>
<jsp:setProperty property="address2" name="user" param="address2"/>
<jsp:setProperty property="state" name="user" param="state"/>
<jsp:setProperty property="city" name="user" param="city"/>
<jsp:setProperty property="pinCode" name="user" param="pinCode"/> --%>
</jsp:useBean>

Hello <jsp:getProperty property="userName" name="user"/><br>
User Id: <jsp:getProperty property="userId" name="user"/><br>
Address Line 1: <jsp:getProperty property="address1" name="user"/><br>
Address Line 2: <jsp:getProperty property="address2" name="user"/><br>
City: <jsp:getProperty property="city" name="user"/><br>
State: <jsp:getProperty property="state" name="user"/><br>
Pincode: <jsp:getProperty property="pinCode" name="user"/><br>

</body>
</html>