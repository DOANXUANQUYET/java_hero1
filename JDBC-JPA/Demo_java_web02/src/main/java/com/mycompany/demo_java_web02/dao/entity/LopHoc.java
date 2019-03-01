/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo_java_web02.dao.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author doanxuanquyet
 */
@Entity
@Table(name = "LopHoc")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LopHoc.findAll", query = "SELECT l FROM LopHoc l")
    , @NamedQuery(name = "LopHoc.findByMa", query = "SELECT l FROM LopHoc l WHERE l.ma = :ma")
    , @NamedQuery(name = "LopHoc.findByTen", query = "SELECT l FROM LopHoc l WHERE l.ten = :ten")})
@Data @NoArgsConstructor @AllArgsConstructor
public class LopHoc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ma")
    private Integer ma;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ten")
    private String ten;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maLop")
    private Collection<SinhVien> sinhVienCollection;
    
}
