
package sg.c;

import java.sql.*;
import conexion.conexion;
import javax.swing.JOptionPane;

public class Sucursal {
    
    public void Add(int phone, String name, String place, String in, String out){
        try{
            //CONEXION Y SENTENCIA SQL
            Connection en = conexion.conectar();
            PreparedStatement ps = en.prepareStatement("Insert INTO sucursal(direccion,numero,telefono,apertura,cierre) VALUES (?,?,?,?,?)");
            ps.setString(1,place);
            ps.setString(2,name);
            ps.setInt(3,phone);
            ps.setString(4,in);
            ps.setString(5,out);
            int res = ps.executeUpdate();
            if(res == 0){
                JOptionPane.showMessageDialog(null, "Nombre de sucursal no valido");
            } else {
                JOptionPane.showMessageDialog(null, "Sucursal registrada con exito.");
                new menu_sucursal().setVisible(true);
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión");
        }
    }
    
    public String Search(String search){
        try{
            String sql = "SELECT * FROM sucursal WHERE numero = '"+search+"'";
            Connection en = conexion.conectar();
            Statement st = en.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                return search;
            } else {
                JOptionPane.showConfirmDialog(null,"Usuario no encontrado.");
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en la base de datos: " + e);
        }
        return "n";
    }
    
    public void Delete(int estatus, String search, int delete){
        try{
               ///Genera el query
            String sql     = "SELECT * FROM sucursal WHERE numero = '"+search+"'";
               ///Concecta con la base de datos
            Connection en = conexion.conectar();
               ///Crea la sentencia
            Statement st = en.createStatement();
               ///Ejecuta la sentencia
            ResultSet rs = st.executeQuery(sql);
               ///Verifica el resultado
            if(rs.next()){
                String message = "Desea eliminar esta sucursal?";
                int result = JOptionPane.showConfirmDialog(null,message,"Eliminar usuario",JOptionPane.YES_NO_OPTION);
                if(result == JOptionPane.YES_OPTION){
                    String sql_delete1 = "DELETE FROM usuario WHERE sucursal = ?";
                    PreparedStatement std = en.prepareStatement(sql_delete1);
                    std.setString(1, search);
                    std.execute();
                    String sql_delete = "DELETE FROM sucursal WHERE numero = ?";
                    PreparedStatement std1 = en.prepareStatement(sql_delete);
                    std1.setString(1, search);
                    std1.execute();
                    JOptionPane.showMessageDialog(null,"Sucursal eliminada");
                    new menu_sucursal().setVisible(true);
                } else if(result == JOptionPane.NO_OPTION){
                    JOptionPane.showMessageDialog(null,"Sucursal no eliminada");
                }
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error en la base de datos: " + e);
        }
    }
}
