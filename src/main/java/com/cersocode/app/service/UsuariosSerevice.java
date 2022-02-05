/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cersocode.app.service;

import com.cersocode.app.entity.Usuarios;
import java.util.List;

/**
 *
 * @author vicec
 */
public interface UsuariosSerevice {
    
    public Usuarios addUsuarios(Usuarios usuarios);
    
    public List<Usuarios> listAllUsuarios();
    
    public Usuarios findUsuariosById(int id);    
    
    public void removeUsuarios(int id);    
    
}
