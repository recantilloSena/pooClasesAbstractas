package com.adsi.principal;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
             
        
        Cuenta cuaentaRECC = new Cuenta("123", "crédito",200000 );
        
        
        cuaentaRECC.consigar(300000);
        
        cuaentaRECC.retirar(500000);
        
        
        
        System.out.println("Saldo = " + cuaentaRECC.getSaldoActual() );
        System.out.println("Capacidad de crédito = " + cuaentaRECC.getCapacidadDeCredito());
        
        
        
        
    }
    
}
