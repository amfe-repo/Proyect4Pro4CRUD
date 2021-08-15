package crudusuarios;


import auxClass.systemConf;
import static crudusuarios.LoginForm.lg;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.sql.ResultSet;

/**
 *
 * @author Akme
 */
public class Principal extends javax.swing.JFrame {
    
    DefaultTableModel modelTable;
    systemConf sys = null;
    
    public Principal() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        TableUsers.setRowHeight(30);
        TableUsers.setSelectionBackground(new Color(200, 200, 200));
        JTableHeader th = TableUsers.getTableHeader();
        ((DefaultTableCellRenderer)th.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        th.setFont(new Font("Segoe UI", Font.BOLD, 20));
        th.setForeground(new Color(255, 255, 255));
        jPopupMenu1.add(pnl_btnUpdateDelete);
        
        this.sys = new systemConf();
        this.modelTable = (DefaultTableModel) TableUsers.getModel();
        
        chargeTable();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        pnl_btnUpdateDelete = new javax.swing.JPanel();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        userActualName = new javax.swing.JLabel();
        btn_config = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_search = new javax.swing.JButton();
        MenuUpdateDelete = new javax.swing.JScrollPane();
        TableUsers = new javax.swing.JTable();
        txt_search = new javax.swing.JTextField();

        pnl_btnUpdateDelete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_update.setBackground(new java.awt.Color(168, 168, 168));
        btn_update.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setText("UPDATE");
        btn_update.setBorder(null);
        btn_update.setFocusable(false);
        btn_update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_updateMouseClicked(evt);
            }
        });
        pnl_btnUpdateDelete.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 50));

        btn_delete.setBackground(new java.awt.Color(241, 135, 135));
        btn_delete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete.setText("DELETE");
        btn_delete.setBorder(null);
        btn_delete.setFocusable(false);
        pnl_btnUpdateDelete.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 240, 50));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(99, 242, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userActualName.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        userActualName.setForeground(new java.awt.Color(255, 255, 255));
        userActualName.setText("USUARIO");
        jPanel1.add(userActualName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        btn_config.setBackground(new java.awt.Color(168, 168, 168));
        btn_config.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn_config.setForeground(new java.awt.Color(255, 255, 255));
        btn_config.setText("Config");
        btn_config.setBorder(null);
        btn_config.setFocusable(false);
        btn_config.setRolloverEnabled(false);
        btn_config.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_configMouseClicked(evt);
            }
        });
        jPanel1.add(btn_config, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 470, 114, 47));

        btn_logout.setBackground(new java.awt.Color(241, 135, 135));
        btn_logout.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(255, 255, 255));
        btn_logout.setText("Log out");
        btn_logout.setFocusable(false);
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoutMouseClicked(evt);
            }
        });
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        jPanel1.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 470, 114, 47));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 280, 247, 22));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 330, 247, 22));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 380, 247, 22));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 590));

        jPanel2.setBackground(new java.awt.Color(200, 245, 233));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_search.setBackground(new java.awt.Color(168, 168, 168));
        btn_search.setIcon(new javax.swing.ImageIcon("E:\\Things\\Programming\\Java\\CRUDUsuarios\\src\\images\\2.png")); // NOI18N
        btn_search.setFocusable(false);
        jPanel2.add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 35, 50, 50));

        TableUsers.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TableUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "User", "Name", "Phone", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableUsers.setComponentPopupMenu(jPopupMenu1);
        TableUsers.getTableHeader().setReorderingAllowed(false);
        MenuUpdateDelete.setViewportView(TableUsers);
        if (TableUsers.getColumnModel().getColumnCount() > 0) {
            TableUsers.getColumnModel().getColumn(0).setResizable(false);
            TableUsers.getColumnModel().getColumn(1).setResizable(false);
            TableUsers.getColumnModel().getColumn(2).setResizable(false);
            TableUsers.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel2.add(MenuUpdateDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 106, 410, 452));

        txt_search.setFont(new java.awt.Font("Segoe UI", 2, 20)); // NOI18N
        txt_search.setForeground(new java.awt.Color(170, 170, 170));
        txt_search.setText("Search");
        txt_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_searchMouseClicked(evt);
            }
        });
        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });
        jPanel2.add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 35, 410, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 540, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chargeTable() throws SQLException{
        this.modelTable.setRowCount(0);
        
        ResultSet rs = this.sys.selectData("select username, name, phone, email from users");
        
        while(rs.next()){
            this.modelTable.addRow(new Object[]{
                rs.getString("username"), rs.getString("name"), rs.getString("phone"), rs.getString("email")
            });
        }
    }
        
    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    private void txt_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_searchMouseClicked
        txt_search.setText("");
    }//GEN-LAST:event_txt_searchMouseClicked

    private void btn_updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_updateMouseClicked
        UpdateForm frm_update = new UpdateForm(this, true);
        frm_update.setVisible(true);
    }//GEN-LAST:event_btn_updateMouseClicked

    private void btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseClicked
         
        this.setVisible(false);
        lg.setVisible(true);
        
    }//GEN-LAST:event_btn_logoutMouseClicked

    private void btn_configMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_configMouseClicked
        ConfigForm frm_confirm = new ConfigForm(this, true);
        frm_confirm.setVisible(true);
    }//GEN-LAST:event_btn_configMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Principal().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane MenuUpdateDelete;
    private javax.swing.JTable TableUsers;
    private javax.swing.JButton btn_config;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPanel pnl_btnUpdateDelete;
    private javax.swing.JTextField txt_search;
    private javax.swing.JLabel userActualName;
    // End of variables declaration//GEN-END:variables
}
