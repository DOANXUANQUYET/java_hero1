/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lesson02;

/**
 *
 * @author doanxuanquyet
 */
public class Tao3Class {

    private static final boolean BAN = true;
    private static final boolean RANH = false;
    private static Tao3Class[] cl = new Tao3Class[3];
    String test;
    private boolean trangThai = BAN;

    private Tao3Class() {
        this.trangThai = BAN;
    }

    public static Tao3Class Tao3class() {
        for (int i = 0; i < cl.length; i++) {
            if (cl[i] == null) {
                cl[i] = new Tao3Class();
                return cl[i];
            } else {
                if (!cl[i].trangThai) {
                    cl[i].trangThai = BAN;
                    return cl[i];
                }
            }
        }
        return null;

    }

}
