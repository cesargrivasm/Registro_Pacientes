/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionSQL;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author cient
 */
public class conexionSQL {
    
    Connection conectar=null;
    
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            conectar= (Connection) DriverManager.getConnection("jdbc:mysql://:ocalhost/laisabelahospital","root","12345678");
             
            JOptionPane.showMessageDialog(null, "conexion exitosa");
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "error de conexion " + e.getMessage());
            
        }
        return conectar;
    }
    
}
