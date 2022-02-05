/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cersocode.app.controller;

import com.cersocode.app.modelo.Credenciales;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author vicec
 */
@Controller
public class LoginController {

    @GetMapping("/")
    public String redirectLogin() {

        return "redirect:/login";
    }

    @GetMapping("/login")
    public String login( Model model, 
            @RequestParam(name = "error", required = false)String error,
            @RequestParam(name = "logout", required = false)String logout) {
        model.addAttribute("error", error);
        model.addAttribute("logout", logout);
        model.addAttribute("credenciales", new Credenciales());
        return "login";
    }

    @PostMapping("/check")
    public String check(@ModelAttribute(name = "credenciales") Credenciales credenciales) {
        if (credenciales.getNombre().equals("paco") && credenciales.getPass().equals("234")) {
            return "redirect:/usuarios/listadousers";
        } else {
            return "redirect:/login?error";
        }

    }
}
