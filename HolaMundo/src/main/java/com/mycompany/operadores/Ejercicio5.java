/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.operadores;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Ejercicio5 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        double notaF, participacion, primerParcial, segundoParcial, examen;
        
        System.out.print("Ingrese la calificacion de participacion: ");
        participacion = entrada.nextDouble();
        
        System.out.print("Ingrese la nota del primer parcial: ");
        primerParcial = entrada.nextDouble();
        
        System.out.print("Ingrese la nota del segundo parcial: ");
        segundoParcial = entrada.nextDouble();
        
        System.out.print("Ingrese la nota del examen: ");
        examen = entrada.nextDouble();
        
        participacion *= 0.10;
        primerParcial *= 0.25;
        segundoParcial *= 0.25;
        examen = 0.40;
        
        notaF = participacion + primerParcial + segundoParcial + examen;
        
        System.out.println("La nota final es: " + notaF);
    }
}
