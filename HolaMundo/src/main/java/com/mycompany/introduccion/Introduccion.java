/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.introduccion;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Introduccion {
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        int numero;
        float numerod;
        double numeroU;
        
        String cadena;
        char caracter;
        System.out.print("Ingrese un numero: ");
        numero = entradaDatos.nextInt();
        System.out.println("El numero ingresado es: " + numero);
        
        System.out.print("Ingrese un numero float: "); //Para ingresar un numero float se lo hace con coma ","
        numerod = entradaDatos.nextFloat();
        System.out.println("El numero ingresado es: " + numerod);
        
        System.out.print("Ingrese un numero double: ");
        numeroU = entradaDatos.nextDouble();
        System.out.println("El numero ingresado es: " + numeroU);
        
        System.out.print("Digite una cadena: ");
        cadena = entradaDatos.nextLine();
        System.out.println("La cadena es: " + cadena);
        
        System.out.print("Ingrese un caracter : ");
        caracter = entradaDatos.next().charAt(0);
        System.out.println("El caracter es: " + caracter);
    
    }
    
}
