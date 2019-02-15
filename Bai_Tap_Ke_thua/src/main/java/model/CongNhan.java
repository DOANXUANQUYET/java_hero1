/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;

/**
 *
 * @author doanxuanquyet
 */
public class CongNhan extends NhanVien {

    private int ngayCong;

    //create contructor
    public CongNhan() {
    }

    public CongNhan(int ngayCong) {
        this.ngayCong = ngayCong;
    }

    //get and set
    public int getNgayCong() {
        return ngayCong;
    }

    public void setNgayCong(int ngayCong) {
        this.ngayCong = ngayCong;
    }

    @Override
    public void inPut() {
        super.inPut();
        System.out.print("so ngay cong -->\t");
        this.ngayCong = new Scanner(System.in).nextInt();
    }

    @Override
    public float tinhThuNhap() {
        return this.getLuong() * (float) (this.ngayCong / 26);
    }

}
