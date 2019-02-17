/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_mvc_java_hero_01.lam_bai.controller;

import bai_tap_mvc_java_hero_01.lam_bai.controller.DTO.HocSinhDTO;
import bai_tap_mvc_java_hero_01.lam_bai.controller.DTO.IDTO;
import bai_tap_mvc_java_hero_01.lam_bai.controller.mapping.HocSinhMapping;
import bai_tap_mvc_java_hero_01.lam_bai.controller.mapping.IMapping;
import bai_tap_mvc_java_hero_01.lam_bai.model.DAO.HocSinhDAO;
import bai_tap_mvc_java_hero_01.lam_bai.model.DAO.IDAO;
import bai_tap_mvc_java_hero_01.lam_bai.model.HocSinh;
import java.util.List;

/**
 *
 * @author doanxuanquyet
 */
public class HocSinhController implements IDTO<HocSinhDTO>{
    
    IDAO<HocSinh> dao;
    IMapping<HocSinhDTO, HocSinh> map;

    @Override
    public HocSinhDTO addNew(HocSinhDTO t) {
        
        dao = new HocSinhDAO();
        map = new HocSinhMapping();
        
        //chuyen tu hocsinhDTO sang hs
        HocSinh hs = map.dTOToModel(t);
        
        //thao tac voi database
        HocSinh retHocSinh = dao.addNew(hs);
        
        //chuyen ve lai kieu hocsinhDTO
        HocSinhDTO retHocSinhDTO = map.modelToDTO(retHocSinh); 
        if (retHocSinhDTO != null) {
            System.out.println("them moi thanh cong");
            return retHocSinhDTO;
        } else {
            System.out.println("them moi khong thanh cong");
        }
        return null;
    }

    @Override
    public HocSinhDTO upDate(HocSinhDTO t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<HocSinhDTO> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HocSinhDTO find(HocSinhDTO t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
