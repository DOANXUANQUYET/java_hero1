/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo_jpa;

import com.mycompany.demo_jpa.exceptions.NonexistentEntityException;
import com.mycompany.demo_jpa.exceptions.PreexistingEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author doanxuanquyet
 */
public class SanPhamJpaController implements Serializable {

    public SanPhamJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(SanPham sanPham) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(sanPham);
            em.getTransaction().commit();
        } catch (Exception ex) {
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

    public void edit(SanPham sanPham) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            sanPham = em.merge(sanPham);
            em.getTransaction().commit();
        } catch (Exception ex) {
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

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            SanPham sanPham;
            try {
                sanPham = em.getReference(SanPham.class, id);
                sanPham.getMa();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The sanPham with id " + id + " no longer exists.", enfe);
            }
            em.remove(sanPham);
            em.getTransaction().commit();
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
