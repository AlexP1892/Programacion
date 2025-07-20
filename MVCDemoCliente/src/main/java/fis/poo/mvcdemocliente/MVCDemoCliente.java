package fis.poo.mvcdemocliente;

import fis.poo.Controller.ClienteController;
import fis.poo.Model.ClienteModel;
import fis.poo.View.ClienteViewGUI;

/**
 *
 * @author Richard
 */
public class MVCDemoCliente {

    public static void main(String[] args) {
        
        
        ClienteViewGUI viewCliente = new ClienteViewGUI();
        ClienteModel modelCliente = llenarDatosCliente();
        
        //se crea el controlador y se pasa el modelo y la vista
        ClienteController controllerCliente = new ClienteController(modelCliente, viewCliente);
        
        viewCliente.setVisible(true);
        controllerCliente.actualizarView();
        
        
    }
    
    private static ClienteModel llenarDatosCliente(){
        ClienteModel modelCliente = new ClienteModel();
        modelCliente.setId(1);
        modelCliente.setApellido("Guevara");
        modelCliente.setNombre("Carlos");
        return modelCliente;
    }
}
