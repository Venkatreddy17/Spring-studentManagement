<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Data</title>
</head>
<body>
<h1 align="center">Selenium Express</h1>

<!-- ModelAttribute:students -->
<div align="center">
<form action="showStudentPage" >
<input type="submit" value="Add Student">
</form>
<table border="1" >
<thead>
<tr>
<th>id</th>
<th>name</th>
<th>mobile</th>
<th>country</th>
</tr>

<c:forEach var="student" items="${students}">
<tr>
<td>${student.id}</td>
<td>${student.name}</td>
<td>${student.mobile}</td>
<td>${student.country}</td>
</tr>
</c:forEach>
</table>
</div>
</body>
</html>