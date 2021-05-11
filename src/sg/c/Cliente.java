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
    
    public int Search(int search){
            try{
                String sql = "SELECT * FROM cliente WHERE estatus = 0 AND id = "+search+"";
                Connection en = conexion.conectar();
                Statement st = en.createStatement();
                ResultSet rs = st.executeQuery(sql);
                if(rs.next()){
                    return search;
                } else {
                    JOptionPane.showMessageDialog(null,"Usuario no encontrado");
                }
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Error en la base de datos: " + e);
            }
            return -1;
        }
    
    public void Delete(int estatus, int search, int delete){
        try {
            String sql     = "SELECT * FROM cliente WHERE estatus = "+estatus +" AND id = "+search;
               ///Concecta con la base de datos
            Connection en = conexion.conectar();
               ///Crea la sentencia
            Statement st = en.createStatement();
               ///Ejecuta la sentencia
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                    String message = "Desea eliminar este usuario";
                    String title = "Eliminar usuario";
                    int result = JOptionPane.showConfirmDialog(null,message,title,JOptionPane.YES_NO_OPTION);
                    if(result == JOptionPane.YES_OPTION){
                       String sql_delete =  "Update cliente set estatus = ? Where id = ?";
                       PreparedStatement std = en.prepareStatement(sql_delete);
                       std.setInt(1,delete);
                       std.setInt(2,search);
                       std.executeUpdate();
                       JOptionPane.showMessageDialog(null,"Usuario eliminado");
                       menu_cliente nuevo = new menu_cliente();
                       nuevo.setVisible(true);
                    }
                    else if(result == JOptionPane.NO_OPTION){
                        JOptionPane.showMessageDialog(null,"Usuario no eliminado");
                    }
            }
            else {
                //Mensajes de error
                 JOptionPane.showMessageDialog(null,"Usuario no encontrado");
                //Limpiamos los textBox
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error en la base de datos: " + e);
        }
    }
    public void Update(String name, String last, String blood, String sex, int age){
        
        try {
            String sql = "UPDATE cliente SET nombre = ?, apellido = ?, edad = ?, tipo_sangre = ?, sexo = ? WHERE id = ?";
            Connection en = conexion.conectar();
            PreparedStatement ps = en.prepareStatement(sql);
        } 
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error en la base de datos: " + e);
        }
        
    }
}
