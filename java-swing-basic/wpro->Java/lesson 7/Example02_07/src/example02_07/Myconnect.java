/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example02_07;

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
    void Update(String SyohinCode,String Price) throws SQLException{
        String sql ="UPDATE `hoc_mysql`.`Syohin` SET `Price` = '"+ Price +"' WHERE (`SyohinCode` = '"+ SyohinCode +"');";
        
        Statement statment = connection.createStatement();
        //thuc thi cau lenh delete,insert,update tra ve gia tri la so lan thuc thi
        int rs = statment.executeUpdate(sql);
        if(rs > 0){
            JOptionPane.showMessageDialog(null, "変更　成功");
        }
        else{
            JOptionPane.showMessageDialog(null, "追加　失敗");
        }
        
    }
    
    ResultSet getData(String Syohincode){
        ResultSet rs = null;  //tao doi tuong chua du lieu tra ve
        //lay giu lieu bang truy van sql
        String sqlCommad = "select SyohinName,Price,BunruiName "
                + "from Syohin inner join Bunrui on Syohin.BunruiNo = Bunrui.BunruiNo" +
                    " where SyohinCode = '"+ Syohincode +"';";
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
