/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encargodoo2;

/**
 *
 * @author enune
 */
public class Dueno {
    //Atributos
    private String nombre;
    private String telefono;
    private String direccion;

    //constructor
    public Dueno(String nombre,String telefono,String direccion){
        this.nombre=nombre;
        this.telefono=telefono;
        this.direccion=direccion;
    }
    //Getter y Setter
    public String getNombre(){return nombre;}
    public void setNombre(String nmbre){this.nombre=nombre;}

    public String getTelefono(){return telefono;}
    public void setTelefono(String telefono){this.telefono=telefono;}

    public String getDireccion(){ return direccion;}
    public void setDireccion(String direccion){this.direccion=direccion;}

    @Override
    public String toString() {
        return "Dueno{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
