/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lesson03;

import java.util.Scanner;

/**
 *
 * @author doanxuanquyet
 */
enum Sex {
    NAM(1, "nam"), NU(0, "nu"), KHONG_XAC_DINH(-1, "less");

    private int ma;
    private String mota;

    private Sex(int ma, String mota) {
        this.ma = ma;
        this.mota = mota;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    //lay thong tin gioi tinh
    public static String getSex(Sex sex) {
        String sexName;
        switch (sex) {
            case NAM:
                return NAM.getMota();
            case NU:
                return NU.getMota();
            default:
                return KHONG_XAC_DINH.getMota();
        }
    }

    // nhap gioi tinh nam : 1 , nu : 2 , less : 0
    public static Sex inPut() {
        System.out.println("Sex [nam : 1, nu : 0, less : -1] -->\t");
        switch (new Scanner(System.in).nextInt()) {
            case 1:
                return Sex.NAM;
            case 0:
                return Sex.NU;
            default:
                return Sex.KHONG_XAC_DINH;
        }
    }
}
