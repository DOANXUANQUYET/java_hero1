/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam01_07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author doanxuanquyet
 */
public class Myconnect {
    private final String url = "jdbc:mysql://localhost:3306/hoc_mysql"; //chuoi ket noi vao mysql
    private final String user = "doanxuanquyet"; // khai bao tai khoan
    private final String pass = "123456789"; //khai bao mat khau
    
    private final String table = "Shikaku"; // bien khai bao bang
    private Connection connection = null;
    
            //ham ket noi ben trong ham myconnectull
    void connect(){
        try {
           
            //tao doi tuong ket noi voi  mysql --> user voi pass
            connection = DriverManager.getConnection(url,user,pass);
            System.out.println("connect success");
            
            
        } catch (SQLException ex) {
            System.out.println("Error connection");
        }
    }
    void Insert(String Data1,String Data2,String Data3,String Data4) throws SQLException{
        String sql ="INSERT INTO `hoc_mysql`.`Syohin` (`SyohinCode`, `SyohinName`, `Price`, `BunruiNo`)"
                + " VALUES ('"+Data1+"', '"+Data2+"', '"+Data3+"', '"+Data4+"');";
        
        Statement statment = connection.createStatement();
        //thuc thi cau lenh delete,insert,update tra ve gia tri la so lan thuc thi
        int rs = statment.executeUpdate(sql);
        if(rs > 0){
            JOptionPane.showMessageDialog(null, "追加　成功");
        }
        else{
            JOptionPane.showMessageDialog(null, "追加　失敗");
        }
        
    }
    
    ResultSet getData(){
        ResultSet rs = null;  //tao doi tuong chua du lieu tra ve
        //lay giu lieu bang truy van sql
        String sqlCommad = "select BunruiName from Bunrui;";
        try {
             //tao doi tuong statement de chua du lieu lay tu sql
            Statement ts = connection.createStatement();
            rs = ts.executeQuery(sqlCommad); //lenh thuc thi cau lenh sql tra ve gia tri mang sql
        } catch (SQLException ex) {
            System.out.println("select error \n"+ ex.toString());
        }
        
        return rs;
       }  
    
}
