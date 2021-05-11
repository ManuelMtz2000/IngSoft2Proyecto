
package sg.c;

import java.sql.*;
import conexion.conexion;
import javax.swing.JOptionPane;

public class Usuario {
    
    public void Add(int phone, int type, int status, String name, String last, String user, String pass, String sucursal){
        try{
            Connection en = conexion.conectar();
            PreparedStatement ps = en.prepareStatement("INSERT INTO usuario(nombre,apellido,usuario,contrasena,sucursal,telefono,tipo,estatus) VALUES(?,?,?,?,?,?,?,?)");
            ps.setString(1, name);
            ps.setString(2, last);
            ps.setString(3, user);
            ps.setString(4, pass);
            ps.setString(5, sucursal);
            ps.setInt(6, phone);
            ps.setInt(7, type);
            ps.setInt(8, status);
            int res = ps.executeUpdate();
            if(res == 0){
                JOptionPane.showMessageDialog(null,"Usuario no valido");
            } else {
                JOptionPane.showMessageDialog(null,"Usuario registrado con exito");
                new menu_usuario().setVisible(true);
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error de conexion: "+e);
        }
    }
    
    public String Search(String search){
        try{
            String sql = "SELECT * FROM usuario WHERE estatus = 0 AND usuario = '"+search+"'";
            Connection en = conexion.conectar();
            Statement st = en.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                return search;
            } else {
                JOptionPane.showMessageDialog(null,"Uusario no encontrado");
            }
        } 
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error de conexion: " + e);
        }
        return "n";
    }
    
    public void Delete(int estatus, String search, int delete){
        try{
            String sql = "SELECT * FROM usuario WHERE estatus = '"+estatus+"' AND usuario = '"+search+"'";
            Connection en = conexion.conectar();
            Statement st = en.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                String message = "Deseas eliminar este usuario?";
                int result = JOptionPane.showConfirmDialog(null, message, "Eliminar usuario", JOptionPane.YES_NO_OPTION);
                if(result == JOptionPane.YES_OPTION){
                    String sql_delete = "UPDATE usuario SET estatus = ? WHERE usuario = ?";
                    PreparedStatement std = en.prepareStatement(sql_delete);
                    std.setInt(1, delete);
                    std.setString(2, search);
                    std.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Usuario eliminado");
                    new menu_usuario().setVisible(true);
                } else if(result == JOptionPane.NO_OPTION){
                    JOptionPane.showMessageDialog(null,"Usuario no eliminado");
                }
            } else {
                JOptionPane.showMessageDialog(null,"Usuario no encontrado");
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error de conexion: " + e);
        }
    }
}
