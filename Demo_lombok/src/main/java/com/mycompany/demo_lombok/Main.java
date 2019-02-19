/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo_lombok;

/**
 *
 * @author doanxuanquyet
 */
public class Main {
    public static void main(String[] args) {
        
        Demo demo = new Demo();
        demo.setName("quyet");
        
        System.out.println(demo.getName());
    }
}
