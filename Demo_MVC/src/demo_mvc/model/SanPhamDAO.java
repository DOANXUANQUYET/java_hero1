/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_mvc.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author doanxuanquyet
 */
public class SanPhamDAO {

    //lay du lieu san pham truyen vao database, tra ve sp da duoc them vao, neu k thanh cong tra ve null
    public SanPham themMoi(SanPham sp) {

        Connection con = OpenDB.open();
        PreparedStatement ps = null;
        if (con != null && sp != null) {
            try {
                String sql = "INSERT INTO `SanPham`(`ma`, `ten`, `gia`) VALUES ([?],[?],[?])";
                ps = con.prepareStatement(sql);
                //them prameter
                ps.setInt(1, sp.getMa());
                ps.setString(2, sp.getTen());
                ps.setDouble(3, sp.getGia());
                //thuc hien lenh sql thay doi du lieu dung executeUpdate() tra ve so dong da tuong tac
                int rowAff = ps.executeUpdate();
                if (rowAff > 0) {
                    return sp;
                }
            } catch (SQLException ex) {
                Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally{
                OpenDB.close(null, ps, con);
            }
        }
        return null;
    }

}
