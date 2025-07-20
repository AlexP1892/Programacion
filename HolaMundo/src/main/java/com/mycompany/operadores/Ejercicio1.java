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
public class Ejercicio1 {
    public static void main(String [] args){
        float  nota1, nota2, nota3, notaf;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese la primera nota: ");
        nota1 = entrada.nextFloat();
        System.out.print("Ingrese la segunda nota: "); 
        nota2 = entrada.nextFloat();
        System.out.print("Ingrese la tercera nota: ");
        nota3 = entrada.nextFloat();
        
        notaf = nota1 + nota2 + nota3;
        System.out.print("La nota final es: " + notaf);
        
    }
}