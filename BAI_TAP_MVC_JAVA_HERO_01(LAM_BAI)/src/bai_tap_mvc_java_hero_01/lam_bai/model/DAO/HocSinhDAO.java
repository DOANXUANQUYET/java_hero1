/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_mvc_java_hero_01.lam_bai.model.DAO;

import bai_tap_mvc_java_hero_01.lam_bai.model.HocSinh;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author doanxuanquyet
 */
public class HocSinhDAO implements IDAO<HocSinh> {

    @Override
    public List<HocSinh> getAll() {
        List<HocSinh> list = null;
        Connection con = ConnectionDB.connect();
        PreparedStatement ps = null;
        ResultSet ret = null;

        if (con != null) {
            try {
                list = new ArrayList<>();
                String sql = "select * from HocSinh";
                //ket noi connetion va cau lenh sql
                ps = con.prepareStatement(sql);
                //thuc hien lenh select sql
                ret = ps.executeQuery();
                while (ret.next()) {
                    //get kieu du lieu va truyen vao ten cot hoac so thu tu cua cot
                    int maSv = ret.getInt("ma");
                    String ten = ret.getString("ten");
                    Date ngaySinh = ret.getDate("ngaySinh");
                    boolean gioiTinh = ret.getBoolean("gioiTinh");
                    int idLop = ret.getInt("idLop");

                    HocSinh hocsinh = new HocSinh(idLop, ten, ngaySinh, ten, idLop);
                    list.add(hocsinh);
                }

            } catch (SQLException ex) {
                Logger.getLogger(HocSinhDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                ConnectionDB.closeDB(ret, ps, con);
            }

        }
        return list;
    }


    @Override
    public HocSinh addNew(HocSinh sv) {
        Connection con = ConnectionDB.connect();
        PreparedStatement ps = null;
        ResultSet ret = null;

        if (con != null && sv != null) {
            try {

                //tao cau lenh sql
                String sql = "INSERT INTO `HocSinh`(`id`, `ten`, `ngaySinh`, `gioiTinh`, `idLop`) VALUES ([?],[?],[?],[?],[?])";
                //tao preparedStament (cau lenh chuan bi)
                ps = con.prepareStatement(sql);
                //them prameter
                ps.setString(1, sv.getTen());
                //ep kieu date cua java va truyen vao kieu date cua mysql
                ps.setDate(2, new Date(sv.getNgaySinh().getTime()));
                //thuc thi cau lenh // dung executeUpdate tra ve so dong bi tuong tac
                int rowAff = ps.executeUpdate();
                if (rowAff > 0) {
                    //neu chuan thi lay va maSV va gan lai cho sv
                    return sv;
                }
                return null;

            } catch (SQLException ex) {
                Logger.getLogger(HocSinhDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                ConnectionDB.closeDB(ret, ps, con);
            }

        }

        return null;

    }

    @Override
    public HocSinh upDate(HocSinh t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HocSinh find(HocSinh t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
