/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.controller.mapping;

/**
 *
 * @author doanxuanquyet
 * @param <T>
 * @param <K>
 */
public interface IMapping<T, K> {

    T DTOtoEntity(K k);

    K EntitytoDTO(T t);

}
