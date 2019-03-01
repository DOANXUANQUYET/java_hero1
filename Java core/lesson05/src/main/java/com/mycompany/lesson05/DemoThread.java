/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lesson05;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author doanxuanquyet
 */
public class DemoThread {

    private static final int THREAD_A = 1;
    private static final int THREAD_B = 2;
    private static final int THREAD_C = 3;

    //tao  la co 
    static AtomicInteger laCo = new AtomicInteger(THREAD_A);
    //tao random
    static Random rd = new Random();
    //tao bien a,b,c
    static int a;
    static int b;
    static int c;

    public static void main(String[] args) {

        Thread threadA;
        threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (laCo) {
                    for (int i = 0; i < 100;) {
                        try {
                            if (laCo.get() == THREAD_A) {
                                //tranh truong hop forever waiting
                                i++;
                                System.out.println("---------lan thu : "+ i);
                                a = rd.nextInt(300);
                                System.out.println("a = " + a);
                                //chuyen sang cho thread b xu ly
                                laCo.set(THREAD_B);
                                laCo.notifyAll();
                            } else {
                                laCo.wait();
                            }
                        } catch (InterruptedException ex) {
                            Logger.getLogger(DemoThread.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }
                }
            }
        });

        Thread threadB;
        threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (laCo) {
                    for (int i = 0; i < 100;) {
                        try {
                            if (laCo.get() == THREAD_B) {
                                //tranh truong hop forever waiting
                                i++;
                                b = rd.nextInt(300);
                                System.out.println("b = " + b);
                                //chuyen sang cho thread b xu ly
                                laCo.set(THREAD_C);
                                laCo.notifyAll();
                            } else {
                                laCo.wait();
                            }

                        } catch (InterruptedException ex) {
                            Logger.getLogger(DemoThread.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
        });
        Thread threadC;
        threadC = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (laCo) {
                    for (int i = 0; i < 100;) {
                        try {
                            if (laCo.get() == THREAD_C) {
                                //tranh truong hop forever waiting
                                i++;
                                c = a + b;
                                System.out.printf("c = a + b (%d = %d + %d)\n", c,a,b);
                                //chuyen sang cho thread b xu ly
                                laCo.set(THREAD_A);
                                laCo.notifyAll();
                            } else {
                                laCo.wait();
                            }

                        } catch (InterruptedException ex) {
                            Logger.getLogger(DemoThread.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
        });
        
        threadA.start();
        threadB.start();
        threadC.start();
    }

}
