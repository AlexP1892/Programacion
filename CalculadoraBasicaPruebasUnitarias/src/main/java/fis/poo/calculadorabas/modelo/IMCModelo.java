/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fis.poo.calculadorabas.modelo;

/**
 *
 * @author Alex
 */
public class IMCModelo {
    private String peso;
    private String altura;
    private String imc;
    
     public boolean validarInput(String input) {
        return input.matches("^\\d+(\\.\\d+)?$");
    }

    public float calcularIMC(float peso, float altura) {
        if (altura <= 0){
            throw new ArithmeticException("Altura inválida");
        }
        return peso / (altura * altura);
    }
    
    public String IMC(float imc) {
        if (imc < 18.5) return "Bajo peso";
        else if (imc < 24.9) return "Normal";
        else if (imc < 29.9) return "Sobrepeso";
        else return "Obesidad";
    }
}
