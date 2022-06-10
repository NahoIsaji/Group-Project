
import dbConnect.DBConnect;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author N_Isaji
 */
public class Update {
   
    public int updateState(int id, String state){
        Connection c = null;
        Statement s = null;
        int ud = 0;
        
        String sql = "UPDATE orders SET "
                + "status = '"+ state +"'"
                + "WHERE id = '" + id + "'";
               
        try{
            DBConnect con = DBConnect.getInstance();
            c = con.connect();  
            s = c.createStatement();
            ud = s.executeUpdate(sql);
            
        }catch(Exception e){
            throw new IllegalStateException(e);
        }finally{ 
            if(s != null){
                try{s.close();}catch(SQLException ignore){}
            }if(c != null){
                try{c.close();}catch(SQLException ignore){}
            }
        }
        return ud;
}}