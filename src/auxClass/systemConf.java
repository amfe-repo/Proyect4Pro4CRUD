/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auxClass;

import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Akme
 */
public class systemConf {
    
    Users session = null;
    ConnectionSQLITE sqlConn = null;
    DefaultTableModel modelTable;
    
    public systemConf(){  
        sqlConn = ConnectionSQLITE.getInstanceSQL();
        this.sqlConn.initConnection();
    }
    
    public void createSession(Users session){
        this.session = session;
    }
    
    public ResultSet selectData(String sql) throws SQLException{
               
        ResultSet rs = this.sqlConn.executeStatementSQL(0, sql);
        
        return rs;
    }
    
    public void insertData(String sql) throws SQLException{
        
        this.sqlConn.executeStatementSQL(1, sql);
        JOptionPane.showMessageDialog(null, "Se ha insertado correctamente");
        
    }
    
    public void closeConnection() throws SQLException{
        this.sqlConn.closeConnection();
    }
}
