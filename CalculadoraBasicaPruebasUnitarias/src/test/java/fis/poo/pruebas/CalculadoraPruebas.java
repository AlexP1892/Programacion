/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package fis.poo.pruebas;
import fis.poo.calculadorabas.modelo.CalculadoraModelo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;



public class CalculadoraPruebas {

    CalculadoraModelo modelo = new CalculadoraModelo();

    @ParameterizedTest
    @CsvSource({
        "2, 3, 5",
        "-1, 1, 0",
        "0, 0, 0",
        "10, 10, 20",
        "5, 2 , 7",
        
    })
    void testSumar(float a, float b, float esperado) {
        assertEquals(esperado, modelo.sumar(a, b));
    }

    @ParameterizedTest
    @CsvSource({
        "5, 3, 2",
        "0, 0, 0",
        "-5, -5, 0",
        "3, 2, 1",
        "5, 3, 2",
       
    })
    void testRestar(float a, float b, float esperado) {
        assertEquals(esperado, modelo.restar(a, b));
    }

    @ParameterizedTest
    @CsvSource({
        "2, 3, 6",  
        "-1, 1, -1",
        "0, 5, 0",
        "2, 4, 8",
        "4, 7, 28",
        
    })
    void testMultiplicar(float a, float b, float esperado) {
        assertEquals(esperado, modelo.multiplicar(a, b));
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/division.csv", numLinesToSkip = 1)
    void testDividir(float a, float b, float esperado) {
        assertEquals(esperado, modelo.dividir(a, b), 0.0001);
    }
    
    @ParameterizedTest
    @CsvSource({
        "2, 3, 8",
        "5, 0, 1",
        "9, 0.5, 3",
        "2, -1, 0.5",
        "-2, 2, 4"
    })
    void testPotenciacion(float base, float exponente, float esperado){
        assertEquals(esperado, modelo.potencia(base, exponente), 0.0001);
    }
    
    @ParameterizedTest
    @CsvSource({
       "36, 6",
       "16, 4",
       "25, 5",
       "49, 7",
       "100, 10"
    })
    void testRaiz(float valor, float esperado){
        assertEquals(esperado, modelo.raizCuadrada(valor), 0.0001);
    }
}   
