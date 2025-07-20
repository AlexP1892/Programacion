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
public class Ejercicio2 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        float salarioT, salarioH;
        int horasTra;
        
        System.out.println("Ingrese las horas semanales trabajadas");
        horasTra = entrada.nextInt();
        
        System.out.println("Ingrese el salario por hora");
        salarioH = entrada.nextFloat();
        
        salarioT = salarioH * horasTra;
        
        System.out.print("El sueldo total de la semana es: " + salarioT);
        
    }
}
