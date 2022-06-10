import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author N_Isaji
 */
@WebServlet(urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   
            //get the user data from index.html 
            String emailAdd = request.getParameter("email");
            String pass = request.getParameter("password");
        
            // call check method from AccountCheck.java to verify account information
            AccountCheck check = new AccountCheck();
            Boolean result = check.check(emailAdd, pass);
            
            
            if(result == false){
                request.getRequestDispatcher("/error.html").forward(request, response);
            } else {
                request.getRequestDispatcher("/order.jsp").forward(request, response);
            }



    }

}
