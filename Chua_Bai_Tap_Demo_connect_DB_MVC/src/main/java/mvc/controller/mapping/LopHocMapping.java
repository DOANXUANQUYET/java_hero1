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
public class LopHocMapping implements IMapping<LopHocDTO, LopHoc>{

    @Override
    public LopHocDTO DTOtoEntity(LopHoc k) {
        //....
        return  null;
    }

    @Override
    public LopHoc EntitytoDTO(LopHocDTO t) {
        //...
        return null;
    }
    
}
