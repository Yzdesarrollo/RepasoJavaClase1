/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.actividadalmacen;

/**
 *
 * @author yeison.ariel
 */
public class Actividad1 {
    
    public static void main(String[] args) {
        
         //Almacen WC 
        int zapatos = 350000;
        int tenis = 280000;
        int camisetas = 175000;
        int jeans = 200000;
        System.out.println("Los precios actuales de cada articulo son:"+ "\n"  + 
        "Zapatos: " + "\n" + zapatos + "\n" +"tenis: " + "\n" + tenis + "\n" 
                +"camisetas: " + "\n" + camisetas + "\n" + "Jeans: " + "\n" + jeans);
        
        int totalArticulos = zapatos + tenis + camisetas + jeans;
        System.out.println("Total articulos: " + totalArticulos);
        
        int promedio = totalArticulos / 4;
        System.out.println("El promedio de precios: "+promedio);
        
        var porcentajeZ = 0.008;
        var descuentoZ = zapatos * porcentajeZ;
        var descuentoFinalZ = zapatos - descuentoZ;
        System.out.println("Nuevo precio Zapatos: " + descuentoFinalZ);
        
        var porcentajeJ = 0.062;
        var descuentoJ = jeans * porcentajeJ;
        var descuentoFinalJ = jeans + descuentoJ;
        System.out.println("Nuevo precio Jeans: " + descuentoFinalJ);
        
    }
    
}
