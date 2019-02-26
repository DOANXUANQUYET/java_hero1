/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo_sanpham.dao.controller;

import com.mycompany.demo_sanpham.dao.controller.exceptions.NonexistentEntityException;
import com.mycompany.demo_sanpham.dao.controller.exceptions.PreexistingEntityException;
import com.mycompany.demo_sanpham.dao.controller.exceptions.RollbackFailureException;
import com.mycompany.demo_sanpham.dao.entity.SanPham;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.UserTransaction;

/**
 *
 * @author doanxuanquyet
 */
public class SanPhamJpaController implements Serializable {

    public SanPhamJpaController(UserTransaction utx, EntityManagerFactory emf) {
        this.utx = utx;
        this.emf = emf;
    }
    private UserTransaction utx = null;
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(SanPham sanPham) throws PreexistingEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            em.persist(sanPham);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            if (findSanPham(sanPham.getMa()) != null) {
                throw new PreexistingEntityException("SanPham " + sanPham + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(SanPham sanPham) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            sanPham = em.merge(sanPham);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = sanPham.getMa();
                if (findSanPham(id) == null) {
                    throw new NonexistentEntityException("The sanPham with id " + id + " no longer exists.");
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
            SanPham sanPham;
            try {
                sanPham = em.getReference(SanPham.class, id);
                sanPham.getMa();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The sanPham with id " + id + " no longer exists.", enfe);
            }
            em.remove(sanPham);
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

    public List<SanPham> findSanPhamEntities() {
        return findSanPhamEntities(true, -1, -1);
    }

    public List<SanPham> findSanPhamEntities(int maxResults, int firstResult) {
        return findSanPhamEntities(false, maxResults, firstResult);
    }

    private List<SanPham> findSanPhamEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(SanPham.class));
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

    public SanPham findSanPham(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(SanPham.class, id);
        } finally {
            em.close();
        }
    }

    public int getSanPhamCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<SanPham> rt = cq.from(SanPham.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
