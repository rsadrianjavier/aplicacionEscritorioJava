package es.seas.unidad3.ejemplo.fastfoodcompany.clientes.vistas;

import es.seas.unidad3.ejemplo.fastfoodcompany.clientes.acciones.AccionesBajaClientes;
import es.seas.unidad3.ejemplo.fastfoodcompany.principal.FastFoodCompanyFrame;
import javax.swing.JTextField;

/**
 *
 * @author PerlaNegra
 */
public class PanelBajaClientes extends javax.swing.JPanel {

    private FastFoodCompanyFrame frame;
    private final AccionesBajaClientes acciones;
    
    /**
     * Creates new form PanelBajaClientes
     * @param frame FastFoodCompanyFrame
     */
    public PanelBajaClientes(FastFoodCompanyFrame frame){
        initComponents();
        this.frame=frame;
        this.acciones=new AccionesBajaClientes(this);
    }

    public FastFoodCompanyFrame getFrame() {
        return frame;
    }

    public void setFrame(FastFoodCompanyFrame frame) {
        this.frame = frame;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBaja = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();

        setLayout(null);

        btnBaja.setText("Dar de baja");
        btnBaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBajaMouseClicked(evt);
            }
        });
        add(btnBaja);
        btnBaja.setBounds(89, 133, 180, 30);

        lblId.setText("Id cliente");
        add(lblId);
        lblId.setBounds(90, 40, 64, 14);
        add(txtId);
        txtId.setBounds(150, 40, 120, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBajaMouseClicked
        acciones.borrarCliente();
    }//GEN-LAST:event_btnBajaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBaja;
    private javax.swing.JLabel lblId;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
