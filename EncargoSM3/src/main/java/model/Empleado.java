/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.Direccion;

/**
 *
 * @author enune
 */
public class Empleado extends EncargoSM3{
    
    private String cargo;

    public Empleado(String rut, String nombre, String telefono, Direccion direccion, String cargo) {
        // Uso de super(...) para invocar el constructor de la superclase [7]
        super(rut, nombre, telefono, direccion);
        this.cargo = cargo;
    }
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    
    @Override
    public String toString() {
        // Combina los datos de la base con los específicos del empleado [5]
        return super.toString() + " | Cargo: " + cargo;
    }

    
}