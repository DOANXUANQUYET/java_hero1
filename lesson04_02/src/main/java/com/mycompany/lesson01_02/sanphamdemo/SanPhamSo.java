/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lesson01_02.sanphamdemo;

import java.util.Scanner;

/**
 *
 * @author doanxuanquyet
 */
public class SanPhamSo extends SanPham {

    private int dungLuong;
    private final static int HE_SO = 10000;

    //contruction
    public SanPhamSo(int dungLuong) {
        this.dungLuong = dungLuong;
    }

    public SanPhamSo() {
    }

    //set and get
    public int getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(int dungLuong) {
        this.dungLuong = dungLuong;
    }

    @Override
    public void inPut() {
        super.inPut();
        System.out.print("dungluong --> ");
        this.dungLuong = new Scanner(System.in).nextInt();
    }

    @Override
    public float tinhGia() {
        return this.dungLuong * HE_SO;
    }

}
