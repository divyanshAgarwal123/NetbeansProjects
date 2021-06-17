<%-- 
    Document   : editform
    Created on : 1 May, 2021, 4:32:49 PM
    Author     : Divyansh Agarwal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.user"%>
<%@page import="com.UserDao"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         
    </head>
    <body>
        <%
           String n= request.getParameter("id");
           user u = UserDao.getRecordById(Integer.parseInt(n));
            %>
            <h1>Edit Form</h1>
       
            <form action ="edituser.jsp" method="post">
                <input type="hidden" name="id" value="<%=u.getId() %>"/>
                 
           
            <table>
                <tr><td>Please Enter  User Name </td><td><input type="text" name="name" class="form-control" value="<%= u.getUsername()%>"/></td>    
                </tr>  
                <tr><td>Please Enter  User password </td><td><input type="password" name="password" class="form-control" value="<%= u.getUserpassword()%>"/></td>    
                </tr>
<tr><td>Country</td> <td>
        <select name="country" class="form-control" style="width:155px">
            <option>India</option>
            <option>pakistan</option>
            <option>Australia</option>
            <option>Canada</option>
            <option>SriLanka</option>
            <option>Other</option>
        </select>
    </td></tr>  
<tr><td colspan="2"><input type="submit" value="Edit User" class="btn btn-primary"/></td>
</tr>
       
  </table>
            </center>
       
            </form>
    </body>
</html>

