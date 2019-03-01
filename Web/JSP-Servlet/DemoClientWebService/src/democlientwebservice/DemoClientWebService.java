/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democlientwebservice;

import com.demo.ws.SinhVien;

/**
 *
 * @author doanxuanquyet
 */
public class DemoClientWebService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SinhVien allSinhVien = getAllSinhVien();
        System.out.println(allSinhVien.getMa());
        System.out.println(allSinhVien.getTen());
    }

    private static SinhVien getAllSinhVien() {
        com.demo.ws.NewWebService_Service service = new com.demo.ws.NewWebService_Service();
        com.demo.ws.NewWebService port = service.getNewWebServicePort();
        return port.getAllSinhVien();
    }
    
}
