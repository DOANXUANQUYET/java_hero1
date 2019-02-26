/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo_sanpham.servlet;

import com.mycompany.demo_sanpham.controller.SanPhamController;
import com.mycompany.demo_sanpham.dto.SanPhamDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author doanxuanquyet
 */
public class SanPhamServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        SanPhamController control = new SanPhamController();

        List<SanPhamDTO> list = control.getAll2();

        req.setAttribute("listsp", list);
        
        SanPhamDTO spdto = control.find(1);
        
        req.setAttribute("spdto", spdto);

        req.getRequestDispatcher("/DoanXuanQuyet_Demo_SanPham.jsp").forward(req, resp);
    }

}
