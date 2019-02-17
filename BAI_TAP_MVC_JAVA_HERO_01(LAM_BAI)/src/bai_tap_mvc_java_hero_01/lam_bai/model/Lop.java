/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_mvc_java_hero_01.lam_bai.model;

/**
 *
 * @author doanxuanquyet
 */
public class Lop {
    
    private int idLop;
    private String tenLop;

    public Lop() {
    }

    public Lop(int idLop, String tenLop) {
        this.idLop = idLop;
        this.tenLop = tenLop;
    }

    public int getIdLop() {
        return idLop;
    }

    public void setIdLop(int idLop) {
        this.idLop = idLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }
    
    
    
}
