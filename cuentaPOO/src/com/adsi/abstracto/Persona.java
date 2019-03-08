/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adsi.abstracto;

/**
 *
 * @author Ricardo
 */
public class Persona extends Cliente{

     private String cedula;
     private int edad;

    public Persona(String nombre) {
        super(nombre);
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    String obtIdentificacion() {
        return this.getCedula();
    }
     
    void cumplirAños( ){
        edad = edad +1;
    } 
     
    
    
}
