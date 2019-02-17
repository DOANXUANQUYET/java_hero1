/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_mvc.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelInterface.ISanPhamDAO;
import modelInterface.SanPham;

/**
 *
 * @author doanxuanquyet
 */
public class SanPhamDAO implements ISanPhamDAO<SanPham>{

    //lay du lieu san pham truyen vao database, tra ve sp da duoc them vao, neu k thanh cong tra ve null
    @Override
    public SanPham addNew(SanPham sp) {

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

    @Override
    public SanPham updateByMa(SanPham sp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SanPham deleteByMa(SanPham sp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SanPham findMa(SanPham sp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SanPham> getAll() {
        List<SanPham> listSp = new ArrayList<>();
        Connection con = OpenDB.open();
        PreparedStatement ps = null;
        ResultSet ret = null;
        if (con != null) {
            try {
                String sql = "SELECT * FROM `SanPham` WHERE 1";
                ps = con.prepareStatement(sql);
                //thuc hien lenh sql truy xuat du lieu dung executeQuery() tra ve du lieu kieu bang cua database
                ret = ps.executeQuery();
                while(ret.next()){
                    int ma = ret.getInt("ma");
                    String ten = ret.getString("ten");
                    double gia = ret.getDouble("gia");
                    listSp.add(new SanPham(ma,ten,gia));
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally{
                OpenDB.close(ret, ps, con);
            }
        }
        return listSp;
    }



}
