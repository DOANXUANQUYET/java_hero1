/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;

/**
 *
 * @author doanxuanquyet
 */
public class NhanVienVanPhong extends NhanVien {

    private float heSo;

    //create contructor
    public NhanVienVanPhong() {
    }

    public NhanVienVanPhong(float heSo) {
        this.heSo = heSo;
    }

    public NhanVienVanPhong(float heSo, String name, Sex sex, float luong) {
        super(name, sex, luong);
        this.heSo = heSo;
    }

    //set and get
    public float getHeSo() {
        return heSo;
    }

    public void setHeSo(float heSo) {
        this.heSo = heSo;
    }

    @Override
    public void inPut() {
        super.inPut();
        System.out.print("nhap he so -->\t");
        this.heSo = new Scanner(System.in).nextFloat();
    }

    @Override
    public float tinhThuNhap() {
        return this.getLuong() + this.heSo;
    }

}
