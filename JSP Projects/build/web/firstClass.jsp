<%-- 
    Document   : firstClass
    Created on : 9 Mar, 2021, 11:54:07 AM
    Author     : divya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            //implecit object is created default
            //request and respnse are creeated default
            
            //scriplet tag gives us the ablity of writting java code in hatml page
            //three types of scripting element
            
            //1.scriplet tag
            //2.explaration tag
            //3.declaration tag  
          
            //scriplet tag is used to execute jave code in jsp syntax 
           
            String number1 = request.getParameter("n1");
            String number2 = request.getParameter("n2");
            String number3 = request.getParameter("n3");
            out.println("your name is"+number1);
        %>
        <br>
        <%out.println("your name is"+number1);%>
        <br>
        <%out.println("your country is"+number3);%>
    </body>
</html>
