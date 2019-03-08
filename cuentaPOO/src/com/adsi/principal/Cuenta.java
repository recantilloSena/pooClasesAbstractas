/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adsi.principal;

/**
 *
 * @author Ricardo
 */
public class Cuenta {
 private String numero;
 private String tipo;
 private double saldoActual;
 private double saldoMinimo;
 private double valorInicial;

    public Cuenta() {
    }

    public Cuenta(String numero, String tipo, double valorInicial) {
        this.numero = numero;
        this.tipo = tipo;
        this.valorInicial = valorInicial;
        this.saldoMinimo = valorInicial * 0.1;
        this.saldoActual = valorInicial;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }
 
    
    public void consigar(double monto) {
        this.saldoActual = this.saldoActual + monto;        
    }
    
    public void retirar(double monto) {
        
        if (monto <= this.saldoActual - this.saldoMinimo){
            this.saldoActual = this.saldoActual - monto;
        }else {
            this.saldoActual =  this.saldoMinimo;
        }
     
        
    }
    
 public double getCapacidadDeCredito(){
     
     switch(this.tipo) {
        case "ahorro":
          // code block
           return  this.saldoActual - this.saldoMinimo;
         
        case "credito":
          // code block
           return this.saldoActual * 3; 
         
        default:
          // code block
            return 0.0;
      }
     
 }
    
    
}
