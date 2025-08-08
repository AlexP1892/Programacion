/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fis.poo.calculadorabas;
import fis.poo.calculadorabas.modelo.CalculadoraModelo;
import fis.poo.calculadorabas.controlador.CalculadoraControlador;
import fis.poo.calculadorabas.vista.CalculadoraVista;


/**
 *
 * @author Alex
 */
public class CalculadoraBas {
  

    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(() -> {
            CalculadoraVista vista = new CalculadoraVista();
            CalculadoraModelo modelo = new CalculadoraModelo();
            CalculadoraControlador controlador = new CalculadoraControlador(modelo, vista);
            
            javax.swing.JFrame frame = new javax.swing.JFrame("Calculadora Básica");
            frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
            frame.setContentPane(vista);  
            frame.pack();                
            frame.setLocationRelativeTo(null); 
            frame.setVisible(true);
        });
        }
}