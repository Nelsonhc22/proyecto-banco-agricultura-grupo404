package com.banco.agricultura.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gerente-sucursal")
public class GerenteSucursalController {

    @GetMapping("/menu")
    public String menu(Model model) {
        return "gerente-sucursal/menu";
    }

    @GetMapping("/registrar-empleado")
    public String registrarEmpleado(Model model) {
        return "gerente-sucursal/registrar-empleado";
    }

    @GetMapping("/empleados")
    public String empleados(Model model) {
        return "gerente-sucursal/empleados";
    }

    @GetMapping("/prestamos")
    public String prestamos(Model model) {
        return "gerente-sucursal/prestamos";
    }
}