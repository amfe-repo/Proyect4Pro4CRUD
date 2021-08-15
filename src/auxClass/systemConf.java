/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auxClass;

import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Akme
 */
public class systemConf {
    
    public static Users session;
    ConnectionSQLITE sqlConn;
    DefaultTableModel modelTable;
    
    public systemConf(){  
        sqlConn = ConnectionSQLITE.getInstanceSQL();
        this.sqlConn.initConnection();
    }
    
    public void createSession(Users session1){
        session = session1;
    }
    
    public ResultSet selectData(String sql) throws SQLException{
               
        ResultSet rs = this.sqlConn.executeStatementSQL(0, sql);
        
        return rs;
    }
    
    public void insertData(String sql) throws SQLException{
        
        this.sqlConn.executeStatementSQL(1, sql);
        JOptionPane.showMessageDialog(null, "Se ha insertado correctamente");
        
    }
    
    public void updateData(String sql) throws SQLException{
        this.sqlConn.executeStatementSQL(1, sql);
        JOptionPane.showMessageDialog(null, "Se ha actualizado correctamente");
    }
    
    public void closeConnection() throws SQLException{
        this.sqlConn.closeConnection();
    }
    
    public void verify(){
        try {
            JOptionPane.showMessageDialog(null, this.sqlConn.verify());
        } catch (SQLException ex) {
            Logger.getLogger(systemConf.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void createSession(int parseInt, String text, String text0, String text1, String text2, String text3, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
