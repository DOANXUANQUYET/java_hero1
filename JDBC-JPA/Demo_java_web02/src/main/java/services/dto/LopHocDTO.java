/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.dto;

import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author doanxuanquyet
 */
@Data @NoArgsConstructor @AllArgsConstructor
public class LopHocDTO {
    
    private int ma;
    private String ten;
    private ArrayList<SinhVienDTO> listSinhVienDTOs;
    
}
