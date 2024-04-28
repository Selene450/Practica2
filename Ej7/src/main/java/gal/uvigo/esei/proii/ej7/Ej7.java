/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package gal.uvigo.esei.proii.ej7;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Ej7 {

    public static void main(String[] args) {
        
    }
    
    public Deportista leerDeportista(){
        String dni = leerCadena("Introduce el dni: ");
        String nombre = leerCadena("Introduce el nombre: ");
        Categoria miCategoria = leerCategoria();
        
        Deportista d = new Deportista(dni, nombre, miCategoria);
        return d;
    }
    
    public String leerCadena(String msg){
        Scanner leer = new Scanner(System.in);
        System.out.println(msg);
        String toret;
        do{
            toret = leer.nextLine();
        }while(toret == null);
        
        return toret;
    }
    
    public Categoria leerCategoria(){
        Scanner leer = new Scanner(System.in);
        int toret;
        Categoria[] categoria = Categoria.values();
        for (int i = 0; i < categoria.length; i++) {
            System.out.println(i + " " + categoria[i]);
        }
        do{
            toret = leer.nextInt();
        }while (toret < 0 && toret > categoria.length);
        
        return categoria[toret];
        
    }
}
