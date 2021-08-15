/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudusuarios;

import auxClass.systemConf;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Akme
 */
public class UpdateForm extends javax.swing.JDialog {

    /**
     * Creates new form UpdateForm
     */
    
    
    public UpdateForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    UpdateForm() {
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
        txt_name = new javax.swing.JTextField();
        txt_phone = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        btn_Update = new javax.swing.JButton();
        txt_id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(200, 245, 233));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(126, 125, 125));
        jLabel1.setText("UPDATE USER");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        txt_name.setBackground(new java.awt.Color(225, 225, 225));
        txt_name.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txt_name.setForeground(new java.awt.Color(126, 125, 125));
        txt_name.setText("Name");
        jPanel2.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 251, 38));

        txt_phone.setBackground(new java.awt.Color(225, 225, 225));
        txt_phone.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txt_phone.setForeground(new java.awt.Color(126, 125, 125));
        txt_phone.setText("Phone");
        jPanel2.add(txt_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 251, 38));

        txt_email.setBackground(new java.awt.Color(225, 225, 225));
        txt_email.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txt_email.setForeground(new java.awt.Color(126, 125, 125));
        txt_email.setText("Email");
        jPanel2.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 251, 38));

        btn_Update.setBackground(new java.awt.Color(112, 216, 136));
        btn_Update.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_Update.setForeground(new java.awt.Color(255, 255, 255));
        btn_Update.setText("Update");
        btn_Update.setBorder(null);
        btn_Update.setFocusable(false);
        btn_Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_UpdateMouseClicked(evt);
            }
        });
        jPanel2.add(btn_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 151, 38));

        txt_id.setText("1");
        txt_id.setBorder(null);
        jPanel2.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 0, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 272, 320));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UpdateMouseClicked
        systemConf sys = new systemConf();
        
        
        String sql = String.format("update users set name = '%s', phone = '%s', email = '%s' where id = '%s'",
                txt_name.getText(), txt_phone.getText(), txt_email.getText(), txt_id.getText());
        
        try {
            sys.updateData(sql);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            sys.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_UpdateMouseClicked

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
            java.util.logging.Logger.getLogger(UpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UpdateForm dialog = new UpdateForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField txt_email;
    public javax.swing.JTextField txt_id;
    public javax.swing.JTextField txt_name;
    public javax.swing.JTextField txt_phone;
    // End of variables declaration//GEN-END:variables
}
