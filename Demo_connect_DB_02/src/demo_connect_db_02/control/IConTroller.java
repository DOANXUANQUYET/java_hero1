/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_connect_db_02.control;

import java.util.List;

/**
 *
 * @author doanxuanquyet
 * @param <T>
 */
public interface IConTroller<T extends MyDTO> { //quy dinh kieu du lieu chung la MyDTO

    //su dung generic  
    T addNew(T t);

    T upDate(T t);

    List<T> getAll();

    T find(T t);

}
