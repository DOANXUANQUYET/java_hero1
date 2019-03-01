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
public class NutBam {

    private IXuLyAnNut iXuLyAnNut;

    public IXuLyAnNut getiXuLyAnNut() {
        return iXuLyAnNut;
    }

    public void setiXuLyAnNut(IXuLyAnNut iXuLyAnNut) {
        this.iXuLyAnNut = iXuLyAnNut;
    }

    //duoc frame goi khi nut bi an va se chay 1 doan code nao do do lap trinh vien sau nay code
    public void anNut(String consten) {
        iXuLyAnNut.nutBiAn(consten);

    }

}
