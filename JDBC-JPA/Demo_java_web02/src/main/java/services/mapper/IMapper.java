/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.mapper;

/**
 *
 * @author doanxuanquyet
 * @param <DTO>
 * @param <ENTITY>
 */
public interface IMapper<DTO,ENTITY> {
    
    DTO toDTO(ENTITY entity);
    
    ENTITY toEntity(DTO dTO);
    
}
