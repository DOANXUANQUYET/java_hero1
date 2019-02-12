/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lesson01_02.quanlysanphamdemo;

import com.mycompany.lesson01_02.interfacedemo.IQuanLySanPham;
import com.mycompany.lesson01_02.sanphamdemo.SanPham;
import com.mycompany.lesson01_02.sanphamdemo.SanPhamCongNghiep;
import com.mycompany.lesson01_02.sanphamdemo.SanPhamNongNghiep;
import com.mycompany.lesson01_02.sanphamdemo.SanPhamSo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author doanxuanquyet
 */
public class QuanLySanPham implements IQuanLySanPham {

    private final static int SAN_PHAM_SO = 1;
    private final static int SAN_PHAM_CONG_NGHIEP = 2;
    private final static int SAN_PHAM_NONG_NGHIEP = 3;

    @Override
    public void inPut(ArrayList<SanPham> list) {
        while (true) {
            SanPham sp = chonSanPham();
            sp.inPut();
            list.add(sp);
            System.out.println("continue ? --(yes/no)--> ");
            String ret = new Scanner(System.in).nextLine();
            if (ret.equals("no")) {
                break;
            }
        }
    }

    @Override
    public void outPut(ArrayList<SanPham> list) {
        list.forEach((sp) ->{
            sp.outPut();
        });
    }

    @Override
    public void searchMax(ArrayList<SanPham> list) {
        Comparator<SanPham> com = (SanPham o1, SanPham o2) -> o1.tinhGia() > o2.tinhGia()? 1: -1;
        SanPham sp = Collections.max(list,com);
        sp.outPut();
    }

    private SanPham chonSanPham() {
        while (true) {
            System.out.print("chon loai san pham [1 : san pham so] [2 : san pham cong nghiep] [3 : san pham cong nghiep] --> ");
            int mode = new Scanner(System.in).nextInt();
            switch (mode) {
                case SAN_PHAM_SO:
                    return new SanPhamSo();
                case SAN_PHAM_CONG_NGHIEP:
                    return new SanPhamCongNghiep();
                case SAN_PHAM_NONG_NGHIEP:
                    return new SanPhamNongNghiep();
                default:
                    System.out.println("nhap khong dung du lieu, vui long nhap lai");
            }
        }
    }

}
