/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_mvc_java_hero_01.lam_bai.model.DAO;

import java.util.List;

/**
 *
 * @author doanxuanquyet
 * @param <T>
 */
public interface IDAO<T> {
    //su dung generic  

    T addNew(T t);

    T upDate(T t);
    
    List<T> getAll();

    T find(T t);

}