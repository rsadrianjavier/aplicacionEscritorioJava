package es.seas.unidad3.ejemplo.fastfoodcompany.principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MysqlConnectionFF {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String SERVER = "jdbc:mysql://sql11.freemysqlhosting.net/";
    private static final String DATABASE = "sql11172720";
    private static final String USERNAME = "sql11172720";
    private static final String PASSWORD = "g5gMfxQ9n9";
    
    static{
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MysqlConnectionFF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Connection getConnection(){
        try {
            Connection connection = DriverManager.getConnection(SERVER + DATABASE, 
                    USERNAME, PASSWORD);
            return connection;
        } catch (SQLException ex) {
            Logger.getLogger(MysqlConnectionFF.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    /*public static void main(String[] args){
        Connection conn = MysqlConnectionFF.getConnection();
    }*/
    
}
