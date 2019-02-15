/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_mvc.model;

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
public class OpenDB {

    //de public (nhung thong tin nay thuong save trong file text  khi dung thi doc len)
    public static final String USER = "pma";
    public static final String PASS = "123345";
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost/java_hero";

    //connection (java.sql)
    public static Connection open() { //ham mo ket noi

        try {
            //de phong tranh trong du an co nhieu driver chay class.forName
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(OpenDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    //ham dong ket noi (dong tu trong ra ngoai, 
    public static void close(ResultSet ret, PreparedStatement pr, Connection con) {
        
        try {
            //kiem tra khac null va trang thai dang mo
            if (ret != null && !ret.isClosed()) {
                ret.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(OpenDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if (pr != null && !pr.isClosed()) {
                pr.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(OpenDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(OpenDB.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
