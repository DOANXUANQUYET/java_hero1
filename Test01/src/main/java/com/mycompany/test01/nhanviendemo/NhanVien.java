/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test01.nhanviendemo;

import com.mycompany.test01.interfaces.InhanVien;
import java.util.Scanner;

/**
 *
 * @author doanxuanquyet
 */
public abstract class NhanVien implements InhanVien {

    //ma nhan vien tu dong tang
    private static int MA_HIEN_TAI = 0;
    private int ma;
    private String name;
    private GioiTinh gioitinh;
    double luong;

    //create contruction
    public NhanVien(String name, GioiTinh gioitinh, double luong) {
        this.ma = MA_HIEN_TAI;
        MA_HIEN_TAI++;
        this.name = name;
        this.gioitinh = gioitinh;
        this.luong = luong;
    }

    public NhanVien() {
        //ma nhan vien tu dong tang
        this.ma = MA_HIEN_TAI;
        MA_HIEN_TAI++;
    }

    //get and set
    public int getMa() {
        return ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GioiTinh getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(GioiTinh gioitinh) {
        this.gioitinh = gioitinh;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    //can phai viet them cho tung loai nhan vien
    @Override
    public void inPut() {
            System.out.print("name --> ");
            this.name = new Scanner(System.in).nextLine();
            this.gioitinh = GioiTinh.setGioiTinh();
            System.out.print("luong --> ");
            this.luong = new Scanner(System.in).nextDouble();
    }

    @Override
    public void outPut() {
        System.out.println("nhan vien : " + this);
    }

    @Override
    public String toString() {
        return this.ma + "\tname : " + this.name + "\tgioi tinh : " + this.gioitinh.getMota() + "\tthu nhap : " + this.tinhThuNhap();
    }

    @Override
    public abstract double tinhThuNhap();


}
