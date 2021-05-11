
package sg.c;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class agregar_cliente extends javax.swing.JFrame {

    public agregar_cliente() {
        initComponents();
        ///Definimos un titulo para la ventana
        this.setTitle("Agregar clientes");
        ///Colocamos la ventana en medio de la panatalla
        this.setLocationRelativeTo(null);
        this.setResizable(false);
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
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jtSex = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(717, 500));
        setMinimumSize(new java.awt.Dimension(717, 500));
        setPreferredSize(new java.awt.Dimension(717, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Agregar Cliente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Apellido");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setText("Edad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setText("Tipo de sangre");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setText("Sexo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));
        getContentPane().add(jtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 180, 30));
        getContentPane().add(jtLast, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 180, 30));

        jtAge.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Idef", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        getContentPane().add(jtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 60, 30));

        jtBlood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        getContentPane().add(jtBlood, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 90, 30));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Regresar al menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 150, 30));

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Borrar todo ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 110, 30));

        jButton4.setBackground(new java.awt.Color(51, 51, 255));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Agregar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 110, 30));

        jtSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Masculino", "Femenino" }));
        jtSex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtSexActionPerformed(evt);
            }
        });
        getContentPane().add(jtSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 90, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        jLabel7.setText("dd");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        menu_cliente nuevo = new menu_cliente();
        nuevo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Validamos que no esten vacios
        if (jtName.getText().isEmpty() || jtLast.getText().isEmpty() || jtAge.getSelectedIndex() == 0|| jtBlood.getSelectedIndex() == 0 || jtSex.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Campos incompletos");
        } else {
            ///Definimos variables
            String name, last, blood, sex;
            int age;
            Cliente c = new Cliente();
            ///Le asignamos valores
            name = jtName.getText();
            last = jtLast.getText();
            blood = jtBlood.getSelectedItem().toString();
            age = jtAge.getSelectedIndex();
            if (jtSex.getSelectedItem().toString().equals("Masculino")) {
                sex = "M";
            } else {
                sex = "F";
            }
            ///Concecta con la base de datos
            c.Add(name, last, age, blood, sex);
            this.dispose();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jtSexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtSexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtSexActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jtName.setText("");
        jtLast.setText("");
        jtBlood.setSelectedIndex(0);
        jtAge.setSelectedIndex(0);
        jtSex.setSelectedIndex(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new agregar_cliente().setVisible(true);
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
    private javax.swing.JComboBox<String> jtAge;
    private javax.swing.JComboBox<String> jtBlood;
    private javax.swing.JTextField jtLast;
    private javax.swing.JTextField jtName;
    private javax.swing.JComboBox<String> jtSex;
    // End of variables declaration//GEN-END:variables

}
