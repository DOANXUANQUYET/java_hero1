/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.controller.dto;

/**
 *
 * @author doanxuanquyet
 */
public class SinhVienDTO {
    
    private int ma;
    private String ten;
    private String ngaySinh;
    private String  gioiTinh;
    private LopHocDTO lopHoc;

    public SinhVienDTO() {
    }

    public SinhVienDTO(int ma, String ten, String ngaySinh, String gioiTinh, LopHocDTO lopHoc) {
        this.ma = ma;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.lopHoc = lopHoc;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
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

    public String isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public LopHocDTO getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(LopHocDTO lopHoc) {
        this.lopHoc = lopHoc;
    }
    
    
    
    
    
}
