/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test01.quanlynhaviendemo;

import com.mycompany.test01.nhanviendemo.NhanVien;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author doanxuanquyet
 */
public class Menu {

    public final static void menu(ArrayList<NhanVien> list) {

        QuanLyNhanVien ql = new QuanLyNhanVien();
        //bien de thoat khoi menu va chon che do xu li
        boolean run = true;
        int mode;

        while (run) {
            System.out.println("----------nhap che do:---------");
            System.out.println("[1 : nhap danh sach] [2 : xuat danh sach] [3 : tim nhan vien theo ma] [4 : tim nhan vien theo gioi tinh]");
            System.out.println("[5 : tim nhan vien theo khoang luong][6 : tim nhan vien theo chuc vu] [7: sap xep theo ten]");
            System.out.print("[8 : sap xep theo thu nhap] [9 : thoat] ----> ");
            System.out.println("");
            mode = new Scanner(System.in).nextInt();

            switch (mode) {
                case 1:
                    //nhap danh sach
                    ql.inPut(list);
                    break;
                case 2:
                    //xuat danh sach
                    if (list.isEmpty()) {
                        System.out.println("khong co du lieu , xin chon nhap du lieu");
                    } else {
                        ql.outPut(list);

                    }
                    break;
                case 3:
                    //tim nhan vien theo ma
                    if (list.isEmpty()) {
                        System.out.println("khong co du lieu , xin chon nhap du lieu");
                    } else {
                        ql.searchNhanVienMa(list);
                    }
                    break;
                case 4:
                    //tim nhan vien theo gioi tinh
                    if (list.isEmpty()) {
                        System.out.println("khong co du lieu , xin chon nhap du lieu");
                    } else {
                        ql.searchNhanVienGioiTinh(list);
                    }
                    break;
                case 5:
                    //tim nhan vien theo khoang thu nhap
                    if (list.isEmpty()) {
                        System.out.println("khong co du lieu , xin chon nhap du lieu");
                    } else {
                        ql.seachNhanVienThuNhap(list);
                    }
                    break;
                case 6:
                    //tim nhan vien theo chuc vu
                    if (list.isEmpty()) {
                        System.out.println("khong co du lieu , xin chon nhap du lieu");
                    } else {
                        ql.seachNhanVienChucVu(list);
                    }
                    break;
                case 7:
                    //sap xep theo ten
                    if (list.isEmpty()) {
                        System.out.println("khong co du lieu , xin chon nhap du lieu");
                    } else {
                        ql.sortName(list);
                        ql.outPut(list);
                    }
                    break;
                case 8:
                    //sap xep theo thu  nhap
                    if (list.isEmpty()) {
                        System.out.println("khong co du lieu , xin chon nhap du lieu");
                    } else {
                        ql.sortThuNhap(list);
                        ql.outPut(list);
                    }
                    break;
                case 9:
                    //che do thoat
                    run = false;
                    break;
                default:
                    System.out.println("nhap che do khong dung, xin nhap lai!");
            }
        }

    }

}
