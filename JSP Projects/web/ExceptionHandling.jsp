<%-- 
    Document   : ExceptionHandling
    Created on : 17 Mar, 2021, 12:21:02 PM
    Author     : divya
--%>
<%@page errorPage="error.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            try
            {
            int number1 = Integer.parseInt(request.getParameter("n1"));
            int number2 = Integer.parseInt(request.getParameter("n2"));
            out.println(number1/number2);
            }
            catch(Exception e)
            {
                out.print("Please check what you have written");
            }
            %>
    </body>
</html>
