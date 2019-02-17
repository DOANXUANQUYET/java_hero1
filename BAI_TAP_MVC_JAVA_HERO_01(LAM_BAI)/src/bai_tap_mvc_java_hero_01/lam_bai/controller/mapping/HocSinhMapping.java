/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_mvc_java_hero_01.lam_bai.controller.mapping;

import bai_tap_mvc_java_hero_01.lam_bai.controller.DTO.HocSinhDTO;
import bai_tap_mvc_java_hero_01.lam_bai.model.HocSinh;
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
public class HocSinhMapping implements IMapping<HocSinhDTO, HocSinh>{

    @Override
    public HocSinhDTO modelToDTO(HocSinh sv) {
        
                DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String ngaysinh = dateFormat.format(sv.getNgaySinh());
        return new HocSinhDTO(sv.getId(), sv.getTen(), ngaysinh, sv.getGioiTinh(),sv.getIdLop());
    }

    @Override
    public HocSinh dTOToModel(HocSinhDTO svDTO) {
               HocSinh sv;
        try {
            sv = new HocSinh(svDTO.getId(), svDTO.getTen(), (Date) new SimpleDateFormat("dd-MM-yyyy").parse(svDTO.getNgaySinh()),svDTO.getGioiTinh(),svDTO.getIdLop());
            return sv;
        } catch (ParseException ex) {
            Logger.getLogger(HocSinhMapping.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
