/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.seas.unidad3.ejemplo.fastfoodcompany.clientes.acciones;

import es.seas.unidad3.ejemplo.fastfoodcompany.clientes.vistas.PanelAltaClientes;
import es.seas.unidad3.ejemplo.fastfoodcompany.model.entities.Cliente;
import es.seas.unidad3.ejemplo.fastfoodcompany.model.entities.dao.ClienteDAO;
import java.util.ArrayList;

/**
 *
 * @author PerlaNegra
 */
public class AccionesAltaClientes {

    private final PanelAltaClientes panel;

    public AccionesAltaClientes(PanelAltaClientes panel) {
        this.panel=panel;
    }
    
    public void guardarCliente(){
        
        Cliente cliente = new Cliente();
        cliente.setNombre(panel.getTxtNombre().getText());
        cliente.setApellido1(panel.getTxtApellido1().getText());
        cliente.setApellido2(panel.getTxtApellido2().getText());
        ClienteDAO dao = new ClienteDAO();
        dao.insert(cliente);
        System.out.println(cliente);
        
//        ArrayList filaCliente = new ArrayList();
//        
//        filaCliente.add(panel.getTxtNombre().getText());
//        filaCliente.add(panel.getTxtApellido1().getText());
//        filaCliente.add(panel.getTxtApellido2().getText());
//        panel.getFrame().getClientesGuardados().add(filaCliente);
    }
    
}
