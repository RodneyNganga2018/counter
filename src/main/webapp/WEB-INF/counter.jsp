<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Current visit count</title>
<link rel="stylesheet" href="css/bootstrap.css" type="text/css"/>
</head>
<body>
	<div class="d-flex">
		<p>You have visited <a href="http://localhost:8080/your_server">http://your_server</a> <c:out value="${count}"/> times.</p>
		<p><a href="http://localhost:8080/your_server">Test another visit?</a></p>	
	</div>
</body>
</html>