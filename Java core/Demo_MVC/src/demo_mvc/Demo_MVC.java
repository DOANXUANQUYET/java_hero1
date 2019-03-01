/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_mvc;

import demo_mvc.control.SanPhamDTO;
import modelInterface.ISanPhamDTO;

/**
 *
 * @author doanxuanquyet
 */
public class Demo_MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //nguoi dung nhap du lieu
        ISanPhamDTO spDTO = new SanPhamDTO();
        spDTO.hienDanhSach();
    }
    
}
