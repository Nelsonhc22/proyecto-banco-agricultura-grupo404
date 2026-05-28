package com.banco.agricultura.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dependiente")
public class DependienteController {

    @GetMapping("/buscar")
    public String buscar(Model model) {
        return "dependiente/buscar";
    }

    @GetMapping("/cuentas")
    public String cuentas(Model model) {
        model.addAttribute("nombreCliente", "Juan Pérez");
        model.addAttribute("duiCliente", "04829102-3");
        return "dependiente/cuentas";
    }

    @GetMapping("/abonar")
    public String abonar(Model model) {
        return "dependiente/abonar";
    }

    @GetMapping("/retirar")
    public String retirar(Model model) {
        return "dependiente/retirar";
    }
}