<%-- 
    Document   : index.jsp
    Created on : 17 Mar, 2021, 11:58:33 AM
    Author     : divya
--%>
<%@page import="com.Information"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="obj" class="com.Information"/>
        <%
//                  Information a = new Information();
//                  a.setFee(2134);
//                  out.print(a.getFee());   
                    double fees = Double.parseDouble(request.getParameter("fee"));
                    String name = request.getParameter("name");
                    int id = Integer.parseInt(request.getParameter("id"));
                    obj.setFee(fees);
                    obj.setName(name);
                    obj.setId(id);
                    out.print(obj.getFee());
                    out.print(obj.getName());
                    out.print(obj.getId());
        %>
    </body>
</html>
