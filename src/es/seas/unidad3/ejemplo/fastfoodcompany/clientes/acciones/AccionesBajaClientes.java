/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.seas.unidad3.ejemplo.fastfoodcompany.clientes.acciones;

import es.seas.unidad3.ejemplo.fastfoodcompany.clientes.vistas.PanelBajaClientes;
import es.seas.unidad3.ejemplo.fastfoodcompany.model.entities.dao.ClienteDAO;

/**
 *
 * @author PerlaNegra
 */
public class AccionesBajaClientes {
    
    private final PanelBajaClientes panel;

    public AccionesBajaClientes(PanelBajaClientes panel) {
        this.panel=panel;
    }
    
    public void borrarCliente(){
        
        int Id = Integer.parseInt(panel.getTxtId().getText());
        ClienteDAO dao = new ClienteDAO();
        dao.delete(Id);
        }
}
