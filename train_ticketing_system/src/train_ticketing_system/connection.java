/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package train_ticketing_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author bassant
 */
public class connection {
    


       Connection c;
    Statement s;

    connection(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        c= DriverManager.getConnection("jdbc:mysql:///train_ticketing", "root","PFH#23kgrw9");
        s= c.createStatement();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
}


