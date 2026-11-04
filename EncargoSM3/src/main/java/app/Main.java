/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import model.EncargoSM3;
import model.Empleado;
import model.Direccion;

/**
 *
 * @author enune
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // 1. Crear objetos de composición
        Direccion dir1 = new Direccion("Costanera 450", "Puerto Varas", "Los Lagos");
        Direccion dir2 = new Direccion("O'Higgins 123", "Llanquihue", "Los Lagos");

        // 2. Crear al menos tres instancias de objetos [5]
        EncargoSM3 cliente = new EncargoSM3("12345678-9", "Fernanda López","+569999999", dir1);
        Empleado guia = new Empleado("98765432-1", "Juan Pérez", "+569888888", dir2, "Guía de Montaña");
        Empleado administrativo = new Empleado("11222333-4", "Ana María", "+56979997387", dir1, "Secretaria");

        // 3. Mostrar resultados por consola usando toString() [5, 8]
        System.out.println("--- DATOS DEL SISTEMA LLANQUIHUE TOUR ---");
        System.out.println(cliente.toString());
        System.out.println(guia.toString());
        System.out.println(administrativo.toString());
    }
    
}