<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <style>
        .button-container {
            text-align: center; /* Align buttons to the center */
        }

        .button-container form {
            display: inline-block; /* Make forms display inline */
            margin: 0 10px; /* Add some spacing between buttons */
        }
    </style>
</head>
<body>
<div class="button-container">
    <form action="/add">
        <input type="submit" value="Add">
    </form>
    <form action="/update">
        <input type="submit" value="Update">
    </form>
    <form action="/get">
        <input type="submit" value="Get">
    </form>
    <form action="/Employee/getall">
        <input type="submit" value="Get All">
    </form>
    <form action="/delete">
        <input type="submit" value="Delete">
    </form>
</div>
<c:forEach var="employee" items="${employees}">
    Employee ID: <c:out value="${employee.getId()}"/><br>
    Employee Name: <c:out value="${employee.getName()}"/><br>
    Employee Role: <c:out value="${employee.getJobTitle()}"/><br>
    Employee Salary: <c:out value="${employee.getSalary()}"/><br>
    <br>
</c:forEach>

</body>
</html>