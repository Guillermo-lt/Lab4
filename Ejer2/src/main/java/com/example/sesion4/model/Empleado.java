/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.sesion4.model;

/**
 *
 * @author malca
 */
public class Empleado {
     private String nombre;
    private double sueldoBase;
    private int horasExtra;

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    // Método para calcular tarifa por hora
    public double calcularTarifaPorHora() {
        return sueldoBase / 160;
    }

    // Método para calcular sueldo total
    public double calcularSueldoTotal() {
        return sueldoBase + (horasExtra * 8);
    }
    
}
