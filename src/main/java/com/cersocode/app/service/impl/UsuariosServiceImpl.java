package com.cersocode.app.service.impl;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.cersocode.app.entity.Usuarios;
import com.cersocode.app.service.UsuariosSerevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.cersocode.app.repository.UsuariosRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vicec
 */
@Service("usuariosservice")
public class UsuariosServiceImpl implements UsuariosSerevice {

    @Autowired
    @Qualifier("usuariosrepository")
    private UsuariosRepository usuariosRepository;

    @Override
    public Usuarios addUsuarios(Usuarios usuarios) {
        return usuariosRepository.save(usuarios);
    }

    @Override
    public List<Usuarios> listAllUsuarios() {
        List<Usuarios> users = new ArrayList<>();
        users = usuariosRepository.findAll();
        return users;
    }

    @Override
    public Usuarios findUsuariosById(int id) {

        return usuariosRepository.findById(id);
    }

    @Override
    public void removeUsuarios(int id) {

        Usuarios us = findUsuariosById(id);

        if (us != null) {
            usuariosRepository.delete(us);
        }
    }

}
