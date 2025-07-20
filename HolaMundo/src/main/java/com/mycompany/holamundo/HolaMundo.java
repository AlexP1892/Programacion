/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.holamundo;

/**
 *
 * @author Alex
 */
public class HolaMundo {
    // Dinos onichan
    public static void main(String[] args) {
        System.out.println("Hola, mi nombre es Alex");
        System.out.println("Me gustan las que no tienen papa");
        System.out.println("Viva el Ecuador!"); 
        System.out.println("Je vais partir au Brésil le mois prochain");
        //Datos primitivos
        byte enteroUno = 12;
        int numUno = 2;
        int numDos = 1;
        int resultado;
        
        short numTres = 14;
        float numCuatro = 45041.101f;
        double numCinco = 415165.15485;
        
        char caracterUno = 'a';
        boolean decisionU = true;
        
         
        resultado = numUno + numDos;
        System.out.println(resultado);
        
        System.out.println("El numero short es: " + numTres);
        System.out.println("El numero float es: " + numCuatro);
        System.out.println("El numero double es: " + numCinco);
        System.out.println("Caracter: " + caracterUno);
        System.out.println("La decision es: " + decisionU);
        
        
        //Datos no primitivos
        Integer numero = null;
        System.out.println("El numero es: " + numero);  
       
        String cadenaUno = "ada";
        System.out.println("La cadena es: " + cadenaUno);
    }
}
