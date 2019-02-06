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
public class StudentIT extends Student {

    private double html;
    private double css;
    private double js;

    //create construction
    public StudentIT(double html, double css, double js, String name, String subject) {
        super(name, subject);
        this.html = html;
        this.css = css;
        this.js = js;
        this.setCodeStudent(Student.CODESTUDENT);
        Student.CODESTUDENT++;
    }

    public StudentIT(String name, String subject) {
        super(name, subject);
        this.setCodeStudent(Student.CODESTUDENT);
        Student.CODESTUDENT++;
    }

    public StudentIT() {
        this.setCodeStudent(Student.CODESTUDENT);
        Student.CODESTUDENT++;
    }

    //set and get
    public double getHtml() {
        return html;
    }

    public void setHtml(double html) {
        this.html = html;
    }

    public double getCss() {
        return css;
    }

    public void setCss(double css) {
        this.css = css;
    }

    public double getJs() {
        return js;
    }

    public void setJs(double js) {
        this.js = js;
    }

    //viet lai ham get diem
    @Override
    public double getScore() {
        return (double) (this.js * 2 + this.html + this.css) / 4;
    }

    @Override
    public void inPut() {
        System.out.print("html score -->\t");
        this.html = new Scanner(System.in).nextDouble();
        System.out.print("css score -->\t");
        this.css = new Scanner(System.in).nextDouble();
        System.out.print("java score -->\t");
        this.js = new Scanner(System.in).nextDouble();
    }

}
