/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiRest.ApiRest.services;

import com.apiRest.ApiRest.models.UsuarioModel;
import com.apiRest.ApiRest.repositories.UsuarioRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author elias
 */
@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
    
    public  ArrayList<UsuarioModel> obtenerUsuarios(){
           return (ArrayList<UsuarioModel>) usuarioRepository.findAll();//castear a un arreglo para poder regresarlo en un JSON
    }
    
    public UsuarioModel guardarUsuario(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }
    
    public Optional<UsuarioModel> obtenerPorId(Long id){//como el metodo puede fallar si no encuentra el id es importante usar un Optional
        return usuarioRepository.findById(id);
    }
    
    public ArrayList<UsuarioModel> obtenerPorPrioridad(Integer prioridad){
        return usuarioRepository.findByPrioridad(prioridad);
    }
    
    public boolean eliminarUsuario(Long id){
        try {
            usuarioRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
    
    
}
