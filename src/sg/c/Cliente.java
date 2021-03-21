package sg.c;


import java.sql.*;
import conexion.conexion;
import javax.swing.JOptionPane;

public class Cliente {
    
    public void Add(String name, String last, int age, String blood, String sex){
        int status = 0, res;
        try{    //Try Catch para conexión de base de datos
            //Se hace la conexión con la base de datos
            Connection en = conexion.conectar();
            //Query SQL
            PreparedStatement ps = en.prepareStatement("Insert INTO cliente VALUES (?,?,?,?,?,?,?)");
            //Inserción de los datos por posición
            ps.setInt(1, status);
            ps.setString(2, name);
            ps.setString(3, last);
            ps.setInt(4, age);
            ps.setString(5, blood);
            ps.setString(6, sex);
            ps.setInt(7, status);
            //Ejecución del query
            res = ps.executeUpdate();
            if(res == 0){   //Si algo no concuerda, lanza este mensaje.
                JOptionPane.showMessageDialog(null, "Cliente no valido.");
            } else {        //Si todo esta bien, inserto y muestra el mensaje
                JOptionPane.showMessageDialog(null, "Usuario registrado con exito.");
                //Regresa al menu de cliente
                menu_cliente nuevo = new menu_cliente();
                nuevo.setVisible(true);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error en la base de datos: " + e);
        }
    }
}
