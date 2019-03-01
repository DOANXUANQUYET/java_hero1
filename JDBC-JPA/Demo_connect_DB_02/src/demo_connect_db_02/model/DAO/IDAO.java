/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_connect_db_02.model.DAO;

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
