/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test01;

import com.mycompany.test01.nhanviendemo.NhanVien;
import com.mycompany.test01.quanlynhaviendemo.Menu;
import java.util.ArrayList;

/**
 *
 * @author doanxuanquyet
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<NhanVien> list = new ArrayList<>();
        //goi menu, chuong trinh chay tu menu
        Menu.menu(list);
    }

}
