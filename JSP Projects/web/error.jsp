<%-- 
    Document   : error
    Created on : 17 Mar, 2021, 12:24:59 PM
    Author     : divya
--%>
<%@page isErrorPage="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Exception is: <%= exception %>       
    </body>
</html>
