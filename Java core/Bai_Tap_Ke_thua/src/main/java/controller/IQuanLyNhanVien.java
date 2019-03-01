/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.NhanVien;
import model.Sex;

/**
 *
 * @author doanxuanquyet
 */
public interface IQuanLyNhanVien{
    NhanVien addNhanVien (NhanVien nv);
    List<NhanVien> display();
    List<NhanVien> searchNhanVienSex(Sex sex);
    List<NhanVien> searchNhanVienViTri(Class<NhanVien> nv);
}
