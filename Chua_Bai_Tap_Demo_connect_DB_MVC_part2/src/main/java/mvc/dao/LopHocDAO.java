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
import mvc.entity.LopHoc;
import mvc.entity.SinhVien;

/**
 *
 * @author doanxuanquyet
 */
public class LopHocDAO implements IDAO<LopHoc, Integer> {

    private static final String SQL_INSERT = "INSERT INTO `LopHoc`(`ma`, `ten`) VALUES ([?],[?])";
    private static final String SQL_SELECT = "SELECT `ma`, `ten` FROM `LopHoc` WHERE 1";
    private static final String SQL_UPDATE = "UPDATE `LopHoc` SET `ma`=[?],`ten`=[?] WHERE 1";
    private static final String SQL_DELETE = "DELETE FROM `LopHoc` WHERE `id` = [?]";

    @Override
    public LopHoc insert(LopHoc sv) throws DBConnectionException, InsertExceptions {
        Connection con = ConnectionDB.connect();
        PreparedStatement ps = null;

        if (con != null && sv != null) {
            try {

                //tao preparedStament (cau lenh chuan bi)
                ps = con.prepareStatement(SQL_INSERT);
                //them prameter

                ps.setInt(1, sv.getMa());
                ps.setString(2, sv.getTen());

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
    public LopHoc updateById(LopHoc t) throws DBConnectionException, UpdateExceptions {
        Connection con = ConnectionDB.connect();
        PreparedStatement ps = null;

        if (con != null && t != null) {
            try {

                //tao preparedStament (cau lenh chuan bi)
                ps = con.prepareStatement(SQL_UPDATE);
                //them prameter

                ps.setString(1, t.getTen());
                int rowAff = ps.executeUpdate();
                if (rowAff > 0) {
                    //neu chuan thi lay va maSV va gan lai cho sv
                    return t;
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
    public boolean deleteById(LopHoc t) throws DBConnectionException, DeleteExceptions {
        Connection con = ConnectionDB.connect();
        PreparedStatement ps = null;

        if (con != null && t != null) {
            try {

                //tao preparedStament (cau lenh chuan bi)
                ps = con.prepareStatement(SQL_DELETE);
                //them prameter

                ps.setInt(1, t.getMa());
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
    public List<LopHoc> getAll() throws DBConnectionException, SelectExceptions {
        List<LopHoc> list = null;
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

                    LopHoc lopHoc = new LopHoc(maSv, ten);
                    list.add(lopHoc);
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
    public LopHoc findById(Integer k) throws DBConnectionException, SelectExceptions {
        //lay list sinh vien tu database
        List<LopHoc> listSinhViens = this.getAll();
        LopHoc foundSv = null;
        //tim kiem trong list
        for (LopHoc sv : listSinhViens) {
            if (sv.getMa() == k) {
               return sv;
            }
        }
        return null;
    }

}
