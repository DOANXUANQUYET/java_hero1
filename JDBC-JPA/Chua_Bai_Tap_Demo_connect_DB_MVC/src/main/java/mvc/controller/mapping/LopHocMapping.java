/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.controller.mapping;

import mvc.controller.dto.LopHocDTO;
import mvc.entity.LopHoc;

/**
 *
 * @author doanxuanquyet
 */
public class LopHocMapping implements IMapping<LopHoc, LopHocDTO>{

    @Override
    public LopHoc DTOtoEntity(LopHocDTO k) {
       LopHoc lopHoc = new LopHoc();
       lopHoc.setMa(k.getMa());
       lopHoc.setTen(k.getTen());
        return  lopHoc;
    }

    @Override
    public LopHocDTO EntitytoDTO(LopHoc t) {
        LopHocDTO lopHocDTO = new LopHocDTO();
        lopHocDTO.setMa(t.getMa());
        lopHocDTO.setTen(t.getTen());
        return lopHocDTO;
    }
    
}
