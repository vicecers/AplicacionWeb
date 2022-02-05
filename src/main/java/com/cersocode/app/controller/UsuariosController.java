/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cersocode.app.controller;

import com.cersocode.app.entity.Usuarios;
import com.cersocode.app.service.UsuariosSerevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author vicec
 */
@Controller
@RequestMapping("/usuarios")
public class UsuariosController {

    @Autowired
    @Qualifier("usuariosservice")
    private UsuariosSerevice usuariosService;

    @GetMapping("/usersform")
    public String usersForm(Model model,
            @RequestParam(name = "id", required = true) int id) {
        Usuarios us = new Usuarios();
        
        if(id != 0){
            us =  usuariosService.findUsuariosById(id);
        }
        
        model.addAttribute("usuarios", us);
        return "usersform";
    }

    @PostMapping("/addUsuarios")
    public String addUsuarios(@ModelAttribute(name = "usuarios") Usuarios usuarios) {
        usuariosService.addUsuarios(usuarios);
        return "redirect:/usuarios/listadousers";
    }

    @GetMapping("/listadousers")
    public String listadoUsers(Model model) {
        model.addAttribute("users", usuariosService.listAllUsuarios());
        return "users";
    }

    @GetMapping("/removeusuarios")
    public String removeUsuarios(Model model, @RequestParam(name = "id", required = true) int id) {

        usuariosService.removeUsuarios(id);

        return listadoUsers(model);
    }

}
