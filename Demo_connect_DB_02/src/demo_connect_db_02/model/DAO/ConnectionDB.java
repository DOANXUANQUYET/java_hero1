package demo_connect_db_02.model.DAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author doanxuanquyet
 */
public class ConnectionDB {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost/java_hero";
    private static final String USER = "pma";
    private static final String PASS = "12345";
    
    //function ma ket noi tra ve connecttion java.sql
    public static  Connection connect(){
        try {
            Class.forName(DRIVER);
            Connection con = (Connection) DriverManager.getConnection(URL,USER,PASS);
            return con;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    //function dong ket noi, nhan vao ResultSet,PreparedStatement,Connection
    public static void closeDB(ResultSet rs,PreparedStatement pr,Connection con){
        try {
            //check null va trang thai closed
            
            if(rs != null && !rs.isClosed()){
            rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
           if( pr != null && !pr.isClosed()){
            pr.close();
           }
        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if( con != null && !con.isClosed()){
                con.close();
            }} catch (SQLException ex) {
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
