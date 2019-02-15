/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_connect_db;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author doanxuanquyet
 */
public class DemoSelect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection cnn = null;
        PreparedStatement pre = null;
        ResultSet set = null;

        try {
            // TODO code application logic here
            /*
            cac buoc ket noi db trong java
            b1: download va add jdbc driver
            b2: load driver va ket noi den db ; com.mysql.jdbc.Driver
            
            
             */
            // lenh load chuong trinh dau tien
            Class.forName("com.mysql.jdbc.Driver");
            //ket noi voi mysql
            cnn = DriverManager.getConnection("jdbc:mysql://localhost/java_hero", "pma", "12345");
            //tao cau lenh sql
            String sql = "select * from `java_hero`.`SinhVien` where ten = ? and ngaysinh = ?;";
            //tao preparedStament (cau lenh chuan bi)
            pre = (PreparedStatement) cnn.prepareStatement(sql);
            //them parameter
            pre.setString(1, "Nguyen Van a");
            //ep kieu date cua java va truyen vao kieu date cua mysql
            pre.setDate(2, new Date(new java.util.Date().getTime()));
            //thuc thi cau lenh // dung executeNonQuery tra ve du lieu
             set = pre.executeQuery();
            while(set.next()){
                //get kieu du lieu va truyen vao ten cot hoac so thu tu cua cot
                int maSv = set.getInt("ma");
                String name = set.getString(2);
                Date date = set.getDate("ngaysinh");
                System.out.println(maSv);
                System.out.println(name);
                System.out.println(date);
                System.out.println("-------------------------------------");
                
            }

            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DemoUpdate.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                set.close();
            } catch (SQLException ex) {
                Logger.getLogger(DemoSelect.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                pre.close();
            } catch (SQLException ex) {
                Logger.getLogger(DemoUpdate.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                cnn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DemoUpdate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
