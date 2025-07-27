/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fis.poo.ciclosbucles;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ciclos2 {
    public static void main(String[] args) {
        int i = 1, contador;
         
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite la cantidad de terminos: ");
        
        contador = entrada.nextInt();
        
        do{
            System.out.println(i);
            i++;
        }while(i <= contador);
     }
}
