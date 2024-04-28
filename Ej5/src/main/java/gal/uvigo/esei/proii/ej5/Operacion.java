/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package gal.uvigo.esei.proii.ej5;

/**
 *
 * @author User
 */
public enum Operacion {
    SUMAR ('+'),
    RESTAR ('-'),
    MULTIPLICAR ('*'),
    DIVIDIR ('/');
    
    private final char signo;
    
    private Operacion(char signo){
        this.signo = signo;
    }
    
}
