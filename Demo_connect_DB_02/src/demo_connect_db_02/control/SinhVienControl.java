/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_connect_db_02.control;

import demo_connect_db_02.model.DAO.IDAO;
import demo_connect_db_02.model.DAO.SinhVienDAO;
import demo_connect_db_02.model.SinhVien;
import java.util.List;

/**
 *
 * @author doanxuanquyet
 */
public class SinhVienControl implements IConTroller<MyDTO> {

    IDAO<SinhVien> dao;
    IMapping<SinhVienDTO, SinhVien> svMapping;

    @Override
    public MyDTO addNew(MyDTO t) {

        svMapping = new SinhVienMapping();
        //chuyen sinhvienDTO thanh sinhvien sau do goi DAO
        SinhVien sv = svMapping.dTOToModel((SinhVienDTO) t);
        //thuc hien truyen sv qua DAO de thao tac voi DB sau do tra lai ket qua newSv
        dao = new SinhVienDAO();
        SinhVien newSV = dao.addNew(sv);

        //chuyen newSV tro lai kieu DTO va tra ve
        return svMapping.modelToDTO(newSV);
    }

    @Override
    public MyDTO upDate(MyDTO t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<MyDTO> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MyDTO find(MyDTO t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
