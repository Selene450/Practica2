/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gal.uvigo.esei.proii.ej2;

/**
 *
 * @author User
 */
public class Articulo {
    private String nombre;
    private double precioBase;
    private TipoIVA iva;
    
    public Articulo(String nombre, double precioBase, TipoIVA iva){
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.iva = iva;
    }
    
    public double calcularPrecioFinal(){
        return iva.aplicarIva(this.precioBase);
    }
}
