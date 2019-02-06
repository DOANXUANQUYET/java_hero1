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
public class Main {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        int mode;
        boolean status = true;
        while (status) {
            System.out.print("Nhap che do [input : 0] [output : 1] [search : 2] [sort : 3] [exit : 4] -->\t");
            mode = new Scanner(System.in).nextInt();
            switch (mode) {
                case 0:
                    Menu.inPut(list);
                    break;
                case 1:
                    Menu.outPut(list);
                    break;
                case 2:
                    Menu.outPutGoodStudent(list);
                    break;
                case 3:
                    Menu.sortStudent(list);
                    Menu.outPut(list);
                    break;
                case 4:
                    status = false;
                    break;
                default:
                    System.out.println("Che do khong dung, xin nhap lai!");
            }
        }
    }

}
