import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
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
@WebServlet(urlPatterns = {"/FifthServlet"})
public class FifthServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
                PrintWriter am=response.getWriter(); 
        String number1 = request.getParameter("n1");
        String number2 = request.getParameter("n2");
            try{
                
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","Root");
                PreparedStatement ac = con.prepareStatement("select * from details where name=? and password=? ");
                ac.setString(1,number1);
                ac.setString(2, number2);
                ResultSet rs = ac.executeQuery();
                if(rs.next())
                {
                  am.print("welcome");
                }
                else
                {
                    am.print("error");
                }
        }
            catch(Exception w)
            {
                 Logger.getLogger(FifthServlet.class.getName()).log(Level.SEVERE, null, w);
                 am.print(w);
            }
    }      
    }
