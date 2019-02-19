/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.controller.covert;

import mvc.entity.GioiTinh;

/**
 *
 * @author doanxuanquyet
 */
public class GioiTinhFormat {
    
    public GioiTinh StringToGioiTinh(String str){
        if(str.equals("nam")){
            return GioiTinh.NAM;
        }
        else{
            return GioiTinh.NU;
        }
    }
    
    public String GioiTinhToString(GioiTinh sex){
        if(sex.equals(GioiTinh.NAM)){
            return GioiTinh.NAM.getMoTa();
        }
        else{
            return GioiTinh.NU.getMoTa();
        }
    }
}
