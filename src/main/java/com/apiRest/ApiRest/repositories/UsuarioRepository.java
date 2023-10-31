/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiRest.ApiRest.repositories;

import com.apiRest.ApiRest.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author elias
 */
@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
    
}
