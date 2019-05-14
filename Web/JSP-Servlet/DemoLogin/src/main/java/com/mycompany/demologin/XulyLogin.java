/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demologin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author doanxuanquyet
 */
//code java sever ben nay
public class XulyLogin extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //lay request tu client
        String user = req.getParameter("username");
        String pass = req.getParameter("pass");

        //dua response ve client
        PrintWriter out = resp.getWriter();
        if (user.trim().contains("admin")) {
            //chuyen trang theo cau truc thu muc
            resp.sendRedirect("../index.html");
        } else {
            resp.sendRedirect("login.jsp");
        }
    }

}
