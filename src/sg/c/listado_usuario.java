
package sg.c;

import java.sql.*;
import javax.swing.JOptionPane;
import conexion.conexion;
import javax.swing.table.DefaultTableModel;

public class listado_usuario extends javax.swing.JFrame {

    public listado_usuario() {
        initComponents();
        ///Definimos n titulo para la ventana
        this.setTitle("Modificar usuario");
        ///Colocamos la ventana en medio de la panatalla
        this.setLocationRelativeTo(null);
        mostrarDatos();
    }
    public void mostrarDatos(){
        String[] titulos = {"Nombre", "apellido", "Usuario", "Contraseña", "Telefono", "sucursal", "tipo"};
        String[] registros = new String[7];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        int estatus = 0;
        String sql = "Select * From usuario Where estatus = " + estatus;

        try {
            ///Concecta con la base de datos
            Connection en = conexion.conectar();
            ///Crea la sentencia
            Statement st = en.createStatement();
            ///Ejecuta la sentencia
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("nombre");
                registros[1] = rs.getString("apellido");
                registros[2] = rs.getString("usuario");
                registros[3] = rs.getString("contrasena");
                registros[4] = rs.getString("telefono");
                registros[5] = rs.getString("sucursal");
                if (rs.getInt("tipo") == 1) {
                    registros[6] = "Recepcionista";
                } else {
                    registros[6] = "Administrador";
                }
                modelo.addRow(registros);
            }
            jtTable.setModel(modelo);
        } catch (SQLException e) {
            System.err.println("Error en el boton ingresar" + e);
            JOptionPane.showMessageDialog(null, "Error al iniciar sesion");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(717, 500));
        setMinimumSize(new java.awt.Dimension(717, 500));
        setPreferredSize(new java.awt.Dimension(717, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Listado de usuarios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jButton2.setBackground(new java.awt.Color(51, 51, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Regresar al menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 140, 30));

        jtTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 670, 340));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_usuarios.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        menu_usuario nuevo = new menu_usuario();
        nuevo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new listado_usuario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtTable;
    // End of variables declaration//GEN-END:variables

}
