/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package gal.uvigo.esei.proii.ej2;

/**
 *
 * @author User
 */
public enum TipoIVA { 
  GENERAL (0.21),
  REDUCIDO (0.10), 
  SUPERREDUCIDO (0.04), 
  EXENTO (0.0);
  
  private final double iva;
  
  private TipoIVA(double iva){
      this.iva = iva;
  }
  public double getIva(){
      return this.iva;
  }
  public double aplicarIva(double precio){
      return precio * (1 + getIva());
  }
  
  
}
