/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test01.interfaces;

import com.mycompany.test01.nhanviendemo.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author doanxuanquyet
 */
public interface IquanLyNhanVien {

    //nhap danh  sach nhan vien
    void inPut(ArrayList<NhanVien> list);

    //xuat danh sach nhan vien
    void outPut(ArrayList<NhanVien> list);

    //tim nhan vien theo ma
    void searchNhanVienMa(ArrayList<NhanVien> list);

    //tim nhan vien theo gioi tinh
    void searchNhanVienGioiTinh(ArrayList<NhanVien> list);

    //tim nhan vien theo chuc vu
    void seachNhanVienChucVu(ArrayList<NhanVien> list);

    //tim nhan vien theo khoang thu nhap
    void seachNhanVienThuNhap(ArrayList<NhanVien> list);

    //sap xep nhan vien theo ten
    void sortName(ArrayList<NhanVien> list);

    //sap xep nhan vien theo thu nhap
    void sortThuNhap(ArrayList<NhanVien> list);

}
