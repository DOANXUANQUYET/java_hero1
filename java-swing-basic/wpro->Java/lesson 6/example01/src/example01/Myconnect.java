/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

/**
 *
 * @author doanxuanquyet
 */
public class Myconnect {
  //  private final String className = "com.mysql.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost:3306/hoc_mysql";
    private final String user = "doanxuanquyet";
    private final String pass = "123456789";
    
    private final String table = "Syohin";
    
    
    private Connection connection;
    
    //ham ket noi
    void connect(){
        try {
            
            
            //Class.forName(className);
            //tao doi tuong ket noi voi  mysql --> user voi pass
            connection = DriverManager.getConnection(url,user,pass);
            System.out.println("connect success");
            
            
        //} catch (ClassNotFoundException ex) {
          //  System.out.println("class not found");
        } catch (SQLException ex) {
            System.out.println("Error connection");
        }
    }
    
    //ham lay du lieu tu doi tuong data da tao
    ResultSet getData(){
        ResultSet rs = null;
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
    
    //ham in du lieu cua data
    private void showData(ResultSet rs){
        try {
            while(rs.next()){
                System.out.printf("%-10s %-30s %-10d %-10d\n", rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4));
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Myconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        Myconnect myconnect = new Myconnect();
        myconnect.connect(); // ket noi
        myconnect.showData(myconnect.getData());
        
    }

    void ShowDataTable(ResultSet data, JTable Syohin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
