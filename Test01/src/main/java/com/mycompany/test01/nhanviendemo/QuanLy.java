/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test01.nhanviendemo;

import java.util.Scanner;

/**
 *
 * @author doanxuanquyet
 */
public class QuanLy extends NhanVien{
    
    private int soNhanVien;
    private int heSo;
    
    //create construction

    public QuanLy(int soNhanVien, int heSo) {
        this.soNhanVien = soNhanVien;
        this.heSo = heSo;
    }

    public QuanLy() {
    }
    
    //set and get

    public int getSoNhanVien() {
        return soNhanVien;
    }

    public void setSoNhanVien(int soNhanVien) {
        this.soNhanVien = soNhanVien;
    }

    public int getHeSo() {
        return heSo;
    }

    public void setHeSo(int heSo) {
        this.heSo = heSo;
    }
    

    @Override
    public void inPut() {
        super.inPut();
        System.out.print("so nhan vien --> ");
        this.soNhanVien = new Scanner(System.in).nextInt();
        System.out.print("he so --> ");
        this.heSo = new Scanner(System.in).nextInt();
    }

    @Override
    public double tinhThuNhap() {
        return this.luong + this.soNhanVien * this.heSo;
    }
    
}
