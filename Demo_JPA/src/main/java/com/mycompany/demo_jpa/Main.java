/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo_jpa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author doanxuanquyet
 */
public class Main {

    static EntityManager em = null;

    static {
        //EntityManagerFactory (nha may tao ra EntityManager) nhan vao 1 chuoi tu file xml
        //file xml chua thong tin ket noi voi database , META-INF - persistence.xml
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Day_la_chuoi_tu_file_XML");

        //EntityManager chua cac ham tuong tac truc tiep voi database qua cac entity
        em = emf.createEntityManager();
    }

    public static void main(String[] args) {

        SanPham sp = new SanPham(40, "phuodfng", 12340);
        //function persist[ tiep tuc] nhan vao 1 entity, tuong tu ham insert
        //---------- persist(sp);
        System.out.println("oooooooookkkkkk");

        //function find(entityClass, primary key) truyen vao ten entity va khoa chinh
        //tuong duong voi ham find - tim kiem theo ID
        SanPham retSp = em.find(SanPham.class, 1);
        retSp.setTen("quyet dep trai");

        //function merge(truyen vao entity) tuong tu ham update
        //---------- merge(sp);
        //sau khi thuc hien merge(entity) phai goi lenh [EntityManager.getTransaction().commit();
        em.getTransaction().begin();
        // em.merge(retSp);
        em.getTransaction().commit();
        //gom nhieu cau lenh thanh 1 khoi lenh, tat ca ok thi moi thuc hien, khi 1 cau lenh loi thi tat ca huy bo

        //dung Query nhu cau lenh SQL,nhung hoi khac mot ti xiu, tra ve 1 bien Query
        Query cQuery = em.createQuery("SELECT s FROM SanPham s ");
        List<SanPham> list = cQuery.getResultList(); //tra va kieu list
        list.forEach((t) -> {
            System.out.println(t);
        });
        System.out.println("-----------------------");

        //truyen nameQuery da khai bao ben entity, co the them parameter
        Query retQuery = em.createNamedQuery("SanPham.findByTen");
        //them parameter
        retQuery.setParameter("ten", "%a%");
        //tra ve tat ca sanpham trong ten co chua chu 'a'
        List<SanPham> lista = retQuery.getResultList(); //tra va kieu list
        lista.forEach((t) -> {
            System.out.println(t);
        });

    }

    public static void persist(Object object) {

        em.getTransaction().begin();
        try {
            em.persist(object);
            //sau khi thuc hien thay doi database phai goi commit
            em.getTransaction().commit();
        } catch (Exception e) {
            //neu xay ra loi
            e.printStackTrace();
            //rollback, huy bo toan bo thao tac hien tai, quay ve trang thai truoc do
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

}
