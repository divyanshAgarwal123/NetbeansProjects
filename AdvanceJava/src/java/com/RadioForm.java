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
public class RadioForm extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
                PrintWriter am=response.getWriter(); 
        am.print("<html>");
        am.print("<head>");
        am.print("</head>");
        am.print("<body style='background-color:green' >");
        am.print("</body>");
        am.print("</html>");
        String number1=request.getParameter("n1");
        String number2 = request.getParameter("n2");
        
        if(number1.equals("Divyansh") &&  number2.equals("1234"))
        {
        //only for internal use:
//            RequestDispatcher rd = request.getRequestDispatcher("https://www.facebook.com/");
//            rd.forward(request, response);
        //only for external use:
            response.sendRedirect("https://www.facebook.com/");
        }
        else
        {
            // Forward 
            am.print("Sorry the username and password is incorrect");
            RequestDispatcher rd = request.getRequestDispatcher("RadioForm.html");
            rd.forward(request, response);
           
        }
//        String f = request.getParameter("n3");
//        double a = Double.parseDouble(number1);
//        double b = Double.parseDouble(number2);
//        
//        if(f.equals("plus")){
//             am.print("the number is "+(a+b));
//        }
//        if(f.equals("minus")){
//            am.print("the number is "+(a-b));
//        }
//        if(f.equals("into")){
//            am.print("the number is "+(a*b));
//        }
//        if(f.equals("divide")){
//            am.print("the number is "+(a/b));
        }
    }

