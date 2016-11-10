<%--
  Created by IntelliJ IDEA.
  User: nur
  Date: 08.11.16
  Time: 19:32
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Students</title>
</head>
<body>

<table border="1">
    <thead>
    <td>Name</td>
    <td>Surname</td>
    <td>Date of birth</td>
    <td> Gender </td>
    </thead>
    <tbody>

    <c:forEach items="${studentsList}" var="item">
        <tr>
            <td>${item.firstName}</td>
            <td>${item.lastName}</td>
            <td>${item.birthDate}</td>
            <td>${item.gender}</td>
        </tr>
    </c:forEach>

    </tbody>
</table>


</body>
</html>
