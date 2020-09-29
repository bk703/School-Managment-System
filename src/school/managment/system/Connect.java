/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.managment.system;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ABU BAKAR
 */
class Connect {
    
static String dbURL = "jdbc:mysql://127.0.0.1:3306/sms";
static String username = "root";
static String password = "";
 
        public static Connection ConnectDB(){
        
try {
    Connection con=null;
    Connection conn = DriverManager.getConnection(dbURL, username, password);
      return conn;
}    
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }      

}
}
