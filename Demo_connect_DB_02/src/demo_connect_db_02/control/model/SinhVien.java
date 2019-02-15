/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_connect_db_02.control.model;

import java.sql.Date;

/**
 *
 * @author doanxuanquyet
 */
public class SinhVien {
    
    private int ma;
    private String name;
    private  Date ngaysinh;

    public SinhVien() {
    }

    public SinhVien(int ma, String name, Date ngaysinh) {
        this.ma = ma;
        this.name = name;
        this.ngaysinh = ngaysinh;
    }
    
    
    

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    
    
}
