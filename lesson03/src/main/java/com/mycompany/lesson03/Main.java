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
 */
public class Main {
    public static void main(String[] args) {
            ArrayList<Student> list = new ArrayList<>();
            
            //nhap list student
            String inPutMode;
            while(true){
                Student st = new Student();
                st.inPut();
                list.add(st);
                System.out.println("continue? (yes/no)--> ");
                inPutMode = new Scanner(System.in).nextLine();
                if(inPutMode.equals("no")){
                    break;
                }
            }
            
            
        //xuat thong tin
        list.forEach((student) -> {
            student.outPut();
        });
    }
}
