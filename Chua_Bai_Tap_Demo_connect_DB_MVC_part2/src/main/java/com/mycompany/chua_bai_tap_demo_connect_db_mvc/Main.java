/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chua_bai_tap_demo_connect_db_mvc;

import java.util.Date;
import mvc.controller.dto.SinhVienDTO;
import mvc.controller.mapstruct.SinhVienMapper;
import mvc.entity.GioiTinh;
import mvc.entity.LopHoc;
import mvc.entity.SinhVien;

/**
 *
 * @author doanxuanquyet
 */
public class Main {
    
    public static void main(String[] args) {
        
        SinhVien sv = new SinhVien();
        sv.setMa(1);
        sv.setTen("doan xuan quyet");
        sv.setNgaySinh(new Date());
        LopHoc lopHoc = new LopHoc(22,"lop 1");
        sv.setLopHoc(lopHoc);
        sv.setGioiTinh(GioiTinh.NU);
        
        SinhVienDTO sinhVienDTO = SinhVienMapper.obj.toDTO(sv);
        
        System.out.println(sinhVienDTO);
        
    }
    
}
