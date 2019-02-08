/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lesson03;

import java.util.Scanner;


/**
 *
 * @author doanxuanquyet
 */
public class Student {

    private int maSV;
    private String name;
    private Sex sex;

    public static int MASINHVIEN = 0;

    //set and get

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
    
    

    

    //constructor
    public Student(String name) {
        MASINHVIEN++;
        this.maSV = MASINHVIEN;
        this.name = name;
    }

    public Student() {
        MASINHVIEN++;
        this.maSV = MASINHVIEN;
    }
    
    //nhap thong tin
    public void inPut(){
        System.out.print("name -->\t");
        this.name = new Scanner(System.in).nextLine();
        this.sex = Sex.inPut();
    }
    
    //xuat thong tin
    public void outPut(){
        System.out.println(this.maSV + "\t" + this.name +  "\t" + this.sex.getMota());        
    }

}
