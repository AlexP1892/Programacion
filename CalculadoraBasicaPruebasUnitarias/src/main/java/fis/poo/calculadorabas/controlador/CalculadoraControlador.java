/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fis.poo.calculadorabas.controlador;
import fis.poo.calculadorabas.modelo.CalculadoraModelo;
import fis.poo.calculadorabas.vista.CalculadoraVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author Alex
 */
public class CalculadoraControlador {
    private CalculadoraModelo modelo;
    private CalculadoraVista vista;
    
    public CalculadoraControlador(CalculadoraModelo modelo, CalculadoraVista vista){
        this.modelo = modelo;
        this.vista = vista;
        
        vista.addNumberListener(new NumberListener());
        vista.addOperatorListener(new OperatorListener()); 
        vista.addClearListener(new ClearListener());       
        vista.addEqualListener(new EqualListener());
        vista.addIMCListener(new IMCListener());

    }
    
    
    class IMCListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        fis.poo.calculadorabas.vista.IMC imc = new fis.poo.calculadorabas.vista.IMC();
        fis.poo.calculadorabas.modelo.IMCModelo imcModelo = new fis.poo.calculadorabas.modelo.IMCModelo();
        fis.poo.calculadorabas.controlador.IMCControlador imcControlador = new fis.poo.calculadorabas.controlador.IMCControlador(imcModelo, imc);
        imc.setVisible(true);
    }
}
    
    
    class NumberListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String currentText = vista.getDisplayText();
            String input = e.getActionCommand();
            if (input.equals(".") && currentText.contains(".")) {
                return; 
            }
            vista.setDisplayText(currentText + input);
        }
    }
    class OperatorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                float numeroUno = Float.parseFloat(vista.getDisplayText());
                modelo.setNumeroUno(numeroUno);
                modelo.setOperacion(e.getActionCommand());
                vista.setDisplayText("");
            } catch (NumberFormatException ex) {
                vista.showError("Por favor, ingrese un número válido");
            }
        }
    }

    class ClearListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            vista.setDisplayText("");
        }
    }

    class EqualListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                float numeroDos = Float.parseFloat(vista.getDisplayText());
                modelo.setNumeroDos(numeroDos);
                modelo.calcular();
                vista.setDisplayText(Float.toString(modelo.getResultado()));
            } catch (NumberFormatException ex) {
                vista.showError("Por favor, ingrese un número válido");
            } catch (ArithmeticException ex) {
                vista.showError(ex.getMessage());
            } catch (IllegalArgumentException ex) {
                vista.showError(ex.getMessage());
            }
        }
    }
}
