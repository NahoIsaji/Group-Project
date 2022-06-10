package dbConnect;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author N_Isaji
 */
public class DBConnect {
    private static String drive = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/Fish_and_Chips_bites";
    private static String user = "";
    private static String password = "";  
    
    private Connection DBConnect() throws ClassNotFoundException{
        Connection con = null;
        
        try{
            Class.forName(drive);
            con = DriverManager.getConnection(url, user, password);
            
        } catch (Exception e){
            throw new IllegalStateException(e);
        }
        return con;
    }
    
    public Connection connect() throws ClassNotFoundException{
        Connection c = DBConnect();
        return c;
    }
    
    //return the only instance
    public static synchronized DBConnect getInstance(){
        return InstanceHolder.INSTANCE;
    }
    
     public static class InstanceHolder {
            private static final DBConnect INSTANCE = new DBConnect();         
     }        
    
}
