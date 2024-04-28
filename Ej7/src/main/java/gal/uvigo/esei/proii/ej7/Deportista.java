/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gal.uvigo.esei.proii.ej7;

/**
 *
 * @author User
 */
public class Deportista {
    private String dni;
    private String nombre;
    private Categoria miCategoria;

    public Deportista(String dni, String nombre, Categoria miCategoria) {
        this.dni = dni;
        this.nombre = nombre;
        this.miCategoria = miCategoria;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Deportista{");
        sb.append("dni=").append(dni);
        sb.append(", nombre=").append(nombre);
        sb.append(", miCategoria=").append(miCategoria);
        sb.append('}');
        return sb.toString();
    }
    
    
}
