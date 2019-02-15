/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;

/**
 *
 * @author doanxuanquyet
 */
public enum Sex {

    NAM(1, "nam"), NU(0, "nu"), KXD(-1, "khong xac dinh");

    private int thuocTinh;
    private String mieuTa;

    private Sex() {
    }

    private Sex(int thuocTinh, String mieuTa) {
        this.thuocTinh = thuocTinh;
        this.mieuTa = mieuTa;
    }

    public int getThuocTinh() {
        return thuocTinh;
    }

    public void setThuocTinh(int thuocTinh) {
        this.thuocTinh = thuocTinh;
    }

    public String getMieuTa() {
        return mieuTa;
    }

    public void setMieuTa(String mieuTa) {
        this.mieuTa = mieuTa;
    }

    public static Sex setSex() {
        System.out.print("chon gioi tinh [1:nam] [0:nu] [-1:KXD]-->\t");
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
