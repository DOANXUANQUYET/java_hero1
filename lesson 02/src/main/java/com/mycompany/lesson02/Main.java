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
public class Main {

    public static void main(String[] args) {
        //check tao 1 class 
        System.out.println("check tao 1 class :");
        Tao1Class cl1 = Tao1Class.Tao1Class();
        Tao1Class cl2 = Tao1Class.Tao1Class();

        cl2.test = "quyet";
        cl1.test = "nam";

        System.out.println(cl2.test);
        System.out.println(cl1.test);
        //check tao 3 class
        System.out.println("check tao 3 class:");
        Tao3Class clg1 = Tao3Class.Tao3class();
        Tao3Class clg2 = Tao3Class.Tao3class();
        Tao3Class clg3 = Tao3Class.Tao3class();

        clg1.test = "class1";
        clg2.test = "class2";
        clg3.test = "class3";

        System.out.println(clg1.test);
        System.out.println(clg2.test);
        System.out.println(clg3.test);

        //check ma sv tu dong tang khi khoi tao
        System.out.println("check masv tu dong tang khi khoi tao;:");
        MaSVTuDongTang sv1 = new MaSVTuDongTang();
        MaSVTuDongTang sv2 = new MaSVTuDongTang();
        MaSVTuDongTang sv3 = new MaSVTuDongTang();
        MaSVTuDongTang sv4 = new MaSVTuDongTang();

        System.out.println(sv1.Masv);
        System.out.println(sv2.Masv);
        System.out.println(sv3.Masv);
        System.out.println(sv4.Masv);
    }

}
