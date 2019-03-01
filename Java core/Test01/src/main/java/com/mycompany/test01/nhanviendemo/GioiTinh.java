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
public enum GioiTinh {
    NAM(1, "nam"), NU(0, "nu"), KXD(-1, "khong xac dinh");

    private int code;
    private String mota;

    private GioiTinh(int code, String mota) {
        this.code = code;
        this.mota = mota;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    //xet gioi tinh
    public static GioiTinh setGioiTinh() {
            
        System.out.print("chon gioi tinh [1:nam] [0:nu] --> ");
        int value = new Scanner(System.in).nextInt();
        switch (value) {
            case 1:
                return NAM;
            case 0:
                return NU;
            default:
                return KXD;
        }
    }
}
