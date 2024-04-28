/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package gal.uvigo.esei.proii.ej1;



/**
 *
 * @author User
 */
import java.util.Scanner;
public class Ej1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean seguir = true;
        Libro[] libro = new Libro[10];
        int numElem = 0;
        TipoLibro[] tipo = TipoLibro.values();
        
        Libro l = new Libro("Thinking in Java", "Bruce Eckel", "Prentice Hall", "0131872486", 2007, tipo[2]);
        libro[0] = l;
        numElem ++;
        
        while(numElem < 10){
            Libro lnuevo = leerLibroNuevo();
            libro[numElem] = lnuevo;   
        }
        for(int i = 0; i < libro.length; i++){
            System.out.println("Libro " + (i+1));
            System.out.println(libro[i]);
        }
    }
    
    public static Libro leerLibroNuevo(){
        String nombre = leerCadena("Introduce el título: ");
        String autores = leerCadena("Introduce los autores: ");
        String editorial = leerCadena("Introduce la editorial: ");
        String isbn = leerCadena("Introduce el isbn: ");
        int anho;
        do{
           anho = leerEntero("Introduce el año: "); 
        }while(anho < 0);
        
        TipoLibro genero = leerEnum();
        
        Libro l = new Libro(nombre, autores, editorial, isbn, anho, genero);
        return l;
        
    }
    
    public static String leerCadena(String msg){
        Scanner leer = new Scanner(System.in);
        System.out.println(msg);
        String toret;
        do{
            toret = leer.nextLine();
        }while(toret == null);
        
        return toret;
        
    }
    
    public static int leerEntero(String msg){
        Scanner leer = new Scanner(System.in);
        System.out.println(msg);
        String toret;
        int num = 0;
        boolean esValido;
        do{
            try{
                toret = leer.nextLine();
                num = Integer.parseInt(toret);
                esValido = true;
            }catch(NumberFormatException nf){
                esValido = false;
            }
            
        }while(!esValido);
        
        return num;
            
        
    }
    
    public static TipoLibro leerEnum(){
        TipoLibro[] tipo = TipoLibro.values();
        int toret;
        for(int i = 0; i < tipo.length; i++){
            System.out.println(i + ". " + tipo[i]);
        }
        do{
            toret = leerEntero("Introduce el número del género: ");
        }while(toret < 0 && toret > tipo.length);
        
        return tipo[toret];
    }
}
