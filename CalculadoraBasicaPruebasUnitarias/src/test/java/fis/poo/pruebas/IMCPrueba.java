/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package fis.poo.pruebas;
import fis.poo.calculadorabas.modelo.IMCModelo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.CsvFileSource;

/**
 *
 * @author Alex
 */
public class IMCPrueba {
    
    private IMCModelo modelo = new IMCModelo();
    
    @ParameterizedTest
    @CsvSource({
       "70, 1.75, 22.86",
       "60, 1.60, 23.44",
       "80, 1.80, 24.69", 
    })
    void testIMC(float peso, float altura, float imcEsperado){
        double imc = modelo.calcularIMC(peso, altura);
        assertEquals(imcEsperado, Math.round(imc * 100.0) / 100.0, 0.01);
    }
    
}
