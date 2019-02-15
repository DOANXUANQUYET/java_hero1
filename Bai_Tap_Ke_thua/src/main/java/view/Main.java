/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import model.NhanVien;

/**
 *
 * @author doanxuanquyet
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<NhanVien> list = new ArrayList<>();
        Menu menu = new Menu();
        menu.run(list);
    }
}
