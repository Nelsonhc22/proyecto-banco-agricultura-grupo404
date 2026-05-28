package com.banco.agricultura.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("nombreCliente", "Juan Pérez");
        model.addAttribute("rolCliente", "Cliente");
        return "cliente/dashboard";
    }

    @GetMapping("/historial")
    public String historial(Model model) {
        return "cliente/historial";
    }

    @GetMapping("/transferencia")
    public String transferencia(Model model) {
        return "cliente/transferencia";
    }

    @GetMapping("/registro")
    public String registro(Model model) {
        return "cliente/registro";
    }
}