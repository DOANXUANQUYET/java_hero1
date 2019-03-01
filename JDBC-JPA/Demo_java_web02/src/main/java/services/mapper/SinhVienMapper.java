/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.mapper;

import com.mycompany.demo_java_web02.dao.entity.LopHoc;
import com.mycompany.demo_java_web02.dao.entity.SinhVien;
import services.dto.SinhVienDTO;

/**
 *
 * @author doanxuanquyet
 */
public class SinhVienMapper implements IMapper<SinhVienDTO, SinhVien>{

    @Override
    public SinhVienDTO toDTO(SinhVien entity) {
        SinhVienDTO sinhVienDTO = new SinhVienDTO();
        sinhVienDTO.setMa(entity.getMa());
        sinhVienDTO.setTen(entity.getTen());
        sinhVienDTO.setMaLop(entity.getMaLop().getMa());
        return sinhVienDTO;
    }

    @Override
    public SinhVien toEntity(SinhVienDTO dTO) {
        SinhVien sinhVien = new SinhVien();
        sinhVien.setMa(dTO.getMa());
        sinhVien.setTen(dTO.getTen());
        sinhVien.setMaLop(new LopHoc(dTO.getMaLop(), null, null));
        return sinhVien;
    }
    
}
