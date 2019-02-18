/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.controller;

import java.util.List;
import mvc.connection.DBConnectionException;
import mvc.controller.dto.SinhVienDTO;
import mvc.dao.exceptions.DeleteExceptions;
import mvc.dao.exceptions.InsertExceptions;
import mvc.dao.exceptions.SelectExceptions;
import mvc.dao.exceptions.UpdateExceptions;

/**
 *
 * @author doanxuanquyet
 */
public class SinhVienCtrl implements IController<SinhVienDTO, Integer>{

    @Override
    public SinhVienDTO insert(SinhVienDTO sv) throws DBConnectionException, InsertExceptions {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SinhVienDTO updateById(SinhVienDTO sv) throws DBConnectionException, UpdateExceptions {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteById(SinhVienDTO sv) throws DBConnectionException, DeleteExceptions {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SinhVienDTO> getAll() throws DBConnectionException, SelectExceptions {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SinhVienDTO findById(Integer k) throws DBConnectionException, SelectExceptions {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
