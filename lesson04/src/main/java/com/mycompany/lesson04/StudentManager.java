/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lesson04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author doanxuanquyet
 */
public class StudentManager {

    //function nhap list hoc sinh
    public static void inPut(ArrayList<Student> list) {
        System.out.println("nhap danh sach hoc sinh [nhap end de ket thuc] : ");
        while (true) {
            System.out.println("");
            System.out.print("name -->\t");
            String nameW = new Scanner(System.in).nextLine();
            //nhap end thi ket thuc
            if (nameW.equals("end")) {
                break;
            }
            //check nganh
            System.out.print("subject [IT or Biz] -->\t");
            String subjectW = new Scanner(System.in).nextLine();
            //tao doi tuong StudentIT them vao list
            switch (subjectW) {
                case "IT": {
                    StudentIT st = new StudentIT();
                    st.setName(nameW);
                    st.setSubject(subjectW);
                    st.inPut();
                    list.add(st);
                    break;
                }
                case "Biz": {
                    StudentBiz st = new StudentBiz();
                    st.setName(nameW);
                    st.setSubject(subjectW);
                    st.inPut();
                    list.add(st);
                    break;
                }
                default:
                    System.out.println("subject not accepted!");
                    break;
            }

        }

    }

    //function xuat Danh Sach hoc sinh
    public static void outPut(ArrayList<Student> list) {
        if (list.isEmpty()) {
            System.out.println("Khong co du lieu");
            return;
        }
        list.forEach((student) -> {
            student.outPut();
        });
    }

    //Xuat danh sach hoc sinh co hoc luc gioi
    public static void outPutGoodStudent(ArrayList<Student> list) {
        if (list.isEmpty()) {
            System.out.println("Khong co du lieu");
            return;
        }
        int cnt = 0;
        for (Student student : list) {
            if (student.getAbility(student.getScore()).equals("gioi")) {
                student.outPut();
                cnt++;
            }
        }
        if (cnt == 0) {
            System.out.println("Khong co hoc sinh xep loai gioi");
        }
    }

    //Xuat danh sach theo gioi tinh
    public static void outPutStudentSex(ArrayList<Student> list) {
        if (list.isEmpty()) {
            System.out.println("Khong co du lieu");
            return;
        }
        //nhap gioi tinh muon tim
        Sex sexW = Sex.inputSex();
        int cnt = 0;
        for (Student student : list) {
            if (student.getSex() == sexW) {
                student.outPut();
                cnt++;
            }
        }
        if (cnt == 0) {
            System.out.println("Khong co hoc sinh xep loai gioi");
        }
    }

    //Sap xep nhan vien theo diem
    public static void sortStudentScore(ArrayList<Student> list) {
        if (list.isEmpty()) {
            System.out.println("Khong co du lieu");
            return;
        }
        //khoi tao comparatopr so sanh diem
        Comparator<Student> com = (Student o1, Student o2) -> o1.getScore() < o2.getScore() ? 1 : -1;
        Collections.sort(list, com);
        System.out.println("Danh sach da duoc sap xep theo diem");
    }

    //Sap xep theo ten
    public static void sortStudentName(ArrayList<Student> list) {
        if (list.isEmpty()) {
            System.out.println("Khong co du lieu");
            return;
        }
        //khoi tao comparatopr so sanh ten
        Comparator<Student> com = (Student o1, Student o2) -> o1.getName().compareTo(o2.getName());
        Collections.sort(list, com);
        System.out.println("Danh sach da duoc sap xep theo ten");
    }

}
