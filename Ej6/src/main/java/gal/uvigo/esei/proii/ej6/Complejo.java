/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gal.uvigo.esei.proii.ej6;

/**
 *
 * @author User
 */
public class Complejo {
    private int[] complejo;

    public Complejo(int a, int b) {
        this.complejo = new int[2];
        complejo[0] = a;
        complejo[1] = b;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(complejo[0]).append(" + ");
        sb.append(complejo[1]).append('i');
        return sb.toString();
    }
    
    
}
