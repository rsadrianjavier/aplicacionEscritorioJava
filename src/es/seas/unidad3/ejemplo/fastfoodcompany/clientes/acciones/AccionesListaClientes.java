package es.seas.unidad3.ejemplo.fastfoodcompany.clientes.acciones;

import es.seas.unidad3.ejemplo.fastfoodcompany.clientes.vistas.PanelListaClientes;
import es.seas.unidad3.ejemplo.fastfoodcompany.model.entities.Cliente;
import es.seas.unidad3.ejemplo.fastfoodcompany.model.entities.dao.ClienteDAO;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;


/**
 *
 * @author PerlaNegra
 */
public class AccionesListaClientes {

    private final PanelListaClientes panel;
    private final ClienteDAO dao = new ClienteDAO();
    private List<Cliente> clientes;
    
    public AccionesListaClientes(PanelListaClientes panel) {
        this.panel = panel;
    }
    
    /**
     * Metodo que convierte el ArrayList clientes en DefaultListModel
     * @return DefaultListModel modelo
     */
    public DefaultListModel<String> listarClientes(){
        DefaultListModel<String> modelo = new DefaultListModel<>();
        try {
            clientes = dao.findAll();
        } catch (SQLException ex) {
            Logger.getLogger(AccionesListaClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(int i=0;i<clientes.size();i++){
            modelo.addElement("Id."+clientes.get(i).getId()+
                    " - "+clientes.get(i).getApellido1()+
                    " "+clientes.get(i).getApellido2()+
                    ", "+clientes.get(i).getNombre());
        }
        return modelo;
    }
    
}
