/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.mapper;

import com.mycompany.demo_java_web02.dao.entity.SinhVien;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import services.dto.SinhVienDTO;

/**
 *
 * @author doanxuanquyet
 */
public class CovertListSinhVien {

    SinhVienMapper sinhVienMapper = new SinhVienMapper();

    public ArrayList<SinhVienDTO> toListDTO(Collection<SinhVien> sinhVienCollection) {
        ArrayList<SinhVienDTO> list = null;
        for (SinhVien sv : sinhVienCollection) {
            list.add(sinhVienMapper.toDTO(sv));
        }
        return list;
    }

    public Collection<SinhVien> toCollectionEntity(ArrayList<SinhVienDTO> list) {
        Collection<SinhVien> collection = null;
        for (SinhVienDTO sv : list) {
            collection.add(sinhVienMapper.toEntity(sv));
        }
        return collection;
    }
}
