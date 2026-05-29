package com.banco.agricultura.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gerente-general")
public class GerenterGeneralController {

    @GetMapping("/menu")
    public String menu(Model model) {
        return "gerente-general/menu";
    }

    @GetMapping("/acciones-personal")
    public String accionesPersonal(Model model) {
        return "gerente-general/acciones-personal";
    }

    @GetMapping("/registrar-sucursal")
    public String registrarSucursal(Model model) {
        return "gerente-general/registrar-sucursal";
    }

    @GetMapping("/movimientos")
    public String movimientos(Model model) {
        return "gerente-general/movimientos";
    }
}