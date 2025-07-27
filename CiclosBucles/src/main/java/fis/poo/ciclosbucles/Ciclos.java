/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fis.poo.ciclosbucles;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Ciclos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i = 1, contador;
        
        System.out.println("Digite cuantos numeros quiere en pantalla");
        contador = entrada.nextInt();
        
        while(i <= contador){
            System.out.println(i); 
            i++; // i = i+1
        }
    }
}
