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
public class CongNhan extends NhanVien{
    
    private int soNgayCong;
    private int heSo;

    
    //contruction
    public CongNhan(int soNgayCong, int heSo) {
        this.soNgayCong = soNgayCong;
        this.heSo = heSo;
    }

    public CongNhan() {
    }
    
    //get and set

    public int getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
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
        System.out.print("so ngay cong --> ");
        this.soNgayCong = new Scanner(System.in).nextInt();
        System.out.print("so he so --> ");
        this.heSo = new Scanner(System.in).nextInt();
    }

    @Override
    public double tinhThuNhap() {
        return this.luong + this.soNgayCong * this.heSo;
    }
    
}
