/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;
import java.sql.*;
/**
 *
 * @author yashc
 */
public class ConnectionProvider {
    
    private static Connection con;
    public static Connection getConnection()
    {
        try 
        {
             if(con==null)
             {
                 //            driver class load
            Class.forName("com.mysql.jdbc.Driver");
            
//           create a connection
           con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/alumni_tracking_system", "root", "root1");
           
             }
           
           
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return con;
    }
}
