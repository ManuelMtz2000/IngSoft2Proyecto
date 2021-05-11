
package sg.c;

import java.sql.*;
import javax.swing.JOptionPane;
import conexion.conexion;

public class modificar_usuario extends javax.swing.JFrame {

    String user_name = buscador_usuario.user_name;
    public modificar_usuario() {
        initComponents();
        ///Definimos n titulo para la ventana
        this.setTitle("Editar usuario");
        ///Colocamos la ventana en medio de la panatalla
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        rellenarComboBox();
        rellenarDatos();

    }
    public void rellenarComboBox(){
        String sql = "Select direccion From sucursal";
        try {
            ///Concecta con la base de datos
            Connection en = conexion.conectar();
            ///Crea la sentencia
            Statement st = en.createStatement();
            ///Ejecuta la sentencia
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                jComboBox1.addItem(rs.getString("direccion"));

            }
        } catch (SQLException e) {
            System.err.println("Error en el boton ingresar" + e);
            JOptionPane.showMessageDialog(null, "Error al iniciar sesion");
        }
    }
    public void rellenarDatos(){
        String sql = "Select * From usuario where usuario = '" + user_name + "'";
        try {
            ///Concecta con la base de datos
            Connection en = conexion.conectar();
            ///Crea la sentencia
            Statement st = en.createStatement();
            ///Ejecuta la sentencia
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                String sucursal = rs.getString("sucursal");
                jtName.setText(rs.getString("nombre"));
                jtLast.setText(rs.getString("apellido"));
                jtUser.setText(rs.getString("usuario"));
                jtPass.setText(rs.getString("contrasena"));
                jtPhone.setText(rs.getString("telefono"));
                if (rs.getInt("tipo") == 1) {
                    jtType.setSelectedIndex(1);
                } else {
                    jtType.setSelectedIndex(2);
                }
                String opcion;
                try {
                    Connection en1 = conexion.conectar();
                    PreparedStatement ps = en1.prepareStatement("SELECT direccion FROM sucursal WHERE numero = '" + sucursal + "'");
                    ResultSet rs1 = ps.executeQuery();
                    if (rs1.next()) {
                        String suc = rs1.getString("direccion");
                        for (int i = 0; i < jComboBox1.getItemCount(); i++) {
                            jComboBox1.setSelectedIndex(i);
                            opcion = jComboBox1.getSelectedItem().toString();
                            if (opcion.equals(suc)) {
                                jComboBox1.setSelectedIndex(i);
                                break;
                            }
                        }
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Jajaj");
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error de conexion: " + e);
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtPhone = new javax.swing.JTextField();
        jtName = new javax.swing.JTextField();
        jtLast = new javax.swing.JTextField();
        jtUser = new javax.swing.JTextField();
        jtPass = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jtType = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(717, 500));
        setMinimumSize(new java.awt.Dimension(717, 500));
        setPreferredSize(new java.awt.Dimension(717, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Editar usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Apellido");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setText("Usuario");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setText("Contraseña");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setText("Telefono");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setText("Sucursal");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setText("Tipo usuario");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));
        getContentPane().add(jtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 180, 30));
        getContentPane().add(jtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 180, 30));
        getContentPane().add(jtLast, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 180, 30));
        getContentPane().add(jtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 180, 30));
        getContentPane().add(jtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 180, 30));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 110, 30));

        jButton2.setBackground(new java.awt.Color(51, 51, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Regresar al menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 420, 140, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 110, 30));

        jtType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Recepcionista", "Administrador" }));
        getContentPane().add(jtType, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 110, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        menu_usuario nuevo = new menu_usuario();
        nuevo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ///Validamos que todas las variables no esten vacias
        if (jtName.getText().isEmpty() || jtLast.getText().isEmpty() || jtUser.getText().isEmpty() || jtPass.getText().isEmpty() || jtType.getSelectedIndex() == 0 || jComboBox1.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Campos incompletos");
        } else {
            int phone, type;
            String name, last, user, pass, sucursal;
            phone = Integer.parseInt(jtPhone.getText());
            type = jtType.getSelectedIndex();
            name = jtName.getText();
            last = jtLast.getText();
            user = jtUser.getText();
            pass = jtPass.getText();
            sucursal = jComboBox1.getSelectedItem().toString();
            //Ingresamos los datos a la base de datos 
            try {
                ///Concecta con la base de datos
                Connection en = conexion.conectar();
                PreparedStatement ps = en.prepareStatement("Update usuario set nombre = ?,apellido = ? ,usuario = ?, contrasena = ?, sucursal = ? ,telefono = ?,tipo = ? Where usuario = ? ");
                ps.setString(1, name);
                ps.setString(2, last);
                ps.setString(3, user);
                ps.setString(4, pass);
                ps.setString(5, sucursal);
                ps.setInt(6, phone);
                ps.setInt(7, type);
                ps.setString(8, user_name);

                int res = ps.executeUpdate();
                if (res == 0) {
                    JOptionPane.showMessageDialog(null, "Nombre de usuario no valido");
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario modificado con exito");
                    menu_usuario nuevo = new menu_usuario();
                    nuevo.setVisible(true);
                    this.dispose();
                }
            } catch (SQLException e) {
                System.err.println("Error en el boton ingresar" + e);
                JOptionPane.showMessageDialog(null, "Nombre de usuario no valido");
                jtUser.setText("");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new modificar_usuario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jtLast;
    private javax.swing.JTextField jtName;
    private javax.swing.JTextField jtPass;
    private javax.swing.JTextField jtPhone;
    private javax.swing.JComboBox<String> jtType;
    private javax.swing.JTextField jtUser;
    // End of variables declaration//GEN-END:variables

}
