package com.mycompany.demo_sanpham.mapper;

import com.mycompany.demo_sanpham.dao.entity.SanPham;
import com.mycompany.demo_sanpham.dto.SanPhamDTO;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-02-27T00:28:50+0900",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
public class SanPhamMapperImpl implements SanPhamMapper {

    @Override
    public SanPhamDTO toDTO(SanPham sp) {
        if ( sp == null ) {
            return null;
        }

        SanPhamDTO sanPhamDTO = new SanPhamDTO();

        sanPhamDTO.setName( sp.getTen() );
        if ( sp.getMa() != null ) {
            sanPhamDTO.setCode( sp.getMa() );
        }
        if ( sp.getGia() != null ) {
            sanPhamDTO.setPrice( sp.getGia() );
        }

        return sanPhamDTO;
    }

    @Override
    public SanPham toEntity(SanPhamDTO spdto) {
        if ( spdto == null ) {
            return null;
        }

        SanPham sanPham = new SanPham();

        sanPham.setMa( spdto.getCode() );
        sanPham.setTen( spdto.getName() );
        sanPham.setGia( spdto.getPrice() );

        return sanPham;
    }
}
