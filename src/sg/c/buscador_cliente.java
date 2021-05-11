
package sg.c;

import javax.swing.JOptionPane;

public class buscador_cliente extends javax.swing.JFrame {

    public static int user_id;
    int mode;
    
    public buscador_cliente(int type) {
        initComponents();
        ///Definimos un titulo para la ventana
        this.setTitle("Buscar clíentes");
        ///Colocamos la ventana en medio de la panatalla
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        mode = type;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtUser = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(717, 500));
        setMinimumSize(new java.awt.Dimension(717, 500));
        setPreferredSize(new java.awt.Dimension(717, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Buscador de clientes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Introduzca el ID del cliente");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, -1, -1));
        getContentPane().add(jtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 300, 30));

        jButton2.setBackground(new java.awt.Color(51, 51, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Regresar al menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 150, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        if (jtUser.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un ID");
        } else {
            switch (mode) {
                case 1: {
                    Cliente c = new Cliente();
                    int buscador = c.Search(Integer.parseInt(jtUser.getText()));
                    if (buscador != -1) {
                        modificar_cliente mc = new modificar_cliente(c.Search(Integer.parseInt(jtUser.getText())));
                        mc.setVisible(true);
                        this.dispose();
                    }
                    break;
                }
                case 2: {
                    Cliente c = new Cliente();
                    int estatus = 0, delete = 1, search = Integer.parseInt(jtUser.getText());
                    c.Delete(estatus, search, delete);
                    menu_cliente nuevo = new menu_cliente();
                    nuevo.setVisible(true);
                    this.dispose();
                    break;
                }
                default:
                    JOptionPane.showMessageDialog(null, "error");
                    break;
            }
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        menu_cliente nuevo = new menu_cliente();
        nuevo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new buscador_cliente(0).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jtUser;
    // End of variables declaration//GEN-END:variables

}
