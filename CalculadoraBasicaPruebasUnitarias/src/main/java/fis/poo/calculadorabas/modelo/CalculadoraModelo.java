/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fis.poo.calculadorabas.modelo;

/**
 *
 * @author Alex
 */
public class CalculadoraModelo {
    private float numeroUno;
    private float numeroDos;
    private String operacion;
    private float resultado;

    public void setNumeroUno(float numeroUno) {
        this.numeroUno = numeroUno;
    }

    public void setNumeroDos(float numeroDos) {
        this.numeroDos = numeroDos;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
    
    public void calcular(){
        switch(operacion){
            case "+":
                resultado = numeroUno + numeroDos;
                break;
            case "-":
                resultado = numeroUno - numeroDos;
                break;
            case "*":
                resultado = numeroUno * numeroDos;
                break;
            case "/":
                if (numeroDos == 0){
                    throw new ArithmeticException("Division por cero");
                }
                resultado = numeroUno / numeroDos;
                break;
            case "^":
                resultado = (float) Math.pow(numeroUno, numeroDos);
                break;
            case "√":
                if(numeroUno < 0){
                    throw new ArithmeticException("No existe raiz de un numero negativo");
                }
                resultado = (float) Math.sqrt(numeroUno);
                break;
            default:
                throw new IllegalArgumentException("Operador invalido");
        }
    }
    
    public float sumar(float a, float b){
        return a + b;
    }
    
    public float restar(float a, float b){
        return a - b;
    }
    
    public float multiplicar(float a, float b){
        return a * b;
    }
    
    public float dividir(float a, float b) {    
        if(b ==0){
            throw new ArithmeticException("Division por cero");
        }
        return a / b;
    }
    
    public float potencia(float base, float exponente) {
        return (float) Math.pow(base, exponente);
    }

    public float raizCuadrada(float valor) {
        if (valor < 0) {
           throw new ArithmeticException("Raíz de número negativo"); 
        } 
        return (float) Math.sqrt(valor);
    }
    
    
    public float getResultado(){
        return resultado;
    }
    
}
