/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.controller;

import com.mycompany.demo_java_web02.dao.controller.SinhVienJpaController;
import com.mycompany.demo_java_web02.dao.entity.LopHoc;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.UserTransaction;
import services.dto.LopHocDTO;

/**
 *
 * @author doanxuanquyet
 */
public class LopHocController implements IController<LopHocDTO, LopHoc> {

    static EntityManagerFactory emf = null;
    static UserTransaction utx = null;

    static {
        emf = Persistence.createEntityManagerFactory("com.mycompany_Demo_java_web02_war_1.0-SNAPSHOTPU");
        Context context;
        try {
            context = new InitialContext();
            utx = (UserTransaction) context.lookup("java:comp/UserTransaction");
        } catch (NamingException ex) {
            Logger.getLogger(LopHocController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    SinhVienJpaController controller = new SinhVienJpaController(utx, emf);

    @Override
    public LopHocDTO insert(LopHocDTO sv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LopHocDTO updateById(LopHocDTO sv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteById(LopHocDTO sv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<LopHocDTO> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LopHocDTO findById(LopHoc k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void persist(Object object) {
        /* Add this to the deployment descriptor of this module (e.g. web.xml, ejb-jar.xml):
         * <persistence-context-ref>
         * <persistence-context-ref-name>persistence/LogicalName</persistence-context-ref-name>
         * <persistence-unit-name>com.mycompany_Demo_java_web02_war_1.0-SNAPSHOTPU</persistence-unit-name>
         * </persistence-context-ref>
         * <resource-ref>
         * <res-ref-name>UserTransaction</res-ref-name>
         * <res-type>javax.transaction.UserTransaction</res-type>
         * <res-auth>Container</res-auth>
         * </resource-ref> */
        try {
            Context ctx = new InitialContext();
            UserTransaction utx = (UserTransaction) ctx.lookup("java:comp/env/UserTransaction");
            utx.begin();
            EntityManager em = (EntityManager) ctx.lookup("java:comp/env/persistence/LogicalName");
            em.persist(object);
            utx.commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            throw new RuntimeException(e);
        }
    }

}
