/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entradadatosventana;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class EntradaDatosVentana {
    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;
    
        cadena = JOptionPane.showInputDialog("Digite una cadena: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite a un entero: "));
        letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: "));
        
        
        JOptionPane.showMessageDialog(null, "La cadena es: " + cadena);
        JOptionPane.showMessageDialog(null, "El numero entero es: " + entero);
        JOptionPane.showMessageDialog(null, "El caracter es: " + letra);
        JOptionPane.showMessageDialog(null, "El decimal es: " + decimal);
    }
}