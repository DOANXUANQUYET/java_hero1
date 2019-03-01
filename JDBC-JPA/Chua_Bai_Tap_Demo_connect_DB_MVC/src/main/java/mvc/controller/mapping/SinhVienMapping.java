/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.controller.mapping;

import java.sql.Date;
import mvc.controller.covert.GioiTinhFormat;
import mvc.controller.covert.NgaySinhFormat;
import mvc.controller.dto.LopHocDTO;
import mvc.controller.dto.SinhVienDTO;
import mvc.entity.LopHoc;
import mvc.entity.SinhVien;

/**
 *
 * @author doanxuanquyet
 */
public class SinhVienMapping implements IMapping<SinhVien, SinhVienDTO> {

    //tao cac doi tuong can thiet khi format
    NgaySinhFormat ngaySinhFormat = new NgaySinhFormat();
    GioiTinhFormat gioiTinhFormat = new GioiTinhFormat();
    //tao object format lophoc
    IMapping<LopHoc, LopHocDTO> mapLop = new LopHocMapping();

    @Override
    public SinhVien DTOtoEntity(SinhVienDTO k) {
        SinhVien sinhVien = new SinhVien();
        sinhVien.setMa(k.getMa());
        sinhVien.setTen(k.getTen());

        //convert ngay sinh 
        sinhVien.setNgaySinh(ngaySinhFormat.StringToDate(k.getNgaySinh()));
        //convert gioi tinh
        sinhVien.setGioiTinh(gioiTinhFormat.StringToGioiTinh(k.isGioiTinh()));
        //convert lophoc
        sinhVien.setLopHoc(mapLop.DTOtoEntity(k.getLopHoc()));

        return sinhVien;
    }

    @Override
    public SinhVienDTO EntitytoDTO(SinhVien t) {
        SinhVienDTO svdto = new SinhVienDTO();
        svdto.setMa(t.getMa());
        svdto.setTen(t.getTen());

        //tao object format date
        svdto.setNgaySinh(ngaySinhFormat.DateToString((Date) t.getNgaySinh()));

        //convert lophoc sang lophocDTO
        svdto.setLopHoc(mapLop.EntitytoDTO(t.getLopHoc()));

        //convert gioi tinh
        svdto.setGioiTinh(gioiTinhFormat.GioiTinhToString(t.getGioiTinh()));

        return svdto;
    }

}
