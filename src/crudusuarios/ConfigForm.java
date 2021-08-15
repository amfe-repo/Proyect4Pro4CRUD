/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudusuarios;

import auxClass.systemConf;
import auxClass.systemConf;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Akme
 */
public class ConfigForm extends javax.swing.JDialog {

    /**
     * Creates new form ConfigForm
     */
    public ConfigForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    ConfigForm() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_lastname = new javax.swing.JTextField();
        txt_phone = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        btn_saveChanges = new javax.swing.JButton();
        txt_pass = new javax.swing.JPasswordField();
        label_id = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(200, 245, 233));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(126, 125, 125));
        jLabel1.setText("CONFIG USER");
        jLabel1.setToolTipText("");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        txt_username.setBackground(new java.awt.Color(225, 225, 225));
        txt_username.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txt_username.setForeground(new java.awt.Color(126, 125, 125));
        txt_username.setText("Username");
        txt_username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_usernameMouseClicked(evt);
            }
        });
        jPanel2.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 251, 38));

        txt_name.setBackground(new java.awt.Color(225, 225, 225));
        txt_name.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txt_name.setForeground(new java.awt.Color(126, 125, 125));
        txt_name.setText("Name");
        txt_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_nameMouseClicked(evt);
            }
        });
        jPanel2.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 251, 38));

        txt_lastname.setBackground(new java.awt.Color(225, 225, 225));
        txt_lastname.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txt_lastname.setForeground(new java.awt.Color(126, 125, 125));
        txt_lastname.setText("Last Name");
        txt_lastname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_lastnameMouseClicked(evt);
            }
        });
        jPanel2.add(txt_lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 251, 38));

        txt_phone.setBackground(new java.awt.Color(225, 225, 225));
        txt_phone.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txt_phone.setForeground(new java.awt.Color(126, 125, 125));
        txt_phone.setText("Phone");
        txt_phone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_phoneMouseClicked(evt);
            }
        });
        jPanel2.add(txt_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 251, 38));

        txt_email.setBackground(new java.awt.Color(225, 225, 225));
        txt_email.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txt_email.setForeground(new java.awt.Color(126, 125, 125));
        txt_email.setText("Email");
        txt_email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_emailMouseClicked(evt);
            }
        });
        jPanel2.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 251, 38));

        btn_saveChanges.setBackground(new java.awt.Color(112, 216, 136));
        btn_saveChanges.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_saveChanges.setForeground(new java.awt.Color(255, 255, 255));
        btn_saveChanges.setText("Save changes");
        btn_saveChanges.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_saveChangesMouseClicked(evt);
            }
        });
        jPanel2.add(btn_saveChanges, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 151, 38));

        txt_pass.setBackground(new java.awt.Color(225, 225, 225));
        txt_pass.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txt_pass.setForeground(new java.awt.Color(126, 125, 125));
        txt_pass.setText("jPasswordField1");
        txt_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_passMouseClicked(evt);
            }
        });
        jPanel2.add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 251, 38));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 272, 480));

        label_id.setForeground(new java.awt.Color(200, 245, 233));
        label_id.setText("jLabel2");
        jPanel1.add(label_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 10, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_usernameMouseClicked
        txt_username.setText("");
    }//GEN-LAST:event_txt_usernameMouseClicked

    private void txt_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nameMouseClicked
        txt_name.setText("");
    }//GEN-LAST:event_txt_nameMouseClicked

    private void txt_lastnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_lastnameMouseClicked
        txt_lastname.setText("");
    }//GEN-LAST:event_txt_lastnameMouseClicked

    private void txt_phoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_phoneMouseClicked
        txt_phone.setText("");
    }//GEN-LAST:event_txt_phoneMouseClicked

    private void txt_emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_emailMouseClicked
        txt_email.setText("");
    }//GEN-LAST:event_txt_emailMouseClicked

    private void txt_passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_passMouseClicked
        txt_pass.setText("");
    }//GEN-LAST:event_txt_passMouseClicked

    private void btn_saveChangesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_saveChangesMouseClicked
        systemConf sys = new systemConf();
        
        try {
            sys.updateData(generateSQLCode());
        } catch (SQLException ex) {
            Logger.getLogger(UpdateForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            sys.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_saveChangesMouseClicked
    
    private String generateSQLCode(){
        
        String pass = new String(txt_pass.getPassword());
        
        String sql = String.format("update users set name = '%s', phone = '%s',"
                + " email = '%s', username = '%s', password = '%s' where id = '%s'",
                txt_name.getText(), txt_phone.getText(), txt_email.getText(),
                txt_username.getText(), pass, label_id.getText());
        
        return sql;
    }
    
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
            java.util.logging.Logger.getLogger(ConfigForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfigForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfigForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfigForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConfigForm dialog = new ConfigForm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_saveChanges;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JLabel label_id;
    public javax.swing.JTextField txt_email;
    public javax.swing.JTextField txt_lastname;
    public javax.swing.JTextField txt_name;
    public javax.swing.JPasswordField txt_pass;
    public javax.swing.JTextField txt_phone;
    public javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
