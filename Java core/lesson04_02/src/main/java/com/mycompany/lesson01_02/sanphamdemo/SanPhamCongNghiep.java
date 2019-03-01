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
public class SanPhamCongNghiep extends SanPham{

    private  float giaXuatXuong;
    private final static int HE_SO = 10000;
    private int thoiGianBaoHanh;

    //contruction
    public SanPhamCongNghiep(float giaXuatXuong, int thoiGianBaoHanh) {
        this.giaXuatXuong = giaXuatXuong;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public SanPhamCongNghiep() {
    }
    
    //set and get

    public float getGiaXuatXuong() {
        return giaXuatXuong;
    }

    public void setGiaXuatXuong(float giaXuatXuong) {
        this.giaXuatXuong = giaXuatXuong;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    @Override
    public void inPut() {
        super.inPut(); 
        System.out.print("gia xuat xuong --> ");
        this.giaXuatXuong = new Scanner(System.in).nextFloat();
        System.out.print("thoi gian bao hanh (nam) --> ");
        this.thoiGianBaoHanh = new Scanner(System.in).nextInt();
    }
         
    
    @Override
    public float tinhGia() {
        return this.giaXuatXuong + this.thoiGianBaoHanh * HE_SO;
    }
    
}
