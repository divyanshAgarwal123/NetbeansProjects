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
public class SessionAction extends HttpServlet {

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
                PrintWriter am = response.getWriter();
                
                String a = request.getParameter("n1");
                String b = request.getParameter("n2");
                if(a.equals("Divyansh") && b.equals("1234"))
                {
                HttpSession ht = request.getSession(true);
                ht.setAttribute("hello", a);
                ht.setAttribute("hello1", b);
                am.print("<a href ='SessionResponse'> hello </a>");
            
                }
                else{
                    am.print("User name or password is wrong");
                }
        }
    }
