/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;

/**
 *
 * @author ELCOT
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","sandy","sHj@6378#jw");
           return con;
        }   
        catch(Exception e)
        {
            return null;
        }
            
    }
    
}
