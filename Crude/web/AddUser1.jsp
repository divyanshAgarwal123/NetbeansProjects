<%-- 
    Document   : AddUser1
    Created on : 30 Apr, 2021, 2:57:03 PM
    Author     : Divyansh Agarwal
--%>

<%@page import="com.UserDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="u" class="com.user"></jsp:useBean>
<jsp:setProperty property="*" name="u"></jsp:setProperty>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
            int i =UserDao.save(u);
            if(i>0)
            {
                response.sendRedirect("success.jsp");
            }
            else
            {
                response.sendRedirect("error.jsp");
                out.print(i);
            }
        %>
    </body>
</html>
