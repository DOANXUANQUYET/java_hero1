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
public abstract class NhanVien implements INhanVIen{

    public static int MA_HIEN_TAI = 0;

    private int ma;
    private String name;
    private Sex sex;
    private float luong;

    //create contructor
    public NhanVien() {
        //xu ly ma tu tang
        this.ma = MA_HIEN_TAI;
        MA_HIEN_TAI++;

    }

    public NhanVien(String name, Sex sex, float luong) {
        this.ma = MA_HIEN_TAI;
        this.name = name;
        this.sex = sex;
        this.luong = luong;
        MA_HIEN_TAI++;
    }

    //get and set
    public int getMa() {
        return ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "ma=" + ma + ", name=" + name + ", sex=" + sex + ", luong=" + luong + '}';
    }

    //class con can viet them
    @Override
    public void inPut() {
        System.out.print("name -->\t");
        this.name = new Scanner(System.in).nextLine();
        this.sex = Sex.setSex();
        System.out.print("luong -->\t");
        this.luong = new Scanner(System.in).nextFloat();
    }

    @Override
    public void outPut() {
        System.out.println(this);
    }

    public static NhanVien setNhanVien() {
        System.out.print("chon loai nhan vien [1: NV van phong] [2:quan ly] [3:Cong nhan] -->\t");
        int value = new Scanner(System.in).nextInt();
        switch (value) {
            case 1:
                return new NhanVienVanPhong();
            case 2:
                return new QuanLy();
            default:
                return new CongNhan();
        }
    }

}
