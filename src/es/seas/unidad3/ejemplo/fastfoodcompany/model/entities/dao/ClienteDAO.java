/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.seas.unidad3.ejemplo.fastfoodcompany.model.entities.dao;

import es.seas.unidad3.ejemplo.fastfoodcompany.model.entities.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PerlaNegra
 */
public class ClienteDAO {
    
    private final String INSERT = "INSERT INTO clientes(primerApellido,segundoApellido,nombre) VALUES(?,?,?)";
    private final String DELETE = "DELETE FROM clientes WHERE id = ?";
    private final String UPDATE = "UPDATE clientes SET nombre = ?, primerApellido = ?, segundoApellido =? WHERE id = ?";
    private final String SELECT_ALL = "SELECT * FROM clientes";
    
    public void insert(Cliente cliente){
        Connection connection = es.seas.unidad3.ejemplo.fastfoodcompany.principal.MysqlConnectionFF.getConnection();
        PreparedStatement query;
        try {
            query = connection.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
            query.setString(1, cliente.getApellido1());
            query.setString(2, cliente.getApellido2());
            query.setString(3, cliente.getNombre());
            query.execute();
            ResultSet rs = query.getGeneratedKeys();
            while(rs.next()){
                cliente.setId((rs.getInt(1)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delete(int id){
        try {
            Connection connection = es.seas.unidad3.ejemplo.fastfoodcompany.principal.MysqlConnectionFF.getConnection();
            PreparedStatement query = connection.prepareStatement(DELETE);
            query.setInt(1, id);
            query.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void update(Cliente cliente){
        Connection connection = es.seas.unidad3.ejemplo.fastfoodcompany.principal.MysqlConnectionFF.getConnection();
        PreparedStatement query;
        try {
            query = connection.prepareStatement(UPDATE);
            query.setString(1, cliente.getNombre());
            query.setString(2, cliente.getApellido1());
            query.setString(3, cliente.getApellido2());
            query.setInt(4, cliente.getId());
                query.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Cliente> findAll() throws SQLException{
        List<Cliente> clientes = new ArrayList<>();
        Connection connection = es.seas.unidad3.ejemplo.fastfoodcompany.principal.MysqlConnectionFF.getConnection();
        PreparedStatement query = connection.prepareStatement(SELECT_ALL);
        ResultSet rs = query.executeQuery();
        while(rs.next()){
            clientes.add(bind(rs));
        }
        return clientes;
    }
    
    private Cliente bind(ResultSet rs) {
        try {
            Cliente cliente = new Cliente(rs.getInt("id"), rs.getString("nombre"),
                    rs.getString("primerApellido"),
                    rs.getString("segundoApellido"));
            return cliente;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}