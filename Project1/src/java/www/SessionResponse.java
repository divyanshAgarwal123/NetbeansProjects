/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package www;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author divya
 */
public class SessionResponse extends HttpServlet {
            public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
                PrintWriter am=response.getWriter();
                HttpSession ht = request.getSession(true);
                String a = (String)ht.getAttribute("hello");
                String b = (String)ht.getAttribute("hello1");
                am.print("<p style='position:relative;top:100px;left:100px;z-index:1;color:black'>"+a+"</p>");
                
                RequestDispatcher rd = request.getRequestDispatcher("NavBar.html");
                rd.include(request,response);
                
        }
    }

