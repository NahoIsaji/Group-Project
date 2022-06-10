import dbConnect.DBConnect;
import java.sql.*;
/**
 *
 * @author N_Isaji
 */

public class Insert{


    public int insert(Data d){
        
        Connection c = null;
        Statement s = null;
        int count = 0;
        
        String sql = "INSERT INTO orders VALUES(null,'" 
                + d.getFish() + "','"
                + d.getFishNum() + "','"
                + d.getDrink() + "','"
                + d.getDrinkNum() + "','"
                + d.getExtra() + "','"
                + d.getExtraNum()+ "',"
                + "'Ongoing')";
    
        try{
            DBConnect con = DBConnect.getInstance();

            c = con.connect();  
            s = c.createStatement();
            count = s.executeUpdate(sql);
            
        } catch(ClassNotFoundException | SQLException e) {
            throw new IllegalStateException(e);
        } finally{
            if(s != null){
                try{
                    s.close();
                }catch(SQLException ignore){}
            } if(c != null){
                try{
                    c.close();
                }catch(SQLException ignore){}
            }
        }
        return count;
    }
}    
    
    
    
    
    
    
    
    
    
    

