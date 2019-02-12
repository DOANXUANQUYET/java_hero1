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
public class TextBox {
    
    ITexBox texBox;

    public ITexBox getTexBox() {
        return texBox;
    }

    public void setTexBox(ITexBox texBox) {
        this.texBox = texBox;
    }
    
    public void goPhim(String consten){
        texBox.xuLyGoPhim(consten);
    }
    
}
