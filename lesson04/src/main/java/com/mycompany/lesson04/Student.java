/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lesson04;

/**
 *
 * @author doanxuanquyet
 */
public abstract class Student {
    
    public static int CODESTUDENT = 0;
    private int codeStudent;
    private String name;
    private String subject;

    //create construction
    public Student(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
    
    public Student() {
        
    }

    //get and set
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getSubject() {
        return subject;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getCodeStudent() {
        return codeStudent;
    }

    public void setCodeStudent(int codeStudent) {
        this.codeStudent = codeStudent;
    }
    
    

    //lay diem
    public abstract double getScore();
    //function nhap du lieu
    public abstract void inPut();

    //funtion Xuat du lieu hoc sinh
    public void outPut() {
        System.out.println("hoc sinh " + this.getCodeStudent() + this);
    }

    //function xet hoc luc
    public String getAbility(double score) {
        String ability;
        
        if (score >= 9) {
            ability = "Xuat sac";
        } else if (score >= 7.5) {
            ability = "gioi";
        } else if (score >= 6.5) {
            ability = "kha";
        } else if (score >= 5) {
            ability = "Trung binh";
        } else {
            ability = "Yeu";
        }
        
        return ability;
    }

    //viet lai ham toString
    @Override
    public String toString() {
        return "\t name : " + this.name + " \t subject : " + this.subject + "\t \t diem : "+this.getScore()+" \t ability : " + this.getAbility(this.getScore());
    }
    
}
