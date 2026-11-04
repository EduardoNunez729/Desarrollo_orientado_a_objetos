/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author enune
 */
public class Direccion {
    // Atributos privados (encapsulamiento)
    private String calle;
    private String ciudad;
    private String region;

    /**
     * Constructor por defecto (valores iniciales).
     */
    public Direccion() {
        this.calle = "Sin Calle";
        this.ciudad = "Llanquihue";
        this.region = "Los Lagos";
    }

    /**
     * Constructor parametrizado.
     * 
     * @param calle Calle y número.
     * @param ciudad Ciudad o comuna.
     * @param region Región de residencia.
     */
    public Direccion(String calle, String ciudad, String region) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.region = region;
    }

    // --- MÉTODOS DE ACCESO (GETTERS Y SETTERS) ---

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Sobrescritura del método toString() para retornar una salida legible.
     */
    @Override
    public String toString() {
        return calle + ", " + ciudad + ", " + region;
    }
}