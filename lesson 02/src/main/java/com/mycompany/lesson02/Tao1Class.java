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
public class Tao1Class {

    private static Tao1Class tao1class;
    public String test;

    private Tao1Class() {
    }

    public static Tao1Class Tao1Class() {
        if (tao1class == null) {
            tao1class = new Tao1Class();
        }
        return tao1class;
    }

}
