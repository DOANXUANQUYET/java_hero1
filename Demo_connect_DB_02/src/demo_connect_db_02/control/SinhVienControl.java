/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_connect_db_02.control;

import demo_connect_db_02.control.model.SinhVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author doanxuanquyet
 */
public class SinhVienControl {
    
    public List<SinhVien> getAll(){
        List<SinhVien> list = null;
        Connection con = ConnectionDB.connect();
        PreparedStatement ps = null;
        ResultSet ret = null;
        
        if(con != null){
            try {
                ps = con.prepareStatement("select * from SinhVien");
       
            } catch (SQLException ex) {
                Logger.getLogger(SinhVienControl.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        return list;
    }
    
}
