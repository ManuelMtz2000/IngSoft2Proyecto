/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sg.c;

import java.sql.*;
import conexion.conexion;
import javax.swing.JOptionPane;

public class agregar_sucursal extends javax.swing.JFrame {

    /** Creates new form agregar_sucursal */
    public agregar_sucursal() {
        initComponents();
        ///Definimos un titulo para la ventana
        setTitle("Agregar sucursal");
        ///Colocamos la ventana en medio de la panatalla
        setLocationRelativeTo(null);
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtName = new javax.swing.JTextField();
        jtPlace = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtOut = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jtPhone = new javax.swing.JTextField();
        jtIn = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(717, 500));
        setMinimumSize(new java.awt.Dimension(717, 500));
        setPreferredSize(new java.awt.Dimension(717, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Registrar Sucursal ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Ubicación");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));
        getContentPane().add(jtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 180, 30));
        getContentPane().add(jtPlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 180, 30));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 290, 100, 30));

        jButton2.setBackground(new java.awt.Color(51, 51, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Regresar al menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 140, 30));

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 110, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setText("Hora de apertura");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setText("Hora de cierre");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        jtOut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "20:00", "21:00", "22:00" }));
        getContentPane().add(jtOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 90, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setText("Telefono");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));
        getContentPane().add(jtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 180, 30));

        jtIn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "7:00", "8:00", "9:00" }));
        getContentPane().add(jtIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 90, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Cerrar Programa 
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        menu_sucursal nuevo = new menu_sucursal();
        nuevo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ///Validamos que todas las variables no esten vacias
        if(jtName.getText().isEmpty() ||jtPlace.getText().isEmpty()||jtPhone.getText().isEmpty()||jtIn.getSelectedIndex() == 0 || jtOut.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null,"Campos incompletos");
        }
        else{
            int phone;
            String name,place,in,out;
            phone   = Integer.parseInt(jtPhone.getText());
            in      = jtIn.getSelectedItem().toString();
            out     = jtOut.getSelectedItem().toString();
            name    = jtName.getText();
            place   = jtPlace.getText();
            //Ingresamos los datos a la base de datos 
            try{
                    ///Concecta con la base de datos
            Connection en = conexion.conectar();
            PreparedStatement ps = en.prepareStatement("Insert INTO sucursal VALUES (?,?,?,?,?)");
            ps.setString(1,place);
            ps.setString(2,name);
            ps.setInt(3,phone);
            ps.setString(4,in);
            ps.setString(5,out);

            int res = ps.executeUpdate();
            if(res == 0){
                JOptionPane.showMessageDialog(null,"Nombre de sucursal no valido");
            }
            else{
                JOptionPane.showMessageDialog(null,"Sucursal registrado con exito");
                menu_sucursal nuevo = new menu_sucursal();
                nuevo.setVisible(true);
                this.dispose();
            }
            }catch(SQLException e){
                System.err.println("Error en el boton ingresar" + e);
               JOptionPane.showMessageDialog(null,"Nombre de usuario no valido");
               jtName.setText("");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(agregar_sucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agregar_sucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agregar_sucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agregar_sucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agregar_sucursal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> jtIn;
    private javax.swing.JTextField jtName;
    private javax.swing.JComboBox<String> jtOut;
    private javax.swing.JTextField jtPhone;
    private javax.swing.JTextField jtPlace;
    // End of variables declaration//GEN-END:variables

}