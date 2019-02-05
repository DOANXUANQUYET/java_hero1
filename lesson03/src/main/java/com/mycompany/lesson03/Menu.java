/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lesson03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author doanxuanquyet
 */
public class Menu {

    //function nhap list student
    public static void inPut(ArrayList<Student> list) {
        System.out.println("so luong sinh vien muon nhap -->");
        int inPutMode = new Scanner(System.in).nextInt();
        for (int i = 0; i < inPutMode; i++) {
            Student st = new Student();
            st.inPut();
            list.add(st);
        }
        System.out.println("------inPut finish--------");
    }

    //function xuat thong tin list student
    public static void outPut(ArrayList<Student> list) {
        if(list == null){
            System.out.println("Khong co du lieu");
            return;
        }
        System.out.println("----Danh sach Student----");
        list.forEach((student) -> {
            student.outPut();
        });
    }

    //function tim kiem va sap xep nhan vien theo ten
    public static void findOutPut(ArrayList<Student> list) {
        if(list == null){
            System.out.println("Khong co du lieu");
            return;
        }
        Comparator<Student> com = (Student o1, Student o2) -> o1.getName().compareTo(o2.getName());
        
        System.out.print("Search Sex [nam : 1, nu : 0, less : -1] -->\t");
        int sex = new Scanner(System.in).nextInt();

        ArrayList<Student> listSeach = new ArrayList<>();

        //chay list student va tim nhung stusent co Sex phu hop va gan vao listSearch
        list.forEach((student) -> {
           if(student.getSex().getMa() == sex){
               listSeach.add(student);
           }
        });
        
        //sap xep listSearch theo ten
        Collections.sort(listSeach,com);
        
        //xuat thong tin listSearch
        Menu.outPut(listSeach);
        
        System.out.println("----find succes!-----");
    }

}
