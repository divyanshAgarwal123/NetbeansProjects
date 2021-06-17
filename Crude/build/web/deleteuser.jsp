<%-- 
    Document   : deleteuser
    Created on : 1 May, 2021, 4:47:12 PM
    Author     : Divyansh Agarwal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@page import="com.UserDao" %>
        <jsp:useBean id="u" class="com.user"></jsp:useBean>
        <jsp:setProperty property="*" name="u"></jsp:setProperty>
       
        <%
            UserDao.delete(u);
            response.sendRedirect("viewuser.jsp");
           
            %>
    </body>
</html>