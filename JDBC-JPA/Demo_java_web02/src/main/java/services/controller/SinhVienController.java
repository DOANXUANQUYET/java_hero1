/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.controller;

import com.mycompany.demo_java_web02.dao.controller.SinhVienJpaController;
import com.mycompany.demo_java_web02.dao.entity.SinhVien;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.UserTransaction;
import services.dto.SinhVienDTO;
import services.mapper.SinhVienMapper;

/**
 *
 * @author doanxuanquyet
 */
public class SinhVienController implements IController<SinhVienDTO, SinhVien> {

    static EntityManagerFactory emf = null;
    static UserTransaction utx = null;

    public SinhVienController() {
        emf = Persistence.createEntityManagerFactory("com.mycompany_Demo_java_web02_war_1.0-SNAPSHOTPU");
        Context context;
        try {
            context = new InitialContext();
            utx = (UserTransaction) context.lookup("java:comp/UserTransaction");
        } catch (NamingException ex) {
            Logger.getLogger(LopHocController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    SinhVienJpaController controller = null;
    SinhVienMapper sinhVienMapper = null;

    @Override
    public SinhVienDTO insert(SinhVienDTO sv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SinhVienDTO updateById(SinhVienDTO sv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteById(SinhVienDTO sv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SinhVienDTO> getAll() {
        SinhVienController svController = new SinhVienController();
        controller = new SinhVienJpaController(SinhVienController.utx, SinhVienController.emf);
        sinhVienMapper = new SinhVienMapper();
        List<SinhVien> findSinhVienEntities = controller.findSinhVienEntities();
        List<SinhVienDTO> list = new ArrayList<>();

        for (SinhVien sv : findSinhVienEntities) {
            SinhVienDTO svDTO = sinhVienMapper.toDTO(sv);
            list.add(svDTO);
        }
        return list;

    }

    @Override
    public SinhVienDTO findById(SinhVien k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
