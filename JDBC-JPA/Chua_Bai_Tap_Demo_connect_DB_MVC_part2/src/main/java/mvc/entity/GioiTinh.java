/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.entity;

/**
 *
 * @author doanxuanquyet
 */
public enum GioiTinh {

    //true = NAM  false = NU
    NAM(true, "nam"), NU(false, "nu");

    private boolean thuocTinh;
    private String moTa;

    private GioiTinh(boolean thuocTinh, String moTa) {
        this.thuocTinh = thuocTinh;
        this.moTa = moTa;
    }

    public boolean isThuocTinh() {
        return thuocTinh;
    }

    public void setThuocTinh(boolean thuocTinh) {
        this.thuocTinh = thuocTinh;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public static GioiTinh setGioiTinh(boolean e) {
        if (e) {
            return NAM;
        } else {
            return NU;
        }
    }

}
