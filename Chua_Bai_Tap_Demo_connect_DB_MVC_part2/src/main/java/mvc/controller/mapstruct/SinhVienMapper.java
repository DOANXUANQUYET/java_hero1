/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.controller.mapstruct;

import mvc.controller.dto.SinhVienDTO;
import mvc.entity.SinhVien;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author doanxuanquyet
 */

@Mapper
public interface SinhVienMapper {
    
    //chay mapper

    /**
     *
     */
    SinhVienMapper obj = Mappers.getMapper(SinhVienMapper.class);
    
    //cai ham cua minh
    SinhVienDTO toDTO(SinhVien sv);
}
