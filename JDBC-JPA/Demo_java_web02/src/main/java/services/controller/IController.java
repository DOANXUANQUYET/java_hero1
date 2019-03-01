/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.controller;

import java.util.List;

/**
 *
 * @author doanxuanquyet
 * @param <T>
 * @param <K>
 */
public interface IController<T, K> {

    T insert(T sv);

    T updateById(T sv);

    boolean deleteById(T sv);

    List<T> getAll();

    T findById(K k);

}
