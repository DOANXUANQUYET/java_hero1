/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo_java_web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author doanxuanquyet
 */
@WebServlet(name = "DemoServlet", urlPatterns = {"/DemoServlet"})
public class DemoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    //repuest la object dai dien cho tat ca nhung tap hop du lieu gui len tu client
    //response la tap hop tat ca nhung gi tra ve cho client
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //    response.setContentType("text/html;charset=UTF-8");
        String a = request.getParameter("soA");
        // response.getWriter().print("hello hello");
        try {
        int aInt = Integer.valueOf(a);
        //chuyen trang trong java, truyen du lieu sang file newjsp
        aInt = aInt * 2;
        //gan thuoc tinh de truyen du lieu di
        request.setAttribute("aServlet", aInt);
            
        } catch (NumberFormatException e) {
            request.setAttribute("messError", "so nhap khong dung dinh dang, vui long nhap lai");
        }
        //su dung ham request.getRequestDispatcher("duong dan").forward(request, response);

        request.getRequestDispatcher("/newjsp.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    //du lieu gui theo phuong thuc get se chay vao day, du lieu hien len tren thanh ip
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    //client gui theo phuong thuc post se chay vao day, du lieu an, k hien tren thanh ip, thuong dung de gui user,pass
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
