/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.operadores;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio6 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        
        int horasT, dias, semanas, horas;
        
        
        System.out.print("Ingrese el numero de horas:");
        horasT = entrada.nextInt();
        
        semanas = horasT / 168;
        dias = horasT % 168/ 24;
        horas = horasT % 24;
        
        System.out.println("El equivalente es: ");
        System.out.println("Semanas: " + semanas);
        System.out.println("Dias: " + dias);
        System.out.println("Horas: " + horas);
    }
    
}
