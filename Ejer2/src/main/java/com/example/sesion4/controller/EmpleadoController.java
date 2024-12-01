/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.sesion4.controller;

import com.example.sesion4.model.Empleado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmpleadoController {

    @GetMapping("/formulario_empleado")
    public String mostrarFormulario(Model model) {
        model.addAttribute("empleado", new Empleado());
        return "formulario_empleado";
    }

    @PostMapping("/calcular_sueldo")
    public String calcularSueldo(@ModelAttribute Empleado empleado, Model model) {
        double tarifaPorHora = empleado.calcularTarifaPorHora();
        double sueldoTotal = empleado.calcularSueldoTotal();

        model.addAttribute("nombre", empleado.getNombre());
        model.addAttribute("tarifaPorHora", tarifaPorHora);
        model.addAttribute("sueldoTotal", sueldoTotal);

        return "resultado_empleado";
    }
}
