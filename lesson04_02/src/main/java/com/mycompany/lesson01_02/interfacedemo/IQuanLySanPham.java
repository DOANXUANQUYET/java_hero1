/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lesson01_02.interfacedemo;

import com.mycompany.lesson01_02.sanphamdemo.SanPham;
import java.util.ArrayList;

/**
 *
 * @author doanxuanquyet
 */
public interface IQuanLySanPham {
    //nhap danh sach san pham
    void inPut(ArrayList<SanPham> list);
    
    //hien thi danh sach san pham
    void outPut(ArrayList<SanPham> list);
    
    //tim san pham co gia lon nhat
    void searchMax(ArrayList<SanPham> list);
}
