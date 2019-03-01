/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fillter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 *
 * @author doanxuanquyet
 */
//tao class wrapper
public class MyRequest extends HttpServletRequestWrapper {

    public MyRequest(HttpServletRequest request) {
        super(request);
    }

    //cai lai ham getParameter
    @Override
    public String getParameter(String tenThamSo) {
        if (tenThamSo != null && tenThamSo.toLowerCase().equals("name")) {
            return super.getParameter(tenThamSo).toUpperCase(); //To change body of generated methods, choose Tools | Templates.
        }
        return super.getParameter(tenThamSo); //To change body of generated methods, choose Tools | Templates.
    }

}
