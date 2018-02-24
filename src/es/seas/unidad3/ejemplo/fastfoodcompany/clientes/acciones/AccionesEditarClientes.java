/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.seas.unidad3.ejemplo.fastfoodcompany.clientes.acciones;

import es.seas.unidad3.ejemplo.fastfoodcompany.clientes.vistas.PanelEditarClientes;
import es.seas.unidad3.ejemplo.fastfoodcompany.model.entities.Cliente;
import es.seas.unidad3.ejemplo.fastfoodcompany.model.entities.dao.ClienteDAO;

/**
 *
 * @author PerlaNegra
 */
public class AccionesEditarClientes {

    private final PanelEditarClientes panel;

    public AccionesEditarClientes(PanelEditarClientes panel) {
        this.panel=panel;
    }
    
    public void modificarCliente(){
        Cliente cliente = new Cliente(Integer.parseInt(panel.getTxtId().getText()));
        cliente.setNombre(panel.getTxtNombre().getText());
        cliente.setApellido1(panel.getTxtApellido1().getText());
        cliente.setApellido2(panel.getTxtApellido2().getText());
        ClienteDAO dao = new ClienteDAO();
        dao.update(cliente);
        System.out.println(cliente);
    }
}
