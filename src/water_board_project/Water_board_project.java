/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package water_board_project;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dhanushka weerakoon
 */
public class Water_board_project {

    Connection con;
    PreparedStatement pst;
    
    public static String current_username;
    public static int current_userID;
    
    public Water_board_project(){
        
    }
    public static void main(String[] args) {
        
    }
    
    public void Connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/waterboard_project", "root", "Dhanush#1");
            System.out.println("Connected");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Water_board_project.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Water_board_project.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
}
