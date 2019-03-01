/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import model.NhanVien;
import model.Sex;

/**
 *
 * @author doanxuanquyet
 */
public class QuanLyNhanVien implements IQuanLyNhanVien {

    List<NhanVien> listNhanViens;

    //them nhan vien
    @Override
    public NhanVien addNhanVien(NhanVien nv) {
        listNhanViens.add(nv);
        return nv;
    }

    //hien thong tin nhan vien
    @Override
    public List<NhanVien> display() {
        return listNhanViens;
    }

    //tim nhan vien co thu nhap cao nhat theo gioi tinh
    
    //tim so thu nhap lon nhat max
    //tra ve danh sach cac phan tu co so thu nhap bang max va phu hop dieu kien
    @Override
    public List<NhanVien> searchNhanVienSex(Sex sex) {
        //tao comparator de sap xep
        Comparator<NhanVien> com = (NhanVien o1, NhanVien o2) -> o1.tinhThuNhap() > o2.tinhThuNhap() ? 1 : -1;
        float maxThuNhap = listNhanViens.stream()
                //filter de loc danh sach (nho 1 ham tra ve kieu boolen) tra ve danh sach da loc
                .filter((NhanVien nv) -> nv.getSex() == sex)
                //max tim so lon nhat truyen vao mot ham so sanh tra va phan tu co gia tri lon nhat theo chuoi so sanh
                .max(com)
                //map thuc hien ham truc tiep vao phan tu
                .map(NhanVien::tinhThuNhap).get(); //tra ve so thu nhap lon nhat max
        
        //loc danh sach voi so thu nhap == max
        return listNhanViens.stream().filter((t) -> {
            return t.getSex() == sex && t.tinhThuNhap() == maxThuNhap; //To change body of generated lambdas, choose Tools | Templates.
        })
                //chuyen stream da lioc thanh list
                .collect(Collectors.toList());
    }

    //tim nhan vien co thu nhap cao nhat theo chuc vu
    @Override
    public List<NhanVien> searchNhanVienViTri(Class<NhanVien> nv) {
        Comparator<NhanVien> com = (NhanVien o1, NhanVien o2) -> o1.tinhThuNhap() > o2.tinhThuNhap() ? 1 : -1;
        float maxThuNhap = listNhanViens.stream()
                .filter((t) -> t.getClass() == nv)
                .max(com).map(NhanVien::tinhThuNhap).get();
        return listNhanViens.stream().filter((t) -> {
            return t.getClass() == nv && t.tinhThuNhap() == maxThuNhap; //To change body of generated lambdas, choose Tools | Templates.
        })
                .collect(Collectors.toList());
    }

}
