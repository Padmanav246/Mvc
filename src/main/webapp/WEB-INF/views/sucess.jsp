<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <jsp:directive.page isELIgnored="false"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${welcome }</h1>
	<h2>Name : ${user.name }</h2>
	<h2>Email: ${user.email }</h2>
	<h2>password : ${user.password }</h2>
	<h2>Conform Password : ${user.conpassword }</h2>
	<h2>${thankyou }</h2>	
</body>
</html>