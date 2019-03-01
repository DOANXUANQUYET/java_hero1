/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.controller;

import java.util.List;
import java.util.stream.Collectors;
import mvc.connection.DBConnectionException;
import mvc.controller.dto.SinhVienDTO;
import mvc.controller.mapping.SinhVienMapping;
import mvc.dao.SinhVienDAO;
import mvc.dao.exceptions.DeleteExceptions;
import mvc.dao.exceptions.InsertExceptions;
import mvc.dao.exceptions.SelectExceptions;
import mvc.dao.exceptions.UpdateExceptions;
import mvc.entity.SinhVien;

/**
 *
 * @author doanxuanquyet
 */
public class SinhVienCtrl implements IController<SinhVienDTO, Integer> {

    SinhVienMapping sinhVienMapping = new SinhVienMapping();
    SinhVienDAO sinhVienDAO = new SinhVienDAO();

    //can xu li them loi khi thao tac khong thanh cong
    @Override
    public SinhVienDTO insert(SinhVienDTO sv) throws DBConnectionException, InsertExceptions {
        //convert sinhvienDTO thanh sinhvienEntity de su dung sinhvienDAO
        SinhVien sinhVien = sinhVienMapping.DTOtoEntity(sv);

        //su dung sinhvien vua convert thao tac voi database qua sinhvienDAO tra ve ket qua sinh vien
        SinhVien retSinhVien = sinhVienDAO.insert(sinhVien);

        //convert retSinhvien tro lai sinhvienDTO de tuong tac voi view thong bao ket qua cho nguoi dung
        return sinhVienMapping.EntitytoDTO(retSinhVien);

    }

    @Override
    public SinhVienDTO updateById(SinhVienDTO sv) throws DBConnectionException, UpdateExceptions {
        //convert sinhvienDTO thanh sinhvienEntity de su dung sinhvienDAO
        SinhVien sinhVien = sinhVienMapping.DTOtoEntity(sv);

        //su dung sinhvien vua convert thao tac voi database qua sinhvienDAO tra ve ket qua sinh vien
        SinhVien retSinhVien = sinhVienDAO.updateById(sinhVien);

        //convert retSinhvien tro lai sinhvienDTO de tuong tac voi view thong bao ket qua cho nguoi dung
        return sinhVienMapping.EntitytoDTO(retSinhVien);

    }

    @Override
    public boolean deleteById(SinhVienDTO sv) throws DBConnectionException, DeleteExceptions {
        //convert sinhvienDTO thanh sinhvienEntity de su dung sinhvienDAO
        SinhVien sinhVien = sinhVienMapping.DTOtoEntity(sv);

        //su dung sinhvien vua convert thao tac voi database qua sinhvienDAO tra ve ket qua boolean
        return sinhVienDAO.deleteById(sinhVien);
    }

    @Override
    public List<SinhVienDTO> getAll() throws DBConnectionException, SelectExceptions {

        //lay danh sach sinh vien tu co so du lieu
        List<SinhVien> listSinhVien = sinhVienDAO.getAll();

        List<SinhVienDTO> collect;
        collect = listSinhVien.stream()
                //map thao tac truc tiep voi tung phan tu trong stream
                //convert sinhvien thanh sinhvienDTO
                //map truyen class sinhvien vao va goi EntitytoDTO() trong sinhvienMapping;
                .map(sinhVienMapping::EntitytoDTO)
                //tra ve listsinhvienDTO da covert
                .collect(Collectors.toList());
        return collect;
    }

    @Override
    public SinhVienDTO findById(Integer k) throws DBConnectionException, SelectExceptions {

        //tim sinhvien trong database by ID tra ve sinhvien
        SinhVien foundSinhVien = sinhVienDAO.findById(k);

        //convert tra lai kieu sinhvienDTO
        return sinhVienMapping.EntitytoDTO(foundSinhVien);

    }

}
