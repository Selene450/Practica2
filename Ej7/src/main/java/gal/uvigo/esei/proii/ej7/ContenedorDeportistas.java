/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gal.uvigo.esei.proii.ej7;

/**
 *
 * @author User
 */
public class ContenedorDeportistas {
    private Deportista[] contenedor;
    int numElem;

    public ContenedorDeportistas(int capacidad) {
        this.contenedor = new Deportista[capacidad];
        numElem = 0;
    }
    
    public int getNumElem(){
        return numElem;
    }
    
    public int getCapacidad(){
        return contenedor.length;
    }
    
    public void insertarDeportista(Deportista d){
        if(numElem == contenedor.length){
            System.out.println("Contenedor lleno");
        } else{
            contenedor[numElem] = d;
            numElem ++;
        }
    }
    
    public Deportista obtenerDeportista(int pos){
        if(pos < 0 || pos > contenedor.length){
            System.out.println("Posición inválida");
            return null;
        }else{
            Deportista toret;
            toret = contenedor[pos];
            return toret;
        }
       
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Contenedor: ");
        for (int i = 0; i < contenedor.length; i++) {
            sb.append(contenedor[i]).append("\n");
        }
        return sb.toString();
    }
    
    
    
    
}
