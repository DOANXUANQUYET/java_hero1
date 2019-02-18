/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.controller.covert;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author doanxuanquyet
 */
public class NgaySinhFormat {
    
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    
    //tu date chuyen qua string
    public String DateToString(Date date){
        return dateFormat.format(date);
    }
    
    //tu string chuyen qua date
    public Date StringToDate(String date){
        try {
            return (Date) dateFormat.parse(date);
        } catch (ParseException ex) {
            Logger.getLogger(NgaySinhFormat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
