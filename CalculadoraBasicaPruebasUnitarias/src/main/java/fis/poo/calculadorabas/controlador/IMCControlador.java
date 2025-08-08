/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fis.poo.calculadorabas.controlador;
import fis.poo.calculadorabas.modelo.IMCModelo;
import fis.poo.calculadorabas.vista.IMC;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 *
 * @author Alex
 */
public class IMCControlador {
    private IMCModelo modelo;
    private IMC vista;
    
    public IMCControlador(IMCModelo modelo, IMC vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.addCalcular(new CalcularListener());
    }
    
    class CalcularListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                float peso = Float.parseFloat(vista.getPeso());
                float altura = Float.parseFloat(vista.getAltura());
                float imc = modelo.calcularIMC(peso, altura);
                String resultado = modelo.IMC(imc);
                vista.setResultado(String.format("IMC: %.2f (%s)", imc, resultado));
            } catch (NumberFormatException ex) {
                vista.mostrarError("Por favor ingrese números válidos.");
            } catch (IllegalArgumentException ex) {
                vista.mostrarError(ex.getMessage());
            }
        }
    }
}
