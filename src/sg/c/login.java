
package sg.c;

import java.sql.*;
import javax.swing.JOptionPane;
import conexion.conexion;

public class login extends javax.swing.JFrame {

   public static String user ="";
   
    public login() {
        initComponents();
        ///Definimos n titulo para la ventana
        this.setTitle("Inicio de sesión");
        ///Colocamos la ventana en medio de la panatalla
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jtUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtPass = new javax.swing.JPasswordField();
        jtError = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(717, 500));
        setMinimumSize(new java.awt.Dimension(717, 500));
        setPreferredSize(new java.awt.Dimension(717, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Sistema Gestor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 110, 40));
        getContentPane().add(jtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 230, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));
        getContentPane().add(jtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 230, 30));

        jtError.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtError.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(jtError, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setText("Clínica");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/matraz (1).png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_login_1.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -90, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jtUser.getText().isEmpty() && jtPass.getText().isEmpty()) {
            jtError.setText("Campos vacios");
        } else if (jtUser.getText().isEmpty()) {
            jtError.setText("Campo contraseña vacio");
        } else if (jtPass.getText().isEmpty()) {
            jtError.setText("Campo usuario vacio");
        } else {
            try {
                ///Crea las variables para la consulta
                String usuario = jtUser.getText();
                String pass = jtPass.getText();
                ///Genera el query
                String sql = "SELECT * FROM usuario WHERE usuario = '" + usuario + "' AND contrasena = '" + pass + "' AND estatus = '0'";
                ///Concecta con la base de datos
                Connection en = conexion.conectar();
                ///Crea la sentencia
                Statement st = en.createStatement();
                ///Ejecuta la sentencia
                ResultSet rs = st.executeQuery(sql);
                ///Verifica el resultado
                if (rs.next()) {
                    if (rs.getInt("tipo") == 2) {
                        ///Conservamos el nombre del usuario
                        user = jtUser.getText().trim();
                        //Ejecuta la consulta si los campos estan llenos 
                        menu_administrador nuevo = new menu_administrador();
                        nuevo.setVisible(true);
                        ///Cierra la ventana actual
                        this.dispose();
                    } else {
                        //Ejecuta la consulta si los campos estan llenos 
                        menu_administrador nuevo = new menu_administrador();
                        nuevo.setVisible(true);
                        ///Cierra la ventana actual
                        this.dispose();
                    }
                } else {
                    //Mensajes de error
                    JOptionPane.showMessageDialog(null, "Datos de acceso incorrectos");
                    //Limpiamos los textBox
                    jtUser.setText("");
                    jtPass.setText("");
                }
            } catch (SQLException e) {
                System.err.println("Error en el boton ingresar" + e);
                JOptionPane.showMessageDialog(null, "Error al iniciar sesion");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jtError;
    private javax.swing.JPasswordField jtPass;
    private javax.swing.JTextField jtUser;
    // End of variables declaration//GEN-END:variables

}
