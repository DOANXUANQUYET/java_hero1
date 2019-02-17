/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_mvc_java_hero_01.lam_bai.controller.mapping;

/**
 *
 * @author doanxuanquyet
 * @param <D>
 * @param <M>
 */
public interface IMapping<D, M> {
//dung genneric  

    D modelToDTO(M sv);

    M dTOToModel(D svDTO);

}
