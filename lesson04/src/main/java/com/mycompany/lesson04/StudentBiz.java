/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lesson04;

import java.util.Scanner;

/**
 *
 * @author doanxuanquyet
 */
public class StudentBiz extends Student {

    private double marketting;
    private double sales;

    //create construction
    public StudentBiz(double marketting, double sales, String name, String subject) {
        super(name, subject);
        this.marketting = marketting;
        this.sales = sales;
        this.setCodeStudent(Student.CODESTUDENT);
        Student.CODESTUDENT++;
    }

    public StudentBiz(double marketting, double sales) {
        this.marketting = marketting;
        this.sales = sales;
        this.setCodeStudent(Student.CODESTUDENT);
        Student.CODESTUDENT++;
    }

    public StudentBiz() {
        this.setCodeStudent(Student.CODESTUDENT);
        Student.CODESTUDENT++;
    }

    //set and get
    public double getMarketting() {
        return marketting;
    }

    public void setMarketting(double marketting) {
        this.marketting = marketting;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    //viet lai ham get diem 
    @Override
    public double getScore() {
        return (double) (this.marketting * 2 + this.sales) / 3;
    }

    @Override
    public void inPut() {
        System.out.print("marketting score -->\t");
        this.marketting = new Scanner(System.in).nextDouble();
        System.out.print("sales score -->\t");
        this.sales = new Scanner(System.in).nextDouble();
    }

}
