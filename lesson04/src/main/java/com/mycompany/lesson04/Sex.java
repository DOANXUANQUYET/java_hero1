/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lesson04;

import java.util.Scanner;

/**
 *
 * @author doanxuanquyet
 */
public enum Sex {
    NAM(1, "nam"), NU(0, "nu"), KXD(-1, "khong xac dinh");

    private int mode;
    private String status;

    private Sex(int mode, String status) {
        this.mode = mode;
        this.status = status;
    }

    public int getMode() {
        return mode;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static Sex inputSex() {
        System.out.print("nhap Sex [nam :1] [nu:0] -->\t");
        int mode = new Scanner(System.in).nextInt();
        switch (mode) {
            case 1:
                return NAM;
            case 0:
                return NU;
            default:
                return KXD;
        }
    }

}
