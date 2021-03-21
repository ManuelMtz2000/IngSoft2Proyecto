/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {
    public static Connection conectar(){
    
    try{
    Connection en;
        en = DriverManager.getConnection("jdbc:mysql://localhost/db_clinica","root","");
    return en;
    }catch(SQLException e){
    
        //System.out.println("Error en la conexion local" + e);
        JOptionPane.showMessageDialog(null,"Error en la conexion local" + e);
    
    }
    
    return(null);
    }
}
