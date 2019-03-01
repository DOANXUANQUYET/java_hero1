/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test01.quanlynhaviendemo;

import com.mycompany.test01.interfaces.IquanLyNhanVien;
import com.mycompany.test01.nhanviendemo.CongNhan;
import com.mycompany.test01.nhanviendemo.GiamDoc;
import com.mycompany.test01.nhanviendemo.GioiTinh;
import com.mycompany.test01.nhanviendemo.NhanVien;
import com.mycompany.test01.nhanviendemo.QuanLy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author doanxuanquyet
 */
public class QuanLyNhanVien implements IquanLyNhanVien {

    private final static int GIAM_DOC = 1;
    private final static int QUAN_LY = 2;
    private final static int CONG_NHAN = 3;

    //nhap danh sach nhan vien
    @Override
    public void inPut(ArrayList<NhanVien> list) {
        while (true) {
            NhanVien nv = chonNhanVien();
            nv.inPut();
            list.add(nv);
            System.out.print("continue ? --(yes/no)--> ");
            String check = new Scanner(System.in).next();
            if (check.equals("no")) {
                break;
            }
        }
    }

    //hien thi danh sach nhan vien
    @Override
    public void outPut(ArrayList<NhanVien> list) {
        list.forEach((nv) -> {
            nv.outPut();
        });
    }

    //tim nhan vien theo ma
    @Override
    public void searchNhanVienMa(ArrayList<NhanVien> list) {
        System.out.print("nhap ma nhan vien --> ");
        int maSearch = new Scanner(System.in).nextInt();
        list.forEach((nv) -> {
            if (nv.getMa() == maSearch) {
                nv.outPut();
            }
        });
    }

    //tim nhan vien theo gioi tinh
    @Override
    public void searchNhanVienGioiTinh(ArrayList<NhanVien> list) {
        GioiTinh sex = GioiTinh.setGioiTinh();
        list.forEach((nv) -> {
            if (nv.getGioitinh().equals(sex)) {
                nv.outPut();
            }
        });
    }

    //tim nhan vien theo chuc vu
    @Override
    public void seachNhanVienChucVu(ArrayList<NhanVien> list) {
        NhanVien nvsearch = chonNhanVien();
        list.forEach((nv) -> {
            if (nv.equals(nvsearch)) {
                nv.outPut();
            }
        });
    }

    //tim nhan vien theo khoang thu nhap
    @Override
    public void seachNhanVienThuNhap(ArrayList<NhanVien> list) {
        System.out.println("nhap khoang thu nhap muon tim kiem :");
        System.out.print("from --> ");
        double from = new Scanner(System.in).nextDouble();
        System.out.print("to --> ");
        double to = new Scanner(System.in).nextDouble();
        list.forEach((nv) -> {
            if (nv.tinhThuNhap() > from && nv.tinhThuNhap() <= to) {
                nv.outPut();
            }
        });
    }

    //sap xep danh danh sach nhan vien theo ten
    @Override
    public void sortName(ArrayList<NhanVien> list) {
        Comparator<NhanVien> com = (NhanVien o1, NhanVien o2) -> o1.getName().compareTo(o2.getName());
        Collections.sort(list, com);
    }

    //sap xep danh sach nhan vien theo thu nhap
    @Override
    public void sortThuNhap(ArrayList<NhanVien> list) {
        Comparator<NhanVien> com = (NhanVien o1, NhanVien o2) -> o1.tinhThuNhap() < o2.tinhThuNhap() ? 1 : -1;
        Collections.sort(list, com);
    }

    //ham chon loai nhan vien de khoi tao
    private NhanVien chonNhanVien() {
        while (true) {
            System.out.print("chon loai nhan vien [1:Giam Doc] [2:Quan ly] [3:Cong nhan] --> ");
            int value = new Scanner(System.in).nextInt();
            switch (value) {
                case GIAM_DOC:
                    return new GiamDoc();

                case QUAN_LY:
                    return new QuanLy();

                case CONG_NHAN:
                    return new CongNhan();
                default:
                    System.out.println("Nhap sai du lieu vui long nhap lai");
            }
        }
    }

}
