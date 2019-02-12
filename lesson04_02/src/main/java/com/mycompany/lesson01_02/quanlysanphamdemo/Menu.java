/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lesson01_02.quanlysanphamdemo;

import com.mycompany.lesson01_02.sanphamdemo.SanPham;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author doanxuanquyet
 */
public class Menu{

    public static void menu(ArrayList<SanPham> list) {

        //bien chon che do nhap va che do thoat
        QuanLySanPham ql = new QuanLySanPham();
        boolean run = true;
        int mode;

        while (run) {
            System.out.println("");
            System.out.println("--------chon che do------");
            System.out.print("[1: nhap] [2: hien thi] [3: tim san pham dat nhat] [4: thoat] --> ");
            mode = new Scanner(System.in).nextInt();

            switch (mode) {
                case 1:
                    ql.inPut(list);
                    break;
                case 2:
                    if (list.isEmpty()) {
                        System.out.println("khong co du lieu, xin chon nhap du lieu");
                    } else {
                        ql.outPut(list);
                    }
                    break;
                case 3:
                    if (list.isEmpty()) {
                        System.out.println("khong co du lieu, xin chon nhap du lieu");
                    } else {
                        ql.searchMax(list);
                    }
                    break;
                case 4:
                    run = false;
                    break;
                default:
                    System.out.println("che do nhap khong dung, xin nhap lai");
            }
        }
    }
}
