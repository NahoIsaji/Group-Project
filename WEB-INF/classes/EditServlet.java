import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author N_Isaji
 */

@WebServlet(urlPatterns = {"/EditServlet"})
public class EditServlet extends HttpServlet {

        Connection c = null;
        Statement s = null;
        
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   
        int id = Integer.parseInt(request.getParameter("radioButton"));
        String state = request.getParameter("state");
        
        Update u = new Update();
        u.updateState(id, state);       
            getServletContext().getRequestDispatcher("/display.jsp").forward(request, response);

    }
}
