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
@WebServlet(urlPatterns = {"/ThirdServlet"})
public class ThirdServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
                PrintWriter am=response.getWriter(); 
            try{
                
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","Root");
                PreparedStatement ac = con.prepareStatement("select * from student");
                am.print("<html>");
                am.print("<head>");
                am.print("<meta charset=\"utf-8\">");
                am.print("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
                am.print("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">");
                am.print("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>");
                am.print("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>");
                am.print("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>");
                am.print("<meta charset=\"UTF-8\">");
                am.print("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
                am.print("</head>");
                am.print("<body>");
                                am.print("<caption> Result: </caption>");
                am.print("<table width=50% border = 1 class ='table table-dark table-bordered table-hover'>");
                ResultSet rs = ac.executeQuery();
                ResultSetMetaData rsmd =rs.getMetaData();
                int total = rsmd.getColumnCount();
                am.print("<tr>");
                for(int i=1 ; i<=total;i++)
                {
                   am.print("<th>"+rsmd.getColumnName(i)+"</th>");
                }
                am.print("</tr>");
                while(rs.next())
                {
                    am.print("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getInt(3)+"</td></tr>");
                }
                am.print("</table>");
                am.print("</body>");
                am.print("</html>");
        }       
            catch(Exception w)
            {
                 Logger.getLogger(ThirdServlet.class.getName()).log(Level.SEVERE, null, w);
                 am.print(w);
            }
    }      
    }
