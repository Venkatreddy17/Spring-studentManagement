<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h3>Add Student</h3>
<!-- crate a spring form where the user can enter data -->
<form:form action="save-student" modelAttribute="student" method="post">
<form:hidden path="id"/>
<label>Name:</label>
<form:input path="name"/>
<br>
<label>mobile:</label>
<form:input path="mobile"/>
<br>
<label>country:</label>
<form:input path="country"/>
<br>
<input type="submit" value="submit">
</form:form>
</div>
</body>
</html>