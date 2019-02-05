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
    NAM, NU, KHONG_XAC_DINH;

    //lay thong tin gioi tinh
    public static String getSex(Sex sex) {
        String sexName;
        switch (sex) {
            case NAM:
                sexName = "nam";
                break;
            case NU:
                sexName = "nu";
                break;
            default:
                sexName = "khong xac dinh";
        }

        return sexName;
    }

    // nhap gioi tinh nam : 1 , nu : 2 , less : 0
    public static Sex inPut() {
        System.out.println("Sex [nam : 1, nu : 0, less : 2] -->\t");
        switch (new Scanner(System.in).nextInt()) {
            case 1:
                return Sex.NAM;
            case 2:
                return Sex.NU;
            default:
                return Sex.KHONG_XAC_DINH;
        }
    }
}
