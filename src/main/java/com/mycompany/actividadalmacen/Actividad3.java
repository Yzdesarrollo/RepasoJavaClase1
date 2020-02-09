/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.actividadalmacen;

import java.util.Scanner;

/**
 *
 * @author yeison.ariel
 */
public class Actividad3 {
    public static void main(String[] args) {
        
        var TarifaIndividual = 2500;
        var TarifaDoble = 4600;
        var TarifaFamiliar = 5200;
        
        System.out.println("Ingrese los dias Tarifa Individual:");
        var ejemploescaner1 = new Scanner(System.in);   
        var diasIndividual = Integer.parseInt(ejemploescaner1.nextLine());
        var huesped1 = diasIndividual * TarifaIndividual;
        var porcentaje1 = 0.05;
        var descuento1 = huesped1 * porcentaje1;
        var descuentoFinal1 = huesped1 + descuento1;
        System.out.println("El precio de Tarifa Individual es de: " + descuentoFinal1);
        
        System.out.println("Ingrese los dias Tarifa Doble:");
        var ejemploescaner2 = new Scanner(System.in);   
        var diasDoble = Integer.parseInt(ejemploescaner2.nextLine());
        var huesped2 = diasDoble * TarifaDoble;
        var porcentaje2 = 0.09;
        var descuento2 = huesped2 * porcentaje2;
        var descuentoFinal2 = huesped2 + descuento2;
        System.out.println("El precio de Tarifa Individual es de: " + descuentoFinal2);
        
        System.out.println("Ingrese los dias Tarifa Familiar:");
        var ejemploescaner3 = new Scanner(System.in);   
        var diasFamiliar = Integer.parseInt(ejemploescaner3.nextLine());
        var huesped3 = diasFamiliar * TarifaFamiliar;
        var porcentaje3 = 0.15;
        var descuento3 = huesped3 * porcentaje3;
        var descuentoFinal3 = huesped3 + descuento3;
        System.out.println("El precio de Tarifa Familiar es de: " + descuentoFinal3);
    }
    
}
