/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author divya
 */
public class DispatcherQues extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
                PrintWriter am=response.getWriter(); 
        am.print("<html>");
        am.print("<head>");
        am.print("</head>");
        am.print("<body style='background-color:green' >");
        am.print("</body>");
        am.print("</html>");
        try
        {
        String number1=request.getParameter("n1");
        
        //
        
            RequestDispatcher rd = request.getRequestDispatcher("output.html");
            rd.forward(request, response);
        }
        catch(Exception e)
        {
            RequestDispatcher rd = request.getRequestDispatcher("error.html");
            rd.forward(request, response);
        }
        }
}