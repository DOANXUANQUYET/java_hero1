/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.servlet;

import com.mycompany.demo_java_web02.dao.entity.SinhVien;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.controller.IController;
import services.controller.SinhVienController;
import services.dto.SinhVienDTO;

/**
 *
 * @author doanxuanquyet
 */
public class SinhVienServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //tao doi tuong quan ly
        IController<SinhVienDTO, SinhVien> controller = new SinhVienController();
        //goi ham lay danh sach
        List<SinhVienDTO> listsv = controller.getAll();
        //tao bien ket noi de truyen qua trang khac
        req.setAttribute("listsv", listsv);
        
        //ket noi voi trang khac
        req.getRequestDispatcher("/listsv.jsp").forward(req, resp);
    }

}
