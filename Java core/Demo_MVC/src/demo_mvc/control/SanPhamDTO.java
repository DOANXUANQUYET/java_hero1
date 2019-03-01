/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_mvc.control;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelInterface.ISanPhamDAO;
import modelInterface.ISanPhamDTO;
import modelInterface.SanPham;

/**
 *
 * @author doanxuanquyet
 */
public class SanPhamDTO implements ISanPhamDTO {

    //chua tao tang view  nen xu li nhap du lieu ben trong tang nay
    //tao tang DAO de xu li dung reflection
    String className = "demo_mvc.model.SanPhamDAO";
    ISanPhamDAO spDAO = null;

    public SanPhamDTO() {

        //tao tang DAO de xu li dung reflection
        try {
            this.spDAO = (ISanPhamDAO) Class.forName(className).newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(SanPhamDTO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //nhap thong tin san pham
    @Override
    public void nhapSanPham() {

        //chua xu li kiem tra du lieu nhap vao
        System.out.println("ma -->");
        int ma = new Scanner(System.in).nextInt();
        System.out.println("ten -->");
        String ten = new Scanner(System.in).nextLine();
        System.out.println("gia -->");
        double gia = new Scanner(System.in).nextDouble();

        //truyen du lieu tao thanh san pham
        SanPham sp = new SanPham(ma, ten, gia);
        //them san vao database
        SanPham spThemMoi = spDAO.addNew(sp);
        //kiem tra xem them vao database co thanh cong khong, xuat ket qua chon guoi dung
        if (spThemMoi != null) {
            System.out.println("them moi thanh cong");
        } else {
            System.out.println("them moi khong thanh cong");
        }
    }

    @Override
    public void hienDanhSach() {
        List<SanPham> listSp = spDAO.getAll();
        listSp.forEach((t) -> {
            System.out.println("\t" + t.getMa() + "\t" + t.getTen() + "\t" + t.getGia());
        });
    }

}
