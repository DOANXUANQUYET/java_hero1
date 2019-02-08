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
public class GiamDoc extends NhanVien {

    private double doanhSo;

    //create construction
    public GiamDoc(int luong, int doanhSo) {
        this.doanhSo = doanhSo;
    }

    public GiamDoc() {
    }

    //set and get

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    @Override
    public void inPut() {
        super.inPut();
        System.out.print("doanh so --> ");
        this.doanhSo = new Scanner(System.in).nextDouble();
    }

    @Override
    public double tinhThuNhap() {
        return this.luong + this.doanhSo;
    }

}
