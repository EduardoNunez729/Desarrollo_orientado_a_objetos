/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package model;

import model.Direccion;

/**
 *
 * @author enune
 */
public class EncargoSM3 {
    // Atributos privados
    private String rut;
    private String nombre;
    private String telefono;
    private Direccion direccion; // Relación de Composición (Persona tiene una Dirección)

    /**
     * Constructor por defecto.
     */
    public EncargoSM3() {
        this.rut = "00000000-0";
        this.nombre = "Sin Nombre";
        this.telefono = "+56900000000";
        this.direccion = new Direccion();
    }

    /**
     * Constructor parametrizado.
     * 
     * @param rut RUT de la persona.
     * @param nombre Nombre completo.
     * @param telefono Teléfono de contacto.
     * @param direccion Objeto de tipo Direccion (Composición).
     */
    public EncargoSM3(String rut, String nombre, String telefono, Direccion direccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    // --- MÉTODOS GETTERS Y SETTERS ---

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * Sobrescritura del método toString().
     */
    @Override
    public String toString() {
        return "RUT: " + rut + " | Nombre: " + nombre + " | Teléfono: " + telefono + " | Dirección: [" + direccion.toString() + "]";
    }
}
