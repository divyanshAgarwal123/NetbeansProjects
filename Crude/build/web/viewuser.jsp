<%-- 
    Document   : viewuser
    Created on : 30 Apr, 2021, 3:00:23 PM
    Author     : Divyansh Agarwal
--%>

<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.user"%>
<%@page import="com.UserDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="u" class="com.user"></jsp:useBean>
<jsp:setProperty property="*" name="u"></jsp:setProperty>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
                <%
                    List<user>list = UserDao.getAllRecords();
                    request.setAttribute("list", list);
                    
                %>
                <table width=50% border = 1 class ="table table-bordered table-hover"> 
                    <tr><th>ID</th><th>UserName</th><th>Userpassword</th><th>Country</th><th>More options</th></tr>
                            <c:forEach items= "${list}" var="u">
                        <tr><td>${u.getId()}</td>
                            <td>${u.getUsername()}</td>
                            <td>${u.getUserpassword()}</td>
                            <td>${u.getCountry()}</td>
                            <td><a href="editform.jsp?id=${u.getId()}" style="text-decoration:none">Edit</a><br> 
                             <a href="deleteuser.jsp?id=${u.getId()}" style="text-decoration:none">Delete</a></td></tr>  
                        <br><a href="adduser.jsp">Add New user</a>
                    </c:forEach>            
                </table>
                        
    </body>
</html>


