/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_connect_db_02.control;

import demo_connect_db_02.model.SinhVien;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author doanxuanquyet
 */
public class SinhVienMapping implements IMapping<SinhVienDTO, SinhVien>{

    //chuyen tu sinhvien sang sinhvienDTO
    @Override
    public  SinhVienDTO modelToDTO(SinhVien sv) {

        //ngay sinh phai format lai
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String ngaysinh = dateFormat.format(sv.getNgaysinh());
        SinhVienDTO svDTO = new SinhVienDTO(sv.getMa(), sv.getTen(), ngaysinh);
        return svDTO;
    }

    //chuyen tu sinhvienDTO sang sinhvien
    @Override
    public  SinhVien dTOToModel(SinhVienDTO svDTO) {

        //phai chuyen tu ngay sinh String sang date
        SinhVien sv;
        try {
            sv = new SinhVien(svDTO.getMa(), svDTO.getTen(), (Date) new SimpleDateFormat("dd-MM-yyyy").parse(svDTO.getNgaysinh()));
            return sv;
        } catch (ParseException ex) {
            Logger.getLogger(SinhVienMapping.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
