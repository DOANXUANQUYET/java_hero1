/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_mvc;

import demo_mvc.model.SanPham;
import demo_mvc.model.SanPhamDAO;
import java.util.Scanner;

/**
 *
 * @author doanxuanquyet
 */
public class SanPhamDTO {
    
    //nhap thong tin san pham
    public void nhapSanPham(){
        
        //chua xu li kiem tra du lieu nhap vao
        System.out.println("ma -->");
        int  ma = new Scanner(System.in).nextInt();
        System.out.println("ten -->");
        String  ten = new Scanner(System.in).nextLine();
        System.out.println("gia -->");
        double  gia = new Scanner(System.in).nextDouble();
        
        //truyen du lieu tao thanh san pham
        SanPham sp = new SanPham(ma, ten, gia);
        //them san vao database
        SanPhamDAO spDAO = new SanPhamDAO();
        SanPham spThemMoi = spDAO.themMoi(sp);
        //kiem tra xem them vao database co thanh cong khong, xuat ket qua chon guoi dung
        if(spThemMoi != null){
            System.out.println("them moi thanh cong");
        }
        else{
            System.out.println("them moi khong thanh cong");
        }
    }
    
}
