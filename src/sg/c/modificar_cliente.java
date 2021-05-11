
package sg.c;

import java.sql.*;
import conexion.conexion;
import javax.swing.JOptionPane;

public class modificar_cliente extends javax.swing.JFrame {
    
    int id;
    public modificar_cliente(int id) {
        initComponents();
        ///Definimos un titulo para la ventana
        this.setTitle("Modificar clíentes");
        ///Colocamos la ventana en medio de la panatalla
        this.setLocationRelativeTo(null);
        this.id = id;
        actualizar_datos();
    }
    public void actualizar_datos(){
        String sql = "SELECT * FROM cliente WHERE id = " + id;
        try {
            ///Concecta con la base de datos
            Connection en = conexion.conectar();
            ///Crea la sentencia
            Statement st = en.createStatement();
            ///Ejecuta la sentencia
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                jtName.setText(rs.getString("nombre"));
                jtLast.setText(rs.getString("apellido"));
                jtAge.setSelectedIndex(rs.getInt("edad"));
                switch (rs.getString("tipo_sangre")) {
                    case "A+":
                        jtBlood.setSelectedIndex(1);
                        break;
                    case "A-":
                        jtBlood.setSelectedIndex(2);
                        break;
                    case "B+":
                        jtBlood.setSelectedIndex(3);
                        break;
                    case "B-":
                        jtBlood.setSelectedIndex(4);
                        break;
                    case "O+":
                        jtBlood.setSelectedIndex(5);
                        break;
                    case "O-":
                        jtBlood.setSelectedIndex(6);
                        break;
                    case "AB+":
                        jtBlood.setSelectedIndex(7);
                        break;
                    case "AB-":
                        jtBlood.setSelectedIndex(8);
                        break;
                }
                if (rs.getString("sexo") == "M") {
                    jtSex.setSelectedIndex(1);
                } else {
                    jtSex.setSelectedIndex(1);
                }
            }
        } catch (SQLException e) {
            System.err.println("Error en el boton ingresar" + e);
            JOptionPane.showMessageDialog(null, "Error al iniciar sesion");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtName = new javax.swing.JTextField();
        jtLast = new javax.swing.JTextField();
        jtAge = new javax.swing.JComboBox<>();
        jtBlood = new javax.swing.JComboBox<>();
        jtSex = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(717, 500));
        setMinimumSize(new java.awt.Dimension(717, 500));
        setPreferredSize(new java.awt.Dimension(717, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Modificar cliente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Apellidos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setText("Edad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setText("Tipo de sangre");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setText("Sexo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        jtName.setToolTipText("");
        getContentPane().add(jtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 180, 30));
        getContentPane().add(jtLast, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 180, 30));

        jtAge.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Idef", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        getContentPane().add(jtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 100, 30));

        jtBlood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-", " " }));
        getContentPane().add(jtBlood, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 100, 30));

        jtSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Masculino", "Femenino", " " }));
        getContentPane().add(jtSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 100, 30));

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Regresar al menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 140, 30));

        jButton3.setBackground(new java.awt.Color(51, 51, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 110, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Validamos que no esten vacios
        if (jtName.getText().isEmpty() || jtLast.getText().isEmpty() || jtAge.getSelectedIndex() == 0 || jtBlood.getSelectedIndex() == 0 || jtSex.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Campos incompletos");
        } else {
            ///Definimos variables
            String name, last, blood, sex;
            int age;
            ///Le asignamos valores
            name = jtName.getText();
            last = jtLast.getText();
            blood = jtBlood.getSelectedItem().toString();
            age = Integer.parseInt(jtAge.getSelectedItem().toString());
            if (jtSex.getSelectedItem().toString().equals("Masculino")) {
                sex = "M";
            } else {
                sex = "F";
            }
            try {
                ///Concecta con la base de datos
                Connection en = conexion.conectar();
                PreparedStatement ps = en.prepareStatement("Update cliente set nombre = ?, apellido = ?, edad = ?, tipo_sangre = ?, sexo = ? Where id = ?");

                ps.setString(1, name);
                ps.setString(2, last);
                ps.setInt(3, age);
                ps.setString(4, blood);
                ps.setString(5, sex);
                ps.setInt(6, id);

                int res = ps.executeUpdate();
                if (res == 0) {
                    JOptionPane.showMessageDialog(null, "Nombre de usuario no valido");
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario modificado con exito");
                    menu_cliente nuevo = new menu_cliente();
                    nuevo.setVisible(true);
                    this.dispose();
                }
            } catch (SQLException e) {
                System.err.println("Error en el boton ingresar" + e);
                JOptionPane.showMessageDialog(null, "id de cliente no valido");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        menu_cliente nuevo = new menu_cliente();
        nuevo.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(modificar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modificar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modificar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modificar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new modificar_cliente(0).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> jtAge;
    private javax.swing.JComboBox<String> jtBlood;
    private javax.swing.JTextField jtLast;
    private javax.swing.JTextField jtName;
    private javax.swing.JComboBox<String> jtSex;
    // End of variables declaration//GEN-END:variables

}
