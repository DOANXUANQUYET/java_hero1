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
public class SanPhamNongNghiep extends SanPham{

    private float giaBanHienTai;
    private  int hanSuDung;
    private  final static int HE_SO = 500;
    
    //contruction
    
    public SanPhamNongNghiep(float giaBanHienTai, int hanSuDung) {
        this.giaBanHienTai = giaBanHienTai;
        this.hanSuDung = hanSuDung;
    }

    public SanPhamNongNghiep() {
    }
    
    //set and get

    public float getGiaBanHienTai() {
        return giaBanHienTai;
    }

    public void setGiaBanHienTai(float giaBanHienTai) {
        this.giaBanHienTai = giaBanHienTai;
    }

    public int getHanSuDung() {
        return hanSuDung;
    }

    public void setHanSuDung(int hanSuDung) {
        this.hanSuDung = hanSuDung;
    }

    @Override
    public void inPut() {
        super.inPut();
        System.out.print("gia hien tai -->");
        this.giaBanHienTai = new Scanner(System.in).nextInt();
        System.out.print("han su dung (nam) -->");
        this.hanSuDung = new Scanner(System.in).nextInt();
    }
    
    

    @Override
    public float tinhGia() {
        return this.giaBanHienTai + this.hanSuDung * HE_SO;
    }
    
}
