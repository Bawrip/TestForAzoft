<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<form action="<c:url value="/add-new-expense"/>" method="POST">
    <label>Description</label>
    <input type="text" name="description">
    <label>SpendingAmount</label>
    <input type="text" name="spendingAmount">
    <label>Comment</label>
    <input type="text" name="comment">
    <input type="submit" value="Add new expense">
</form>
</body>
</html>