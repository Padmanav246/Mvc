<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:directive.page isELIgnored="false"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
	<h1>
	This is home page
	</h1>
	<%=request.getAttribute("name") %>
	<h1>${name }</h1>
	<c:forEach var="items" items="${marks }">
		<h1>${items }</h1>
	</c:forEach>
</body>
</html>