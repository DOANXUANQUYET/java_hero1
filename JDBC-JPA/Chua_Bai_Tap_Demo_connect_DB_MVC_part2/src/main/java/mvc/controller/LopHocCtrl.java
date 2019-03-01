/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.controller;

import java.util.List;
import java.util.stream.Collectors;
import mvc.connection.DBConnectionException;
import mvc.controller.dto.LopHocDTO;
import mvc.controller.mapping.IMapping;
import mvc.controller.mapping.LopHocMapping;
import mvc.dao.IDAO;
import mvc.dao.LopHocDAO;
import mvc.dao.exceptions.DeleteExceptions;
import mvc.dao.exceptions.InsertExceptions;
import mvc.dao.exceptions.SelectExceptions;
import mvc.dao.exceptions.UpdateExceptions;
import mvc.entity.LopHoc;

/**
 *
 * @author doanxuanquyet
 */
public class LopHocCtrl implements IController<LopHocDTO, Integer>{

    //tao cac doi tuong can thiet khi convert
    IDAO<LopHoc, Integer> lopHocDAO = new LopHocDAO();
    IMapping<LopHoc, LopHocDTO>  lopHocMapping = new LopHocMapping();
    
    @Override
    public LopHocDTO insert(LopHocDTO sv) throws DBConnectionException, InsertExceptions {
        
        //convert lophocDTO thanh lophoc de thao tac voi database qua lophocDAO
        LopHoc lopHoc = lopHocMapping.DTOtoEntity(sv);
        
        //dung lophoc thao tac voi database tra ve ket qua retlophoc
        LopHoc retLopHoc = lopHocDAO.insert(lopHoc);
        
        //convert ket qua tra lai kei lophocDTO de thao tac voi view
        return lopHocMapping.EntitytoDTO(retLopHoc);
    }

    @Override
    public LopHocDTO updateById(LopHocDTO sv) throws DBConnectionException, UpdateExceptions {
        //convert lophocDTO thanh lophoc de thao tac voi database qua lophocDAO
        LopHoc lopHoc = lopHocMapping.DTOtoEntity(sv);
        
        //dung lophoc thao tac voi database tra ve ket qua retlophoc
        LopHoc retLopHoc = lopHocDAO.updateById(lopHoc);
        
        //convert ket qua tra lai kei lophocDTO de thao tac voi view
        return lopHocMapping.EntitytoDTO(retLopHoc);
    }

    @Override
    public boolean deleteById(LopHocDTO sv) throws DBConnectionException, DeleteExceptions {
        //convert lophocDTO thanh lophoc de thao tac voi database qua lophocDAO
        LopHoc lopHoc = lopHocMapping.DTOtoEntity(sv);
        
        //dung lophoc thao tac voi database tra ve ket qua boolean
        return lopHocDAO.deleteById(lopHoc);
        
    }

    @Override
    public List<LopHocDTO> getAll() throws DBConnectionException, SelectExceptions {
        
        //lay danh sach lop tu database
        List<LopHoc> listLopHocs = lopHocDAO.getAll();
        
        //dung stream convert lai danh sach qua kieu lophocDTO
        List<LopHocDTO> collect = listLopHocs.stream()
                .map(lopHocMapping::EntitytoDTO)
                .collect(Collectors.toList());
        return collect;
    }

    @Override
    public LopHocDTO findById(Integer k) throws DBConnectionException, SelectExceptions {
        
        //tim lop trong database by ID
        LopHoc retLopHoc = lopHocDAO.findById(k);
        
        //convert tra ve kieu lophocDTO
        return lopHocMapping.EntitytoDTO(retLopHoc);
    }
    
}
