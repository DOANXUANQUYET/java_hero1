/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_connect_db;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author doanxuanquyet
 */
public class DemoUpdate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection cnn = null;
        PreparedStatement pre = null;

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
            String sql = "INSERT INTO `java_hero`.`SinhVien` (`ten`, `ngaysinh`) VALUES ('Nguyen Van a', '2019-2-15');";
            //tao preparedStament (cau lenh chuan bi)
            pre = (PreparedStatement) cnn.prepareStatement(sql);
            //thuc thi cau lenh // dung executeUpdate tra ve so dong bi tuong tac
            int cnt = pre.executeUpdate();
            if (cnt > 0) {
                System.out.println("connected succes");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DemoUpdate.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
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
