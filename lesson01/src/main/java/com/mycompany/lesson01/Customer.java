/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lesson01;

import java.util.Scanner;

/**
 *
 * @author doanxuanquyet
 */
public class Customer {
    private String svCode;
    private String name;
    private Birthday birthday;

    public Customer(String svCode, String name, Birthday birthday) {
        this.svCode = svCode;
        this.name = name;
        this.birthday = birthday;
    }

    public Customer() {
    }
    
    
    
    
    
    
    public void inPut(){
        
            System.out.print("svCode --> ");
            this.svCode = new Scanner(System.in).nextLine();
            
            System.out.print("name -->");
            this.name = new Scanner(System.in).nextLine();
            
            System.out.println("birthday (date,month,year) : ");
            int date = new Scanner(System.in).nextInt();
            int month = new Scanner(System.in).nextInt();
            int year = new Scanner(System.in).nextInt();
            this.birthday = new Birthday(date, month, year);
                  
    }
    
    public void outPut(){
        System.out.println("student information : ");
        System.out.println("svCode : " + this.svCode);
        System.out.println("name : " + this.name);
        System.out.println("birthday[date/month/year] : " + this.birthday.getNgay() +"/" + this.birthday.getThang() + "/" + this.birthday.getNam());
        
        
    }
    
    public int compareBirthday(Customer custom){
        int check = 0;
        if(this.birthday.getNam() < custom.birthday.getNam()){
            check = -1;
        }
        else if(this.birthday.getNam() > custom.birthday.getNam()){
            check = 1;
        }
        else{
            if(this.birthday.getThang()< custom.birthday.getThang()){
                check = -1;
            }
            else if(this.birthday.getThang()> custom.birthday.getThang()){
                check = 1;
            }
            else{
                    if(this.birthday.getNgay()< custom.birthday.getNgay()){
                        check = -1;
                    }
                    else if(this.birthday.getNgay() > custom.birthday.getNgay()){
                        check = 1;
                    }
            }
        }
        
        return  check;
            
        
    }

    public String getSvCode() {
        return svCode;
    }

    public void setSvCode(String svCode) {
        this.svCode = svCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Birthday getBirthday() {
        return birthday;
    }

    public void setBirthday(Birthday birthday) {
        this.birthday = birthday;
    }
    
    
    
}
