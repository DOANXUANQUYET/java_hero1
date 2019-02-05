/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lesson01;

import java.util.Scanner;

/**
 *
 * @author doanxuanquyet
 */
public class Birthday {

    private int ngay;
    private int thang;
    private int nam;

    public Birthday(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public Birthday() {

    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    //so sanh ngay : bang nhau tra ve 0; lon hon tra ve -1; nho hon tra ve 1
    public int compareDate(Birthday birthday) {
        int check = 0;

        if (birthday == null) {
            return check;
        }

        if (this.nam < birthday.getNam()) {
            check = -1;
        } else if (this.nam > birthday.getNam()) {
            check = 1;
        } else {
            if (this.thang < birthday.getThang()) {
                check = -1;
            } else if (this.thang > birthday.getThang()) {
                check = 1;
            } else {
                if (this.ngay < birthday.getNgay()) {
                    check = -1;
                } else if (this.ngay > birthday.getNgay()) {
                    check = 1;
                }
            }
        }
        return check;
    }

    //nhap thong tin ngay
    public void inPut() {
        System.out.println("birthday (date,month,year) : ");
        this.ngay = new Scanner(System.in).nextInt();
        this.thang = new Scanner(System.in).nextInt();
        this.nam = new Scanner(System.in).nextInt();
    }
    
    //xuat thong tin ngay
    public void outPut(){
          System.out.println("birthday[date/month/year] : " + this.ngay +"/" + this.thang + "/" + this.nam);
    }

}
