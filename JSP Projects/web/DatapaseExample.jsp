<%-- 
    Document   : DatapaseExample
    Created on : 12 Mar, 2021, 12:17:52 PM
    Author     : divya
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
            try
            {
                String number1 = request.getParameter("n1");
                String number2 = request.getParameter("n2");
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JSPExample","root","Root");
                PreparedStatement ac = con.prepareStatement("insert into student(username,Password) values(?,?)");
                ac.setString(1,number1);
                ac.setString(2, number2);
                
                int i = ac.executeUpdate();
                if(i>0){
                   out.println("data has been submited successfully");
                }
            }
            catch(Exception e)
            {
                out.println(e);
            }
        %>
    </body>
</html>

