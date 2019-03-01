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
public class QuanLy extends NhanVien {

    private int soNhanVien;
    private float phuCap;

    //create contructor
    public QuanLy() {
    }

    public QuanLy(int soNhanVien, float phuCap) {
        this.soNhanVien = soNhanVien;
        this.phuCap = phuCap;
    }

    public QuanLy(int soNhanVien, float phuCap, String name, Sex sex, float luong) {
        super(name, sex, luong);
        this.soNhanVien = soNhanVien;
        this.phuCap = phuCap;
    }

    //get and set
    public int getSoNhanVien() {
        return soNhanVien;
    }

    public void setSoNhanVien(int soNhanVien) {
        this.soNhanVien = soNhanVien;
    }

    public float getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(float phuCap) {
        this.phuCap = phuCap;
    }

    @Override
    public void inPut() {
        super.inPut();
        System.out.print("so nhan vien -->\t");
        this.soNhanVien = new Scanner(System.in).nextInt();
        setPhuCap();

    }

    @Override
    public float tinhThuNhap() {
        return this.getLuong() + this.phuCap;
    }

    //tinh phu cap theo so luong nhan vien quan li
    private void setPhuCap() {
        if (this.soNhanVien < 10) {
            this.phuCap = 500;
        } else if (this.soNhanVien <= 20) {
            this.phuCap = 1000;
        } else {
            this.phuCap = 2000;
        }
    }

}
