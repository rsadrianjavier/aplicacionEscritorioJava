/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.seas.unidad3.ejemplo.fastfoodcompany.model.entities;

/**
 *
 * @author PerlaNegra
 */
public class Cliente {
    private int id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    
    public Cliente() {
        this.id=0;
    }

    public Cliente(int id) {
        this.id = id;
    }

    
    public Cliente(int id, String nombre, String apellido1, String apellido2) {
        this.id = id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    @Override
    public String toString() {
        return getId()+".-"+getApellido1()+" "+getApellido2()+", "+getNombre();
    }
    
    
}

