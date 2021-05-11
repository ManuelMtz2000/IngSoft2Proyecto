
package sg.c;

import java.sql.*;
import conexion.conexion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class listado_sucursal extends javax.swing.JFrame {

    public listado_sucursal() {
        initComponents();
        ///Definimos un titulo para la ventana
        this.setTitle("Listado sucursal");
        ///Colocamos la ventana en medio de la panatalla
        this.setLocationRelativeTo(null);
        mostrarDatos();
    }
    public void mostrarDatos(){
        
        String[] titulos = {"Código", "Direccion", "Telefono", "Apertura", "Cierre"};
        String[] registros = new String[5];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        String sql = "Select * From sucursal ";

        try {
            ///Concecta con la base de datos
            Connection en = conexion.conectar();
            ///Crea la sentencia
            Statement st = en.createStatement();
            ///Ejecuta la sentencia
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("numero");
                registros[1] = rs.getString("direccion");
                registros[2] = rs.getString("telefono");
                registros[3] = rs.getString("apertura") + " AM";
                registros[4] = rs.getString("cierre") + " PM";
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
        jLabel1.setText("Listado de sucursales");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jButton2.setBackground(new java.awt.Color(51, 51, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Regresar al menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 170, 30));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 680, 390));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_usuarios.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       menu_sucursal nuevo = new menu_sucursal();
        nuevo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new listado_sucursal().setVisible(true);
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
