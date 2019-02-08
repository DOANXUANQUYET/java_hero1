/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lesson04;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author doanxuanquyet
 */
public final class Menu {

    public final static void menu() {
        ArrayList<Student> list = new ArrayList<>();
        int mode;
        boolean status = true;
        while (status) {
            System.out.print("Nhap che do [input : 0] [output : 1] [search(Hoc luc gioi) : 2] [search(Gioi tinh) : 3] [sort(score) : 4] [sort(name) : 5] [exit : 6]  -->\t");
            mode = new Scanner(System.in).nextInt();
            switch (mode) {
                case 0:
                    StudentManager.inPut(list);
                    break;
                case 1:
                    if (list.isEmpty()) {
                        System.out.println("khong co du lieu");
                    } else {
                        StudentManager.outPut(list);
                    }
                    break;
                case 2:
                    if (list.isEmpty()) {
                        System.out.println("khong co du lieu");
                    } else {
                        StudentManager.outPutGoodStudent(list);
                    }
                    break;
                case 3:
                    if (list.isEmpty()) {
                        System.out.println("khong co du lieu");
                    } else {
                        StudentManager.outPutStudentSex(list);
                    }
                    break;
                case 4:
                    if (list.isEmpty()) {
                        System.out.println("khong co du lieu");
                    } else {
                        StudentManager.sortStudentScore(list);
                        StudentManager.outPut(list);
                    }
                    break;
                case 5:
                    if (list.isEmpty()) {
                        System.out.println("khong co du lieu");
                    } else {
                        StudentManager.sortStudentName(list);
                        StudentManager.outPut(list);

                    }
                    break;
                case 6:
                    status = false;
                    break;
                default:
                    System.out.println("Che do khong dung, xin nhap lai!");
            }
            System.out.println("");
        }
    }

}
