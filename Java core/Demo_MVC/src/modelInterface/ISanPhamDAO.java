/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelInterface;

import java.util.List;

/**
 *
 * @author doanxuanquyet
 * @param <T>
 */
public interface ISanPhamDAO<T> {
    
    public SanPham addNew(T sp);
    public SanPham updateByMa(T sp);
    public SanPham deleteByMa(T sp);
    public SanPham findMa(T sp);
    public List<SanPham> getAll();
    
}
