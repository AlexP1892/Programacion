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
public class Ejercicio3 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        float gDol, jDol, lDol, total;
        
        System.out.println("Ingrese la cantidad de dinero que tiene Guillermo");
        gDol = entrada.nextFloat();
        
        lDol = gDol/2;
        
        jDol = (gDol + lDol)/2;
        
        total = gDol + jDol + lDol;
        System.out.println("La cantidad total es: "+ total);
    }
}
