/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.mapper;

import com.mycompany.demo_java_web02.dao.entity.LopHoc;
import com.mycompany.demo_java_web02.dao.entity.SinhVien;
import java.util.ArrayList;
import java.util.Collection;
import services.dto.LopHocDTO;
import services.dto.SinhVienDTO;

/**
 *
 * @author doanxuanquyet
 */
public class LopHocMapper implements IMapper<LopHocDTO, LopHoc>{

    CovertListSinhVien co = new CovertListSinhVien();
    @Override
    public LopHocDTO toDTO(LopHoc entity) {
        LopHocDTO lopHocDTO = new LopHocDTO();
        lopHocDTO.setMa(entity.getMa());
        lopHocDTO.setTen(entity.getTen());
        ArrayList<SinhVienDTO> listSvDTO = co.toListDTO(entity.getSinhVienCollection());
        lopHocDTO.setListSinhVienDTOs(listSvDTO);
        return lopHocDTO;
    }

    @Override
    public LopHoc toEntity(LopHocDTO dTO) {
        LopHoc lopHoc = new LopHoc();
        lopHoc.setMa(dTO.getMa());
        lopHoc.setTen(dTO.getTen());
        Collection<SinhVien> collectionSV = co.toCollectionEntity(dTO.getListSinhVienDTOs());
        lopHoc.setSinhVienCollection(collectionSV);
        return lopHoc;
    }
    
}
