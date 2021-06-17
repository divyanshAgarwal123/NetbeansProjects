<%-- 
    Document   : SessionExample
    Created on : 13 Mar, 2021, 12:07:41 PM
    Author     : divya
--%>

<%@page import="com.mysql.jdbc.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="com.mysql.jdbc.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
                String number1 = request.getParameter("n1");
                session.setAttribute("user",number1);
                String number2 = request.getParameter("n2");
                session.setAttribute("pass",number2);
        %>
        <a href="SessionExample2.jsp">CLick for more info</a>
    </body>
</html>
