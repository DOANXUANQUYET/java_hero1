/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_connect_db_02.model.DAO;

import demo_connect_db_02.model.SinhVien;
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
public class SinhVienDAO implements ISinhVienDAO{

    @Override
    public List<SinhVien> getAll() {
        List<SinhVien> list = null;
        Connection con = ConnectionDB.connect();
        PreparedStatement ps = null;
        ResultSet ret = null;

        if (con != null) {
            try {
                list = new ArrayList<>();
                String sql = "select * from SinhVien";
                //ket noi connetion va cau lenh sql
                ps = con.prepareStatement(sql);
                //thuc hien lenh select sql
                ret = ps.executeQuery();
                while (ret.next()) {
                    //get kieu du lieu va truyen vao ten cot hoac so thu tu cua cot
                    int maSv = ret.getInt("ma");
                    String name = ret.getString("ten");
                    Date date = ret.getDate("ngaysinh");

                    SinhVien sinhVien = new SinhVien(maSv, sql, date);
                    list.add(sinhVien);
                }

            } catch (SQLException ex) {
                Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                ConnectionDB.closeDB(ret, ps, con);
            }

        }
        return list;
    }

    @Override
    public SinhVien addNew(SinhVien sv) {
        Connection con = ConnectionDB.connect();
        PreparedStatement ps = null;
        ResultSet ret = null;

        if (con != null && sv != null) {
            try {

                //tao cau lenh sql
                String sql = "INSERT INTO `SinhVien`(`ten`, `ngaysinh`) VALUES ([?],[?]);";
                //tao preparedStament (cau lenh chuan bi)
                ps = con.prepareStatement(sql);
                //them prameter
                ps.setString(1, sv.getTen());
                //ep kieu date cua java va truyen vao kieu date cua mysql
                ps.setDate(2, new Date(sv.getNgaysinh().getTime()));
                //thuc thi cau lenh // dung executeUpdate tra ve so dong bi tuong tac
                int rowAff = ps.executeUpdate();
                if (rowAff > 0) {
                    //neu chuan thi lay va maSV va gan lai cho sv
                    return sv;
                }
                return null;

            } catch (SQLException ex) {
                Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                ConnectionDB.closeDB(ret, ps, con);
            }

        }

        return null;

    }

    @Override
    public SinhVien upDate(SinhVien t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SinhVien find(SinhVien t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
