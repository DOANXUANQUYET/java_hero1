/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo_sanpham.controller;

import com.mycompany.demo_sanpham.dao.controller.SanPhamJpaController;
import com.mycompany.demo_sanpham.dao.entity.SanPham;
import com.mycompany.demo_sanpham.dto.SanPhamDTO;
import com.mycompany.demo_sanpham.mapper.SanPhamMapper;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.UserTransaction;
import org.mapstruct.Mapper;

/**
 *
 * @author doanxuanquyet
 */
public class SanPhamController {

    static UserTransaction utx = null;
    static EntityManagerFactory emf = null;
    SanPhamJpaController com = null;

    public SanPhamController() {
        Context ctx;
        try {
            ctx = new InitialContext();
            utx = (UserTransaction) ctx.lookup("java:comp/UserTransaction");
            emf = Persistence.createEntityManagerFactory("com.mycompany_Demo_SanPham_war_1.0-SNAPSHOTPU");
        } catch (NamingException ex) {
            Logger.getLogger(SanPhamController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<SanPhamDTO> getAll() {
        SanPhamController con = new SanPhamController();
        com = new SanPhamJpaController(SanPhamController.utx, SanPhamController.emf);
        List<SanPham> listsp = com.findSanPhamEntities();
        List<SanPhamDTO> list = new ArrayList<>();
        listsp.stream().map((sp) -> SanPhamMapper.INSTANCE.toDTO(sp)).forEachOrdered((toDTO) -> {
            list.add(toDTO);
        });
        return list;
    }

    public SanPhamDTO find(int ma) {
        SanPhamController con = new SanPhamController();
        com = new SanPhamJpaController(SanPhamController.utx, SanPhamController.emf);
        SanPhamDTO sp = SanPhamMapper.INSTANCE.toDTO(com.findSanPham(ma));
        return sp;
    }

    public List<SanPhamDTO> getAll2() {
        EntityManager em = emf.createEntityManager();
        Query cQuery = em.createQuery("SELECT s FROM SanPham s ");
        List<SanPham> listsp = cQuery.getResultList();
        List<SanPhamDTO> list = new ArrayList<>();
        listsp.stream().map((sp) -> SanPhamMapper.INSTANCE.toDTO(sp)).forEachOrdered((toDTO) -> {
            list.add(toDTO);
        });
        return list;
    }

}
