
package sg.c;

import java.sql.*;
import javax.swing.JOptionPane;
import conexion.conexion;

public class agregar_usuario extends javax.swing.JFrame {

    public agregar_usuario() {
        initComponents();
        ///Definimos n titulo para la ventana
        this.setTitle("Agregar usuario");
        ///Colocamos la ventana en medio de la panatalla
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.rellenarSucursales();
    }
    public void rellenarSucursales(){
        String sql = "Select direccion From sucursal";
        try {
            ///Concecta con la base de datos
            Connection en = conexion.conectar();
            ///Crea la sentencia
            Statement st = en.createStatement();
            ///Ejecuta la sentencia
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                jcCombo.addItem(rs.getString("direccion"));

            }
        } catch (SQLException e) {
            System.err.println("Error en el boton ingresar" + e);
            JOptionPane.showMessageDialog(null, "Error al iniciar sesion");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcCombo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtPhone = new javax.swing.JTextField();
        jcType = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jtName = new javax.swing.JTextField();
        jtLast = new javax.swing.JTextField();
        jtUser = new javax.swing.JTextField();
        jtPass = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(717, 500));
        setMinimumSize(new java.awt.Dimension(717, 500));
        setPreferredSize(new java.awt.Dimension(717, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona" }));
        jcCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcComboActionPerformed(evt);
            }
        });
        getContentPane().add(jcCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 120, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Agregar usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Apellido");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setText("Usuario");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setText("Contraseña");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setText("Telefono");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setText("Sucursal");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setText("Tipo usuario");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));
        getContentPane().add(jtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 180, 30));

        jcType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Recepcionista", "Administrador", " " }));
        getContentPane().add(jcType, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 120, 30));

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Regrasar al menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 170, 40));

        jButton3.setBackground(new java.awt.Color(51, 51, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Agregar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 110, 40));
        getContentPane().add(jtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 180, 30));
        getContentPane().add(jtLast, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 180, 30));
        getContentPane().add(jtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 180, 30));
        getContentPane().add(jtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 180, 30));

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Borrar todo");
        jButton4.setActionCommand("");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 120, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcComboActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
         ///Validamos que todas las variables no esten vacias
        if (jtName.getText().isEmpty() || jtLast.getText().isEmpty() || jtUser.getText().isEmpty() || jtPass.getText().isEmpty() || jcType.getSelectedIndex() == 0 || jcCombo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Campos incompletos");
        } else {
            int phone, type, status = 0;
            String name, last, user, pass, sucursal;
            phone = Integer.parseInt(jtPhone.getText());
            type = jcType.getSelectedIndex();
            name = jtName.getText();
            last = jtLast.getText();
            user = jtUser.getText();
            pass = jtPass.getText();
            sucursal = jcCombo.getSelectedItem().toString();
            jtUser.getText();
            pass = jtPass.getText();
            try {
                Connection en = conexion.conectar();
                PreparedStatement ps = en.prepareStatement("SELECT numero FROM sucursal WHERE direccion = '" + jcCombo.getSelectedItem().toString() + "'");
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    String suc = rs.getString("numero");
                    Usuario u = new Usuario();
                    u.Add(phone, type, status, name, last, user, pass, suc);
                    this.dispose();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error de conexion: " + e);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        menu_usuario nuevo = new menu_usuario();
        nuevo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jtName.setText("");
        jtLast.setText("");
        jtUser.setText("");
        jtPass.setText("");
        jtPhone.setText("");
        jcType.setSelectedIndex(0);
        jcCombo.setSelectedIndex(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new agregar_usuario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jcCombo;
    private javax.swing.JComboBox<String> jcType;
    private javax.swing.JTextField jtLast;
    private javax.swing.JTextField jtName;
    private javax.swing.JTextField jtPass;
    private javax.swing.JTextField jtPhone;
    private javax.swing.JTextField jtUser;
    // End of variables declaration//GEN-END:variables

}
