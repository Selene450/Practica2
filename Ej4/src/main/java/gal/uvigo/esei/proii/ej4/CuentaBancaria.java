/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gal.uvigo.esei.proii.ej4;

/**
 *
 * @author User
 */
public class CuentaBancaria {
    private double saldo;
    
    public CuentaBancaria(double saldoInicial){
        if(saldoInicial > 0){
            this.saldo = saldoInicial;
        }else{
            System.err.println("No se permite crear cuenta con saldo negativo");
        }
        
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if(saldo > 0){
            this.saldo = saldo;
        }else{
            System.err.println("No se permite tener saldo negativo.");
        }
        
    }
    
    public void ingresar(double ingreso){
        if(ingreso < 0){
            System.err.println("No se permite ingresar saldo negativo.");
        }else{
            setSaldo(this.saldo + ingreso);
        }
    }
    
    public void retirar(double cantidadRetirada){
        if(cantidadRetirada < 0 || cantidadRetirada > this.saldo){
            System.err.println("Cantidad inválida");
        } else{
            setSaldo(this.saldo - cantidadRetirada);
        }
    }
    
    
}
