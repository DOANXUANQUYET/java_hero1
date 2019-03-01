/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.entity;

import java.util.List;

/**
 *
 * @author doanxuanquyet
 */
public class LopHoc {

    private int ma;
    private String ten;

    //can phai co them list sinh vien de xem class co nhung sinh vien nao
    private List<SinhVien> sinhViens;

    public LopHoc() {

    }

    public LopHoc(int ma) {
        this.ma = ma;
    }

    public LopHoc(int ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "LopHoc{" + "ma=" + ma + ", ten=" + ten + ", sinhViens=" + sinhViens + '}';
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

    public List<SinhVien> getSinhViens() {
        return sinhViens;
    }

    public void setSinhViens(List<SinhVien> sinhViens) {
        this.sinhViens = sinhViens;
    }

}
