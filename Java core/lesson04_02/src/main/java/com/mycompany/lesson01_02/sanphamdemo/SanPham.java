/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lesson01_02.sanphamdemo;

import com.mycompany.lesson01_02.interfacedemo.ISanPham;
import java.util.Scanner;

/**
 *
 * @author doanxuanquyet
 */
public abstract class SanPham implements ISanPham{
    
    //ma sp tu dong tang
    private static int MA_HIEN_TAI = 0;
    private int ma;
    private String name;

    public SanPham(String name) {
        this.name = name;
        MA_HIEN_TAI++;
    }

    public SanPham() {
        this.ma = MA_HIEN_TAI;
        MA_HIEN_TAI++;
    }
    
    

    @Override
    public void inPut() {
        System.out.print("name --> ");
        this.name = new Scanner(System.in).nextLine();
    }

    @Override
    public void outPut() {
        System.out.println("san pham : " + this);
    }

    @Override
    public String toString() { 
        return this.ma + "\tname : " + this.name + "\tgia ban : " + this.tinhGia();
    }
    
    

    @Override
    public abstract float tinhGia();
    
}
