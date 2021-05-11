
package sg.c;

import javax.swing.JOptionPane;

public class buscador_usuario extends javax.swing.JFrame {
    
    public static String user_name;
    int mode = menu_usuario.mode;
    
    public buscador_usuario() {
        initComponents();
        ///Definimos n titulo para la ventana
        this.setTitle("Buscar usuario");
        ///Colocamos la ventana en medio de la panatalla
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtUser = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(717, 500));
        setMinimumSize(new java.awt.Dimension(717, 500));
        setPreferredSize(new java.awt.Dimension(717, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Buscardor usuario");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));
        jLabel1.getAccessibleContext().setAccessibleName("Buscador usuario");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Escriba el nombre de usuario");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));
        getContentPane().add(jtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 320, 30));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Regresar al menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, 140, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       menu_usuario nuevo = new menu_usuario();
        nuevo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if (jtUser.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un usuario");
        } else {
            switch (mode) {
                case 1: {
                    Usuario u = new Usuario();
                    String search = u.Search(jtUser.getText());
                    if (!search.equals("n")) {
                        user_name = search;
                        new modificar_usuario().setVisible(true);
                        this.dispose();
                    }
                    break;
                }
                case 2: {
                    Usuario u = new Usuario();
                    int estatus = 0, delete = 1;
                    String search = u.Search(jtUser.getText());
                    u.Delete(estatus, search, delete);
                    new menu_usuario().setVisible(true);
                    this.dispose();
                    break;
                }
                default:
                    JOptionPane.showMessageDialog(null, "Error");
                    break;
            }
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new buscador_usuario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jtUser;
    // End of variables declaration//GEN-END:variables

}
