/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.encargodoo2;

/**
 *
 * @author enune
 */
public class EncargoDOO2 {

    public static void main(String[] args) {
         // Crear el objeto dueño
        Dueno responsable=new Dueno ("Felipe Vasquez","+56912345678","Av.siempre Viva,Valdivia");
        // Crear una mascota
        Mascota paciente=new Mascota("Stephi","Perro",12,responsable);

        // Mostrar informacion 
        System.out.println(paciente.toString());
    }
}
