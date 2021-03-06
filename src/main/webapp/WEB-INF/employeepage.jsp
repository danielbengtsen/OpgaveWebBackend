<%-- 
    Document   : employeepage.jsp
    Created on : Aug 24, 2017, 6:31:57 AM
    Author     : kasper
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee home page</title>
    </head>
    <body>
        

        <h1>Hello ${sessionScope.email} </h1>



        You are now logged in as an EMPLOYEE of our wonderful site.

        <br>
        <br>

        <form name="show" action="FrontController" method="POST">
            <input type="hidden" name="target" value="show">
            <input type="submit" value="Gå til oversigt">
        </form>

        <br>
        <br>

        <h3>Opret ny medarbejder:</h3>
        <td>
            <form name="registerEmployee" action="FrontController" method="POST">
                <input type="hidden" name="target" value="registerEmployee">
                Email:<br>
                <input type="text" name="email">
                <br>
                Password:<br>
                <input type="password" name="password1">
                <br>
                Skriv Password Igen:<br>
                <input type="password" name="password2">
                <br>
                <input type="submit" value="Send">
            </form>
        </td>

        <br>
        <br>

        <h3>Slet en kunde:</h3>
        ${sessionScope.besked}
        <form name="deleteUser" action="FrontController" method="POST">
            <input type="hidden" name="target" value="deleteUser">
            Indtast Email på kunde som skal slettes:<br>
            <input type="text" name="email">
            <input type="submit" value="Slet">
        </form>

        <br>
        <br>


        <h3>Skift adgangskoden på en bruger:</h3>
        ${sessionScope.skiftbesked}
        <form name="changePassword" action="FrontController" method="POST">
            <input type="hidden" name="target" value="changePassword">
            Email:<br>
            <input type="text" name="email">
            <br>
            Nyt Password:<br>
            <input type="password" name="password1">
            <br>
            Skriv Nyt Password Igen:<br>
            <input type="password" name="password2">
            <br>
            <input type="submit" value="Skift">
        </form>

        <br>
        <br>

        <form name ="logout" action="FrontController" method="POST">
            <input type="hidden" name="target" value="logout">
            <input type="submit" value="Logout">
        </form>

    </body>
</html>
