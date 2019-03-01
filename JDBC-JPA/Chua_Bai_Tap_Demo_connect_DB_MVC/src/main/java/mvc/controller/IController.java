/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.controller;

import java.util.List;
import mvc.connection.DBConnectionException;
import mvc.dao.exceptions.DeleteExceptions;
import mvc.dao.exceptions.InsertExceptions;
import mvc.dao.exceptions.SelectExceptions;
import mvc.dao.exceptions.UpdateExceptions;

/**
 *
 * @author doanxuanquyet
 * @param <T>
 * @param <K>
 */
public interface IController <T, K> {

    T insert(T sv) throws DBConnectionException, InsertExceptions;

    T updateById(T sv) throws DBConnectionException, UpdateExceptions;

    boolean deleteById(T sv) throws DBConnectionException, DeleteExceptions;

    List<T> getAll() throws DBConnectionException, SelectExceptions;

    T findById(K k) throws DBConnectionException, SelectExceptions;
    
}
