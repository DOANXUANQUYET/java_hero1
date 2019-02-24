/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo_java_web02.dao.controller;

import com.mycompany.demo_java_web02.dao.controller.exceptions.NonexistentEntityException;
import com.mycompany.demo_java_web02.dao.controller.exceptions.RollbackFailureException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.demo_java_web02.dao.entity.LopHoc;
import com.mycompany.demo_java_web02.dao.entity.SinhVien;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.transaction.UserTransaction;

/**
 *
 * @author doanxuanquyet
 */
public class SinhVienJpaController implements Serializable {

    public SinhVienJpaController(UserTransaction utx, EntityManagerFactory emf) {
        this.utx = utx;
        this.emf = emf;
    }
    private UserTransaction utx = null;
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(SinhVien sinhVien) throws RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            LopHoc maLop = sinhVien.getMaLop();
            if (maLop != null) {
                maLop = em.getReference(maLop.getClass(), maLop.getMa());
                sinhVien.setMaLop(maLop);
            }
            em.persist(sinhVien);
            if (maLop != null) {
                maLop.getSinhVienCollection().add(sinhVien);
                maLop = em.merge(maLop);
            }
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(SinhVien sinhVien) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            SinhVien persistentSinhVien = em.find(SinhVien.class, sinhVien.getMa());
            LopHoc maLopOld = persistentSinhVien.getMaLop();
            LopHoc maLopNew = sinhVien.getMaLop();
            if (maLopNew != null) {
                maLopNew = em.getReference(maLopNew.getClass(), maLopNew.getMa());
                sinhVien.setMaLop(maLopNew);
            }
            sinhVien = em.merge(sinhVien);
            if (maLopOld != null && !maLopOld.equals(maLopNew)) {
                maLopOld.getSinhVienCollection().remove(sinhVien);
                maLopOld = em.merge(maLopOld);
            }
            if (maLopNew != null && !maLopNew.equals(maLopOld)) {
                maLopNew.getSinhVienCollection().add(sinhVien);
                maLopNew = em.merge(maLopNew);
            }
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = sinhVien.getMa();
                if (findSinhVien(id) == null) {
                    throw new NonexistentEntityException("The sinhVien with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            SinhVien sinhVien;
            try {
                sinhVien = em.getReference(SinhVien.class, id);
                sinhVien.getMa();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The sinhVien with id " + id + " no longer exists.", enfe);
            }
            LopHoc maLop = sinhVien.getMaLop();
            if (maLop != null) {
                maLop.getSinhVienCollection().remove(sinhVien);
                maLop = em.merge(maLop);
            }
            em.remove(sinhVien);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<SinhVien> findSinhVienEntities() {
        return findSinhVienEntities(true, -1, -1);
    }

    public List<SinhVien> findSinhVienEntities(int maxResults, int firstResult) {
        return findSinhVienEntities(false, maxResults, firstResult);
    }

    private List<SinhVien> findSinhVienEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(SinhVien.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public SinhVien findSinhVien(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(SinhVien.class, id);
        } finally {
            em.close();
        }
    }

    public int getSinhVienCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<SinhVien> rt = cq.from(SinhVien.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
