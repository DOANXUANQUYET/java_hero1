/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example01;

/**
 *
 * @author doanxuanquyet
 */
public class Syohin {
    private String SyohinCode;
    private String SyohinName;
    private int Price;
    private int BunruiNo;
    
    public Syohin(){
        
    }

    public Syohin(String SyohinCode, String SyohinName, int Price, int BunruiNo) {
        this.SyohinCode = SyohinCode;
        this.SyohinName = SyohinName;
        this.Price = Price;
        this.BunruiNo = BunruiNo;
    }
    
    
    

    public String getSyohinCode() {
        return SyohinCode;
    }

    public void setSyohinCode(String SyohinCode) {
        this.SyohinCode = SyohinCode;
    }

    public String getSyohinName() {
        return SyohinName;
    }

    public void setSyohinName(String SyohinName) {
        this.SyohinName = SyohinName;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public int getBunruiNo() {
        return BunruiNo;
    }

    public void setBunruiNo(int BunruiNo) {
        this.BunruiNo = BunruiNo;
    }
       
    
}
