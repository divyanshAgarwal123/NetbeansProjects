<%-- 
    Document   : SessionExample2
    Created on : 13 Mar, 2021, 12:14:38 PM
    Author     : divya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%--
it is use for server site programming  for dynamic basses
--%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            String name=(String)session.getAttribute("user");
            out.println("hello"+name);
            String pass=(String)session.getAttribute("pass");
            out.println("your password is"+pass);
        %>
    </body>
</html>
