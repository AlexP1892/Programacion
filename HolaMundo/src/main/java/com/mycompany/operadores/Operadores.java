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
public class Operadores { 
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        float numUno, numDos, suma, resta, mult, div, resto;
        
        System.out.println("Digite dos numeros:");
        numUno = entrada.nextFloat();
        numDos = entrada.nextFloat();
        
        suma = numUno + numDos;
        
        resta = numUno - numDos;
                
        mult = numUno * numDos;

        div = numUno / numDos;
        
        resto = numUno % numDos;
        
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + mult);
        System.out.println("La division es: " + div);
        System.out.println("El resto es: " + resto);
    
      
        int x = 10, y;
        
        y = x++; 
                
        System.out.println(y);
        
        double raiz = Math.sqrt(9);
    }
    
}
