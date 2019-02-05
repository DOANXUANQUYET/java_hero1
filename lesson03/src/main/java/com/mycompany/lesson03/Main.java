/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lesson03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author doanxuanquyet
 *
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        boolean mode = true;
        while (mode) {
            System.out.println("mode [input : 1] [output : 2] [search : 3] [exit : 4] ---> \t");
            switch (new Scanner(System.in).nextInt()) {
                case 1:
                    Menu.inPut(list);
                    break;
                case 2:
                    Menu.outPut(list);
                    break;
                case 3:
                    Menu.findOutPut(list);
                    break;
                case 4:
                    mode = false;
                    break;
                default:
                    System.out.println("-- mode not accepted !!!!");
            }
        }
        //nhap list student

        //xuat thong tin
    }
}
