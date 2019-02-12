/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lesson01_02;

import com.mycompany.lesson01_02.quanlysanphamdemo.Menu;
import com.mycompany.lesson01_02.sanphamdemo.SanPham;
import java.util.ArrayList;

/**
 *
 * @author doanxuanquyet
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<SanPham> list = new ArrayList<>();
        Menu.menu(list);
    }
}
