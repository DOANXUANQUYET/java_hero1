/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo_sanpham.mapper;

import com.mycompany.demo_sanpham.dao.entity.SanPham;
import com.mycompany.demo_sanpham.dto.SanPhamDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author doanxuanquyet
 */
@Mapper
public interface SanPhamMapper {
    
    SanPhamMapper INSTANCE = Mappers.getMapper(SanPhamMapper.class);

    @Mappings({
        @Mapping(source = "sp.ma", target = "code"),
        @Mapping(source = "sp.ten", target = "name"),
        @Mapping(source = "sp.gia", target = "price")
    })
    SanPhamDTO toDTO(SanPham sp);
    
        @Mappings({
        @Mapping(source = "spdto.code", target = "ma"),
        @Mapping(source = "spdto.name", target = "ten"),
        @Mapping(source = "spdto.price", target = "gia")
    })
        SanPham toEntity(SanPhamDTO spdto);

}
