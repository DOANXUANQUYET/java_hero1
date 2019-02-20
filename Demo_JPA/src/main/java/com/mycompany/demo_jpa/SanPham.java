/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo_jpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 *
 * @author doanxuanquyet
 */

//khai bao day la 1 entity(Ten mac dinh giong voi ten bang trong database)
//co the thay doi ten bang cach @Entity(name = "ten_entity") khi do ten entyti va ten bang se thay doi
@Entity

//khai bao day la mot bang thuoc database
//khi ten entity khac ten bang co the khai bao them @Table(name = "ten_bang");
//khi thay doi xong ten Tabke se thay doi con ten entity thi van giu nguyen
@Table(catalog = "java_hero", schema = "")
@XmlRootElement

//khai bao mot so cau lenh JPAQuery, de thao tac giong cau lenh sql. co the truyen vao parameter (:parameter)
@NamedQueries({
    @NamedQuery(name = "SanPham.findAll", query = "SELECT s FROM SanPham s")
    , @NamedQuery(name = "SanPham.findByMa", query = "SELECT s FROM SanPham s WHERE s.ma = :ma")
    , @NamedQuery(name = "SanPham.findByTen", query = "SELECT s FROM SanPham s WHERE s.ten LIKE :ten")
    , @NamedQuery(name = "SanPham.findByGia", query = "SELECT s FROM SanPham s WHERE s.gia = :gia")})
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class SanPham implements Serializable {

    private static final long serialVersionUID = 1L;
    //@Id khai bao khoa chinh(primary key) trong 1 entity nhat dinh phai co 1 id, neu khong se bi error
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer ma;
    
    //khai bao truong tuong ung voi column tren database
    //mac dinh ten giong voi ten column, ci the thay doi @Column(name = "ten_bien");
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String ten;
    
    @Basic(optional = false)
    @Column(nullable = false)
    private double gia;

//    public SanPham() {
//    }
//
//    public SanPham(Integer ma) {
//        this.ma = ma;
//    }
//
//    public SanPham(Integer ma, String ten, double gia) {
//        this.ma = ma;
//        this.ten = ten;
//        this.gia = gia;
//    }
//
//    public Integer getMa() {
//        return ma;
//    }
//
//    public void setMa(Integer ma) {
//        this.ma = ma;
//    }
//
//    public String getTen() {
//        return ten;
//    }
//
//    public void setTen(String ten) {
//        this.ten = ten;
//    }
//
//    public double getGia() {
//        return gia;
//    }
//
//    public void setGia(double gia) {
//        this.gia = gia;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (ma != null ? ma.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof SanPham)) {
//            return false;
//        }
//        SanPham other = (SanPham) object;
//        return !((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma)));
//    }
//
//    @Override
//    public String toString() {
//        return "SanPham{" + "ma=" + ma + ", ten=" + ten + ", gia=" + gia + '}';
//    }

    
    
}
