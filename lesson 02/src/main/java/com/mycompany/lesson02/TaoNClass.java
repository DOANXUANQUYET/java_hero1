/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lesson02;

import java.util.Random;

/**
 *
 * @author doanxuanquyet
 */
public class TaoNClass {

    private static final boolean BAN = true;
    private static final boolean RANH = false;
    public static TaoNClass arrayClass[];
    private String name;
    private int age;
    private boolean trangThai = RANH;

    private TaoNClass() {
        this.trangThai = BAN;

    }

    private TaoNClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static TaoNClass taoClassN() {
        int lenght = TaoNClass.arrayClass.length;
        for (int i = 0; i < lenght; i++) {
            if (arrayClass[i] == null) {
                arrayClass[i] = new TaoNClass();
                return arrayClass[i];
            } else {
                if (!arrayClass[i].getTrangThai()) {
                    arrayClass[i].setTrangThai(BAN);
                    return arrayClass[i];
                }
            }
        }
        //tra ve ngau nhien 1 class trong pham vi
        Random rd = new Random();
        return TaoNClass.arrayClass[rd.nextInt(lenght)];

    }

    public static void soLuongClass(int n) {
        TaoNClass.arrayClass = new TaoNClass[n];
    }
}
