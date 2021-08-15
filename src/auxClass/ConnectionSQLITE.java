package auxClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.ResultSet;
//import java.sql.ResultSetMetaData;

//Singleton Pattern
public class ConnectionSQLITE {
    
    private static Connection connect;
    private static ConnectionSQLITE instance;
    private static PreparedStatement ps;
    
     
    String url = "jdbc:sqlite:"+ System.getProperty("user.dir") + "\\db\\crud.db";
      
   
    private ConnectionSQLITE(){}
    
      
    public static ConnectionSQLITE getInstanceSQL(){
          
        if(ConnectionSQLITE.instance == null){
              
            ConnectionSQLITE.instance = new ConnectionSQLITE();
              
        }
          
        return ConnectionSQLITE.instance;
    }
    
    public void initConnection(){
        
        try{
            
            ConnectionSQLITE.connect = DriverManager.getConnection(url);
            
            if(ConnectionSQLITE.connect != null){
                //JOptionPane.showMessageDialog(null, "Conectado a la base de datos");
            }else{
                JOptionPane.showMessageDialog(null, "No se ha podido conectar a la base de datos");
            }

        }catch(SQLException ex){
            
            JOptionPane.showMessageDialog(null, "Error de conexion");
            
        }
          
    }
    
    public void closeConnection() throws SQLException{
          
        if(ConnectionSQLITE.connect != null){
            
            ConnectionSQLITE.ps.close();
            ConnectionSQLITE.connect.close();
            
            
        }else{
            JOptionPane.showMessageDialog(null, "Existe un error con la base de datos ");
        }
    }
    
    public boolean verify() throws SQLException{
        return ConnectionSQLITE.ps.isClosed() && ConnectionSQLITE.connect.isClosed();
    }
    
    public ResultSet executeStatementSQL(int selection, String sqlStatement) throws SQLException{
        
        ConnectionSQLITE.ps = ConnectionSQLITE.connect.prepareStatement(sqlStatement);
        
        if(selection <= 0){
            
            ResultSet rs = ps.executeQuery();
            return rs;
            
        }else if(selection == 1){
            
            ps.execute();
            ps.close();
            
        }
        
        ps.close();
        return null;
    }
}
