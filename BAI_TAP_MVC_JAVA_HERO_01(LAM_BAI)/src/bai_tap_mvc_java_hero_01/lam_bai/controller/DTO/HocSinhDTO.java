/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_mvc_java_hero_01.lam_bai.controller.DTO;

/**
 *
 * @author doanxuanquyet
 */
public class HocSinhDTO {
        private int id;
    private String ten;
    private String ngaySinh;
    private String gioiTinh;
    private int idLop;

    public HocSinhDTO() {
    }

    public HocSinhDTO(int id, String ten, String ngaySinh, String gioiTinh, int idLop) {
        this.id = id;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.idLop = idLop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getIdLop() {
        return idLop;
    }

    public void setIdLop(int idLop) {
        this.idLop = idLop;
    }
    
}
