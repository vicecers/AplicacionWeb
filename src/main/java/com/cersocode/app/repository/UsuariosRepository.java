/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cersocode.app.repository;

import com.cersocode.app.entity.Usuarios;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author vicec
 */
@Repository("usuariosrepository")
public interface UsuariosRepository extends JpaRepository<Usuarios, Serializable>{
    
     public Usuarios findById(int id);    
    
}
