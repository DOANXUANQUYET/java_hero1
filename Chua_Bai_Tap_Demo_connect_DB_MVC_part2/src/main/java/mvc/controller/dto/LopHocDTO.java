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
public class LopHocDTO {

    private int ma;
    private String ten;

    public LopHocDTO() {
    }

    public LopHocDTO(int ma, String ten) {
        this.ma = ma;
        this.ten = ten;
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

    @Override
    public String toString() {
        return "LopHocDTO{" + "ma=" + ma + ", ten=" + ten + '}';
    }

    
}
