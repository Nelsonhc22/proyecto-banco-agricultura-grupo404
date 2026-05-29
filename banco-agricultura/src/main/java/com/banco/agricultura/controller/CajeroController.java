package com.banco.agricultura.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cajero")
public class CajeroController {

    @GetMapping("/menu")
    public String menu(Model model) {
        return "cajero/menu";
    }

    @GetMapping("/registrar-cliente")
    public String registrarCliente(Model model) {
        return "cajero/registrar-cliente";
    }

    @GetMapping("/deposito-retiro")
    public String depositoRetiro(Model model) {
        return "cajero/deposito-retiro";
    }

    @GetMapping("/prestamo")
    public String prestamo(Model model) {
        return "cajero/prestamo";
    }

    @GetMapping("/agregar-dependiente")
    public String agregarDependiente(Model model) {
        return "cajero/agregar-dependiente";
    }
}