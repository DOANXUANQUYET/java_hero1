/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lesson01;

/**
 *
 * @author doanxuanquyet
 */
public class Main {
    public static void main(String[] args) {
        Customer cus1 = new Customer();
        Customer cus2 = new Customer();
        
        cus1.inPut();
        cus2.inPut();
        
        cus1.outPut();
        cus2.outPut();
        
        switch (cus1.compareBirthday(cus2)) {
            case 0:
                System.out.printf("%s ---bang tuoi--  %s",cus1.getName(),cus2.getName());
                break;
            case -1:
                System.out.printf("%s ---lon tuoi hon--  %s",cus1.getName(),cus2.getName());
                break;
            default:
                System.out.printf("%s ---it tuoi hon--  %s",cus1.getName(),cus2.getName());
                break;
        }
    }
}
