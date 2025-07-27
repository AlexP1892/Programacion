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
public class CicloFor {
     public static void main(String[] args) {
        int numUno;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de terminos");
        numUno = entrada.nextInt();
         
        for(int i = 1; i <= numUno; i+=2){
             System.out.println(i);
         }
     }
}
