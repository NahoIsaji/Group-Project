import dbConnect.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author N_Isaji
 */

public class AccountCheck{

    public Boolean check(String email, String pass){

        Connection c = null;
        Statement s = null;        
        int count = 0;
        Boolean b = false;
        
        
        try{ 
            //call connection method to database
            DBConnect con = DBConnect.getInstance();
            c = con.connect();  

            //sql query
            //if the data exsists, it counts and return the value
            String sql = "SELECT count((email = '" + email + "' and password = '" + pass + "') or NULL) as count from user;";  
            PreparedStatement statement = c.prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            result.next();
            count = Integer.parseInt(result.getString("count"));
            
            //if the value is 1 (the data exsists in the database), this method will return true.
            if(count == 1){
                b = true;
            }
    
        } catch (SQLException e) {
                e.printStackTrace();
        } catch (ClassNotFoundException e) {
                e.printStackTrace();
        }  

        return b;
	}
    
}
