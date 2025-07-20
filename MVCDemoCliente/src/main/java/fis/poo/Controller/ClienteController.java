/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fis.poo.Controller;

import fis.poo.Model.ClienteModel;
import fis.poo.View.ClienteViewGUI;

/**
 *
 * @author User
 */
public class ClienteController {
    private ClienteViewGUI viewCliente;
    private ClienteModel modelCliente;
    
     //constructor para inicializar el modelo y la vista
    public ClienteController(ClienteModel modelCliente, ClienteViewGUI viewCliente){
        this.modelCliente = modelCliente;
        this.viewCliente = viewCliente;
        this.viewCliente.setController(this);
    }
    
    //getters y setters para el modelo
    public int getId(){
        return modelCliente.getId();
    }
    
    public void setId(int id){
        this.modelCliente.setId(id);
    }
    
    public String getNombre(){
        return modelCliente.getNombre();
    }
    
    public void setNombre(String nombre){
        this.modelCliente.setNombre(nombre);
    }
    
    public String getApellido(){
        return modelCliente.getApellido();
    }
    
    public void setApellido(String apellido){
        this.modelCliente.setApellido(apellido);
    }
    
    public void actualizarView(){
        viewCliente.mostrarDatosCliente(getId(), getNombre(), getApellido());
    }
     
}
    

