/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cochesukien;

/**
 *
 * @author doanxuanquyet
 */
public class Myframe {

    //su dung nut bam
    NutBam nutBam = new NutBam();
    TextBox textBox = new TextBox();

    public void nguoiDungAnNut(String consten) {
        //moi khi nguoi dung an nut thi ham nay duoc goi, ham nay duoc code truoc
        nutBam.anNut(consten);      
    }
    
    public void nguoiDungGoPhim(String consten){
        textBox.goPhim(consten);
    }


//    binh thuong thi nhu the nay
//    public Myframe() {
//        nutBam.setiXuLyAnNut(new XuLyAnNut());
//    }
//    
//    
//    
//    class XuLyAnNut implements IXuLyAnNut{
//
//        @Override
//        public void nutBiAn() {
//             System.out.println(nameChuongTrinh);
//        }
//        
//    }

//    public Myframe() {
//        nutBam.setiXuLyAnNut(new IXuLyAnNut() {
//            @Override
//            public void nutBiAn(String consten) {
//                noiDung(consten);
//            }
//        });
//    }
    public Myframe() {
        nutBam.setiXuLyAnNut(Myframe::noiDung);
        textBox.setTexBox(Myframe::noiDung2);
    }
    
    public static void noiDung(String consten){
        System.out.println("nguoi dung dang an nut" + "\t" + consten);
    }
    public static void noiDung2(String consten){
        System.out.println("nguoi dung go phim" + "\t" + consten);
    }
}
    
