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

@WebServlet(urlPatterns = {"/InsertServlet"})
public class InsertServlet extends HttpServlet{


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try{             
            //get and set paramaters by using Data class
            String fish = request.getParameter("fish");
            String fishNum  = request.getParameter("fishNum");
            String drink = request.getParameter("drink");
            String drinkNum = request.getParameter("drinkNum");     
            String extra = request.getParameter("extra");   
            String extraNum = request.getParameter("extraNum");     

            //DAO object declaration (Data.java)
            Data data = new Data(fish, fishNum, drink, drinkNum, extra, extraNum);
            
            //DAO object declaration (Insert.java)
            Insert insert = new Insert();            
            //call an insert method
            insert.insert(data);
    
            
            
    }catch(IllegalStateException e){
        System.out.println("Database connection error.");
    }catch(Exception e){
        System.out.println("Unkown error ocured.");
    }finally{
            getServletContext().getRequestDispatcher("/orderConfirmation.jsp").forward(request, response);
        }
    }
}
