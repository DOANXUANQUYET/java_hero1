/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_mvc_java_hero_01.lam_bai.controller.mapping;

import bai_tap_mvc_java_hero_01.lam_bai.controller.DTO.LopDTO;
import bai_tap_mvc_java_hero_01.lam_bai.model.Lop;

/**
 *
 * @author doanxuanquyet
 */
public class LopMapping implements IMapping<LopDTO, Lop>{

    @Override
    public LopDTO modelToDTO(Lop sv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Lop dTOToModel(LopDTO svDTO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
