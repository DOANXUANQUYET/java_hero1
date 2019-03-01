/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kadai01_06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author doanxuanquyet
 */
public class Myconnect {
    
    private final String url = "jdbc:mysql://localhost:3306/hoc_mysql"; //chuoi ket noi vao mysql
    private final String user = "doanxuanquyet"; // khai bao tai khoan
    private final String pass = "123456789"; //khai bao mat khau
    
    private final String table = "Syain"; // bien khai bao bang
    private Connection connection;
    
    
        //ham ket noi ben trong ham myconnect
    void connect(){
        try {
           
            //tao doi tuong ket noi voi  mysql --> user voi pass
            connection = DriverManager.getConnection(url,user,pass);
            System.out.println("connect success");
            
            
        } catch (SQLException ex) {
            System.out.println("Error connection");
        }
    }
    
           // ham lay du lieu tra ve
        ResultSet getData(){
        ResultSet rs = null;  //tao doi tuong chua du lieu tra ve
        //lay giu lieu bang truy van sql
        String sqlCommad = "select * from " + table;
        try {
             //tao doi tuong statement de chua du lieu lay tu sql
            Statement ts = connection.createStatement();
            rs = ts.executeQuery(sqlCommad); //lenh thuc thi cau lenh sql
        } catch (SQLException ex) {
            System.out.println("select error \n"+ ex.toString());
        }
        
        return rs;
       }
    
}


