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
public class Ejercicio4 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int salario = 1000, comisionC = 150, carrosV, comisionT;
        
        double salarioTotal, valorVentas, comisionV;
        
        System.out.print("Ingrese la cantidad de carros vendidos por el vendedor: ");
        carrosV = entrada.nextInt();
        System.out.print("Ingrese el valor de los autos vendidos: ");
        valorVentas = entrada.nextFloat();
        
        comisionT = comisionC * carrosV;
        comisionV = valorVentas * 0.05;
        salarioTotal = salario + comisionT + comisionV;
        
        System.out.println("El salario total es: " + salarioTotal);
     
        
        
    }
}
