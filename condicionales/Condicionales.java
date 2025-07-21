/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex 
 */
public class Condicionales {
    public static void main(String [] args){
       /* int numero, dato = 5;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        System.out.println("Adivina y escribe un numero del 1 al 5");
        if(numero == dato){
           JOptionPane.showMessageDialog(null, "Adivinaste el numero");;
        }else{
           JOptionPane.showMessageDialog(null, "Numero incorrecto");
        }*/
       
       int dato = 6;
       
       dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre 1-5"));
       
       switch(dato){
           case 1: JOptionPane.showMessageDialog(null, "El numero es 1");
           break;
           case 2: JOptionPane.showMessageDialog(null, "El numero es 2");
           break;
           case 3: JOptionPane.showMessageDialog(null, "El numero es 3");
           break;
           case 4: JOptionPane.showMessageDialog(null, "El numero es 4");
           break;
           case 5: JOptionPane.showMessageDialog(null, "El numero es 5");
           break;
           default: JOptionPane.showMessageDialog(null, "El numero no esta en el rango");
       }
       
    }
    
}
