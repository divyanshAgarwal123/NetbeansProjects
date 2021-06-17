import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author divya
 */
@WebServlet(urlPatterns = {"/SecondServlet"})
public class SecondServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
                PrintWriter am=response.getWriter(); 
        String number1 = request.getParameter("n1");
        int number2 = Integer.parseInt(request.getParameter("n2"));
 
            try{
                
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","Root");
                PreparedStatement ac = con.prepareStatement("insert into student(name,rollno) values(?,?)");
                ac.setString(1,number1);
                ac.setInt(2,number2);
                int i = ac.executeUpdate();
            if(i>0)
            {
                am.print("data has been submited succesfully ");
            }
        }
            catch(Exception w)
            {
                 Logger.getLogger(SecondServlet.class.getName()).log(Level.SEVERE, null, w);
                 am.print(w);
            }
    }      
    }
