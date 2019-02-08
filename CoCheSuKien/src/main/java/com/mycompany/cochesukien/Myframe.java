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
    
    public void nguoiDungAnNut(){
        //moi khi nguoi dung an nut thi ham nay duoc goi, ham nay duoc code truoc
        nutBam.anNut();
    }

    private  String nameChuongTrinh = "chuong trinh bam nut";
    
    
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
    
    
    public Myframe(){
        nutBam.setiXuLyAnNut(new IXuLyAnNut() {
            @Override
            public void nutBiAn() {
                System.out.println(nameChuongTrinh);
            }
        });
    }
    
    
}
