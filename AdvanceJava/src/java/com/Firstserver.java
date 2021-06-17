/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//we can create server site programing 
package com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Firstserver extends HttpServlet {

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
        am.print("<h3>Thanks For you Response</h3>");
        
        }
    }
