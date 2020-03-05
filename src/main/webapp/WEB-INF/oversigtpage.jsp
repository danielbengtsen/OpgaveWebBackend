<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Jannich
  Date: 04/03/2020
  Time: 10.19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Oversigt</title>
</head>
<body>

<h1>Liste over registrerede kunder:</h1>

<c:forEach var="element" items="${sessionScope.customerOversigt}">
    ${element}
    <br>
</c:forEach>

    <br>

    <h2>Samlede antal registrerede kunder:</h2>

    Der er ${sessionScope.customerCount} antal kunder registreret.

</body>
</html>
