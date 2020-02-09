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
public class Actividad2 {

    public static void main(String[] args) {

        var ProyectoA = 20000;
        var ProyectoB = 10000;
        var ProyectoX = 5000;
        var hora = 8;
        var mes = 30;

        System.out.println("Valor hora dia Modalidad A: " + ProyectoA);
        System.out.println("Valor hora dia Modalidad B: " + ProyectoB);
        System.out.println("Valor hora dia otro : " + ProyectoX);

        var SueldoDiaA = ProyectoA * hora;
        var SueldoMensualA = SueldoDiaA * mes;
        System.out.println("Valor mensual Modalidad A: " + SueldoMensualA);

        var SueldoDiaB = ProyectoB * hora;
        var SueldoMensualB = SueldoDiaB * mes;
        System.out.println("Valor mensual Modalidad B: " + SueldoMensualB);

        var SueldoDiaX = ProyectoX * hora;
        var SueldoMensualX = SueldoDiaX * mes;
        System.out.println("Valor mensual otro: " + SueldoMensualX);

        var IncrementoA = 0.06;
        var SueldoIncrementoA = ProyectoA * IncrementoA;
        var SueldoDiaIncrementoA = ProyectoA + SueldoIncrementoA;
        var SueldoFinalA = SueldoDiaIncrementoA + SueldoMensualA;
        System.out.println("Valor de la hora Extra del Proyecto A: " + SueldoDiaIncrementoA);

        if (SueldoMensualA > 1500000) {
            System.out.println("El Salario Proyecto A es mayor al tope máx&imo");
        } else if (SueldoMensualA < 1500000) {
            System.out.println("El salario es de: " + SueldoFinalA);
        }

        var IncrementoB = 0.06;
        var SueldoIncrementoB = ProyectoB * IncrementoB;
        var SueldoDiaIncrementoB = ProyectoB + SueldoIncrementoB;
        var SueldoFinalB = SueldoDiaIncrementoB + SueldoMensualB;
        System.out.println("Valor de la hora Extra del Proyecto B: " + SueldoDiaIncrementoB);

        if (SueldoMensualB > 1500000) {
            System.out.println("El Salario de Proyecto B es mayor al tope máximo");
        } else if (SueldoMensualB < 1500000) {
            System.out.println("El salario es de: " + SueldoFinalB);
        }

        var IncrementoX = 0.06;
        var SueldoIncrementoX = ProyectoX * IncrementoX;
        var SueldoDiaIncrementoX = ProyectoX + SueldoIncrementoX;
        var SueldoFinalX = SueldoDiaIncrementoX + SueldoMensualX;
        System.out.println("Valor de la hora Extra de otro proyecto: " + SueldoDiaIncrementoX);

        if (SueldoMensualX > 1500000) {
            System.out.println("El Salario de otro proyecto es mayor al tope máximo");
        } else if (SueldoMensualX < 1500000) {
            System.out.println("El salario es de: " + SueldoFinalX);
        }

    }

}
