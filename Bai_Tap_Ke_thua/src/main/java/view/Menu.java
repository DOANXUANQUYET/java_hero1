/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.NhanVien;

/**
 *
 * @author doanxuanquyet
 */
public class Menu {

    void run(ArrayList<NhanVien> list) {
        //che do chon va gia tri thoat
        int mode;
        boolean start = true;

        while (start) {
            System.out.println("chon che do :");
            System.out.print("[1:them nhan vien] [2:hien thi] [3:tim Max theo gioi tinh] [4: tim Max theo vi tri] [5:thoat] -->");
            mode = new Scanner(System.in).nextInt();
            switch (mode) {
                case 1:
                        
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    start = false;
                default:
                    throw new AssertionError();
            }
        }

    }

}
