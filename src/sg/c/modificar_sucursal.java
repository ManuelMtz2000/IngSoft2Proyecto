
package sg.c;

import java.sql.*;
import conexion.conexion;
import javax.swing.JOptionPane;

public class modificar_sucursal extends javax.swing.JFrame {

    String user = buscador_sucursal.name;
    
    public modificar_sucursal(String user) {
        initComponents();
        ///Definimos un titulo para la ventana
        this.setTitle("Modificar sucursal");
        ///Colocamos la ventana en medio de la panatalla
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.user = user;
        rellenarDatos();
    }
    public void rellenarDatos(){
        String sql = "Select * From sucursal where numero = '" + user + "'";
        try {
            ///Concecta con la base de datos
            Connection en = conexion.conectar();
            ///Crea la sentencia
            Statement st = en.createStatement();
            ///Ejecuta la sentencia
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                jtName.setText(rs.getString("numero"));
                jtPlace.setText(rs.getString("direccion"));
                jtPhone.setText(rs.getString("telefono"));
                switch (rs.getString("apertura")) {
                    case "7:00":
                        jtIn.setSelectedIndex(1);
                        break;
                    case "8:00":
                        jtIn.setSelectedIndex(2);
                        break;
                    case "9:00":
                        jtIn.setSelectedIndex(3);
                        break;
                }
                switch (rs.getString("cierre")) {
                    case "20:00":
                        jtOut.setSelectedIndex(1);
                        break;
                    case "21:00":
                        jtOut.setSelectedIndex(2);
                        break;
                    case "22:00":
                        jtOut.setSelectedIndex(3);
                        break;
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

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtName = new javax.swing.JTextField();
        jtPlace = new javax.swing.JTextField();
        jtPhone = new javax.swing.JTextField();
        jtOut = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jtIn = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(717, 500));
        setMinimumSize(new java.awt.Dimension(717, 500));
        setPreferredSize(new java.awt.Dimension(717, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Modificar Sucursal");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Código");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Ubicación");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setText("Telefono");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setText("Hora de apertura");
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setText("Hora de cierre");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));
        getContentPane().add(jtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 180, 30));

        jtPlace.setToolTipText("");
        getContentPane().add(jtPlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 180, 30));
        getContentPane().add(jtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 180, 30));

        jtOut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "20:00", "21:00", "22:00" }));
        getContentPane().add(jtOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 90, 30));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 90, 30));

        jButton3.setBackground(new java.awt.Color(51, 51, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 110, 30));

        jtIn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "7:00", "8:00", "9:00" }));
        getContentPane().add(jtIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 90, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        menu_sucursal nuevo = new menu_sucursal();
        nuevo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jtName.getText().isEmpty() || jtPlace.getText().isEmpty() || jtPhone.getText().isEmpty() || jtIn.getSelectedIndex() == 0 || jtOut.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Campos incompletos");
        } else {
            int phone;
            String name, place, in, out;
            phone = Integer.parseInt(jtPhone.getText());
            in = jtIn.getSelectedItem().toString();
            out = jtOut.getSelectedItem().toString();
            name = jtName.getText();
            place = jtPlace.getText();
            //Ingresamos los datos a la base de datos 
            try {
                ///Concecta con la base de datos
                Connection en = conexion.conectar();
                PreparedStatement ps = en.prepareStatement("Update sucursal set numero = ?, direccion = ?, telefono = ?, apertura = ?, cierre = ? Where numero = ?");
                ps.setString(1, name);
                ps.setString(2, place);
                ps.setInt(3, phone);
                ps.setString(4, in);
                ps.setString(5, out);
                ps.setString(6, user);

                int res = ps.executeUpdate();
                if (res == 0) {
                    JOptionPane.showMessageDialog(null, "Numero de sucursal no valido");
                } else {
                    JOptionPane.showMessageDialog(null, "Sucursal modificada con exito");
                    menu_sucursal nuevo = new menu_sucursal();
                    nuevo.setVisible(true);
                    this.dispose();
                }
            } catch (SQLException e) {
                System.err.println("Error en el boton ingresar" + e);
                JOptionPane.showMessageDialog(null, "Nombre de usuario no valido");
                jtName.setText("");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new modificar_sucursal("").setVisible(true);
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> jtIn;
    private javax.swing.JTextField jtName;
    private javax.swing.JComboBox<String> jtOut;
    private javax.swing.JTextField jtPhone;
    private javax.swing.JTextField jtPlace;
    // End of variables declaration//GEN-END:variables

}
