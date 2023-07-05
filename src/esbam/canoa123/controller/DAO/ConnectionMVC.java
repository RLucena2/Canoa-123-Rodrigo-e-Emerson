
package esbam.canoa123.controller.DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConnectionMVC {
    
    public Connection conectaBD() {
        Connection conn = null;
        
        try {
          //  String url = "jdbc:mysql://localhost:3306/canoa123?useSSL=false",user:"root",password:"abc123..";
            //conn = DriverManager.getConnection(url);
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/canoa123?useSSL=false","root", "abc123..");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "conexaoDAO"+erro.getMessage());
        }
        return conn;
    }
}


    
    

