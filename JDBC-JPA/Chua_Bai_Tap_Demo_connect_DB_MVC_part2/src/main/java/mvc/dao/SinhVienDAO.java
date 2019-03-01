/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mvc.connection.ConnectionDB;
import mvc.connection.DBConnectionException;
import mvc.dao.exceptions.DeleteExceptions;
import mvc.dao.exceptions.InsertExceptions;
import mvc.dao.exceptions.SelectExceptions;
import mvc.dao.exceptions.UpdateExceptions;
import mvc.entity.GioiTinh;
import mvc.entity.LopHoc;
import mvc.entity.SinhVien;

/**
 *
 * @author doanxuanquyet
 */
public class SinhVienDAO implements IDAO<SinhVien, Integer> {

    private static final String SQL_INSERT = "INSERT INTO `SinhVien2`(`ten`, `ngaySinh`, `gioiTinh`) VALUES ([?],[?],[?])";
    private static final String SQL_SELECT = "SELECT `id`, `ten`, `ngaySinh`, `gioiTinh`,`lopHoc` FROM `SinhVien2` WHERE 1";
    private static final String SQL_UPDATE = "UPDATE `HocSinh` SET `ten`=[?],`ngaySinh`=[?],`gioiTinh`=[?] WHERE 1";
    private static final String SQL_DELETE = "DELETE FROM `HocSinh` WHERE `id` = [?]";

    IDAO<LopHoc, Integer> daoLopHoc = (IDAO<LopHoc, Integer>) new LopHocDAO();

    /**
     *
     * @param sv
     * @return
     * @throws DBConnectionException
     * @throws InsertExceptions
     */
    @Override
    public SinhVien insert(SinhVien sv) throws DBConnectionException, InsertExceptions {
        Connection con = ConnectionDB.connect();
        PreparedStatement ps = null;

        if (con != null && sv != null) {
            try {

                //tao preparedStament (cau lenh chuan bi)
                ps = con.prepareStatement(SQL_INSERT);
                //them prameter

                ps.setString(1, sv.getTen());
                //ep kieu date cua java va truyen vao kieu date cua mysql
                ps.setDate(2, new Date(sv.getNgaySinh().getTime()));

                ps.setBoolean(3, sv.getGioiTinh().isThuocTinh());
                //thuc thi cau lenh // dung executeUpdate tra ve so dong bi tuong tac
                int rowAff = ps.executeUpdate();
                if (rowAff > 0) {
                    //neu chuan thi lay va maSV va gan lai cho sv
                    return sv;
                }
                return null;

            } catch (SQLException ex) {
                //tao ra loi
                throw new InsertExceptions();
            } finally {
                ConnectionDB.closeDB(null, ps, con);
            }

        }
        return null;

    }

    @Override
    public SinhVien updateById(SinhVien sv) throws DBConnectionException, UpdateExceptions {
        Connection con = ConnectionDB.connect();
        PreparedStatement ps = null;

        if (con != null && sv != null) {
            try {

                //tao preparedStament (cau lenh chuan bi)
                ps = con.prepareStatement(SQL_UPDATE);
                //them prameter

                ps.setString(1, sv.getTen());
                //ep kieu date cua java va truyen vao kieu date cua mysql
                ps.setDate(2, new Date(sv.getNgaySinh().getTime()));

                //truyen thuoc tinh cua gioi tinh len database
                ps.setBoolean(3, sv.getGioiTinh().isThuocTinh());
                //thuc thi cau lenh // dung executeUpdate tra ve so dong bi tuong tac
                int rowAff = ps.executeUpdate();
                if (rowAff > 0) {
                    //neu chuan thi lay va maSV va gan lai cho sv
                    return sv;
                }
                return null;

            } catch (SQLException ex) {
                //tao ra loi
                throw new UpdateExceptions();
            } finally {
                ConnectionDB.closeDB(null, ps, con);
            }

        }
        return null;
    }

    @Override
    public boolean deleteById(SinhVien sv) throws DBConnectionException, DeleteExceptions {
        Connection con = ConnectionDB.connect();
        PreparedStatement ps = null;

        if (con != null && sv != null) {
            try {

                //tao preparedStament (cau lenh chuan bi)
                ps = con.prepareStatement(SQL_DELETE);
                //them prameter

                ps.setInt(1, sv.getMa());
                //thuc thi cau lenh // dung executeUpdate tra ve so dong bi tuong tac
                int rowAff = ps.executeUpdate();
                return rowAff > 0;

            } catch (SQLException ex) {
                //tao ra loi
                throw new DeleteExceptions();
            } finally {
                ConnectionDB.closeDB(null, ps, con);
            }

        }
        return false;
    }

    @Override
    public List<SinhVien> getAll() throws DBConnectionException, SelectExceptions {
        List<SinhVien> list = null;
        Connection con = ConnectionDB.connect();
        PreparedStatement ps = null;
        ResultSet ret = null;

        if (con != null) {
            try {
                list = new ArrayList<>();
                //ket noi connetion va cau lenh sql
                ps = con.prepareStatement(SQL_SELECT);
                //thuc hien lenh select sql
                ret = ps.executeQuery();
                while (ret.next()) {
                    //get kieu du lieu va truyen vao ten cot hoac so thu tu cua cot
                    int maSv = ret.getInt("ma");
                    String ten = ret.getString("ten");
                    Date ngaySinh = ret.getDate("ngaySinh");
                    //lay gia tri boolen tu database de setGioiTinh
                    GioiTinh gioiTinh = GioiTinh.setGioiTinh(ret.getBoolean("gioiTinh"));

                    //lay ma lop tu database, tim kiem doi tuong lop va tra ve doi tuong lop hoc
                    LopHoc lopHoc = daoLopHoc.findById(ret.getInt("lopHoc"));

                    SinhVien sinhVien = new SinhVien(maSv, ten, ngaySinh, gioiTinh, lopHoc);
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
    public SinhVien findById(Integer k) throws DBConnectionException, SelectExceptions {
        //lay list sinh vien tu database
        List<SinhVien> listSinhViens = this.getAll();
        //tim kiem trong list
        for (SinhVien sv : listSinhViens) {
            if (sv.getMa() == k) {
                return sv;
            }
        }
        return null;
    }

}
