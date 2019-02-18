/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.controller.mapping;

import java.sql.Date;
import mvc.controller.covert.NgaySinhFormat;
import mvc.controller.dto.SinhVienDTO;
import mvc.entity.SinhVien;

/**
 *
 * @author doanxuanquyet
 */
public class SinhVienMapping implements IMapping<SinhVien, SinhVienDTO>{

    @Override
    public SinhVien DTOtoEntity(SinhVienDTO k) {
        //.....
        return null;
    }

    @Override
    public SinhVienDTO EntitytoDTO(SinhVien t) {
        SinhVienDTO svdto = new SinhVienDTO();
        svdto.setMa(t.getMa());
        svdto.setTen(t.getTen());
        
        //tao object format date
        NgaySinhFormat format = new NgaySinhFormat();
        svdto.setNgaySinh(format.DateToString((Date) t.getNgaySinh()));
        
        //tao object format lophoc
        
        //.....
        return null;
    }

}
