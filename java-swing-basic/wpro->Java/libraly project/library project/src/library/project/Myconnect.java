/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author doanxuanquyet
 */
public class Myconnect {
    private final String url = "jdbc:mysql://localhost:3306/18JN0231"; //chuoi ket noi vao mysql
    private final String user = "doanxuanquyet"; // khai bao tai khoan
    private final String pass = "123456789"; //khai bao mat khau
    
    private Connection connection = null;
    
    //ham ket noi ben trong ham myconnect (connect chung)
    void connect(){
        try {
           
            //tao doi tuong ket noi voi  mysql --> user voi pass
            connection = DriverManager.getConnection(url,user,pass);
            System.out.println("connect success");
            
            
        } catch (SQLException ex) {
            System.out.println("Error connection");
        }
    }
    
    
    //xac dinh ten hoc sinh
    ResultSet getDataStudentName(String StudentNo){
        ResultSet rs = null;  //tao doi tuong chua du lieu tra ve
        //lay giu lieu bang truy van sql
        String sqlCommad = "SELECT GakuName FROM 18JN0231.Gakusei where GakuNo = '"+ StudentNo +"';";
        try {
             //tao doi tuong statement de chua du lieu lay tu sql
            Statement ts = connection.createStatement();
            rs = ts.executeQuery(sqlCommad); //lenh thuc thi cau lenh sql tra ve gia tri mang sql
        } catch (SQLException ex) {
            System.out.println("select error \n"+ ex.toString());
        }
        
        return rs;
       } 
    
////////////////////////////////////////////////////// dang viet du lieu cho bang    
    // lay du lieu muon sach cua hoc sinh
    ResultSet getDataStudentKashidashi(String GakuName){
        ResultSet rs = null;
        String sqlCommad = "SELECT k.GakuNo,Title,KashiDate,YoteiDate FROM 18JN0231.Kashidashi  k INNER JOIN 18JN0231.Book b"
                + "  ON k.Isbn = b.Isbn  WHERE GakuNo = '"+ GakuName +"';";
        
                Statement ts;
        try {
            ts = connection.createStatement();
            rs = ts.executeQuery(sqlCommad);
        } catch (SQLException ex) {
            Logger.getLogger(Myconnect.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rs;
    }
    
        //check borrowed book
    ResultSet getDataKashiBook(String ISBN){
        ResultSet rs = null;  //tao doi tuong chua du lieu tra ve
        //lay giu lieu bang truy van sql
        String sqlCommad = "SELECT Title FROM 18JN0231.Book INNER JOIN 18JN0231.Kashidashi ON Book.Isbn = Kashidashi.Isbn"
                + " where Kashidashi.Isbn = '"+ ISBN +"' AND HenDate IS NULL;";
        try {
             //tao doi tuong statement de chua du lieu lay tu sql
            Statement ts = connection.createStatement();
            rs = ts.executeQuery(sqlCommad); //lenh thuc thi cau lenh sql tra ve gia tri mang sql
        } catch (SQLException ex) {
            System.out.println("select error \n"+ ex.toString());
        }
        
        return rs;
       }
    // check hadn't borrowed book yet
     ResultSet getDataNOKashiBook(String ISBN){
        ResultSet rs = null;  //tao doi tuong chua du lieu tra ve
        //lay giu lieu bang truy van sql
        String sqlCommad = "SELECT Title FROM 18JN0231.Book INNER JOIN 18JN0231.Kashidashi ON Book.Isbn = Kashidashi.Isbn"
                + " where Kashidashi.Isbn = '"+ ISBN +"' AND HenDate NOT IS NULL;";
        try {
             //tao doi tuong statement de chua du lieu lay tu sql
            Statement ts = connection.createStatement();
            rs = ts.executeQuery(sqlCommad); //lenh thuc thi cau lenh sql tra ve gia tri mang sql
        } catch (SQLException ex) {
            System.out.println("select error \n"+ ex.toString());
        }
        
        return rs;
       } 
    
    //xac dinh loai book
    ResultSet getSearchBook(String ISBN){
        ResultSet rs = null;  //tao doi tuong chua du lieu tra ve
        //lay giu lieu bang truy van sql
        String sqlCommad = "SELECT Title FROM 18JN0231.Book where Isbn = '"+ ISBN +"';";
        try {
             //tao doi tuong statement de chua du lieu lay tu sql
            Statement ts = connection.createStatement();
            rs = ts.executeQuery(sqlCommad); //lenh thuc thi cau lenh sql tra ve gia tri mang sql
        } catch (SQLException ex) {
            System.out.println("select error \n"+ ex.toString());
        }
        
        return rs;
       } 
    
    //cap nhat ngay tra sach(update 返却日)
    int updateHendate(String ISBN) throws SQLException{
        
        //today creat voi gia tri theo kieu (Mon Aug 25 12:34:56 JST 2014)
        Date today = new Date();
        //formart day creat
        SimpleDateFormat dateformart = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        //dinh dang ngay tr ve 1 chuoi
        String Hendate = dateformart.format(today);   
        String sql = "UPDATE `18JN0231`.`Kashidashi` SET `HenDate` = '"+ Hendate +"' WHERE (`Isbn` = '" +ISBN +"');";
        Statement statment = connection.createStatement();
        int cnt = statment.executeUpdate(sql);
        return cnt;
    }
    
}
