/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gal.uvigo.esei.proii.ej1;

/**
 *
 * @author User
 */
public class Libro {
    private String titulo;
    private String autores;
    private String editorial;
    private String isbn;
    private int anho;
    private TipoLibro genero;

    public Libro(String titulo, String autores, String editorial, String isbn, int anho, TipoLibro genero) {
        this.titulo = titulo;
        this.autores = autores;
        this.editorial = editorial;
        this.isbn = isbn;
        this.anho = anho;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutores() {
        return autores;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAnho() {
        return anho;
    }

    public TipoLibro getGenero() {
        return genero;
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("titulo=").append(titulo);
        sb.append("\nautores=").append(autores);
        sb.append("\neditorial=").append(editorial);
        sb.append("\nisbn=").append(isbn);
        sb.append("\nanho=").append(anho);
        sb.append("\ngenero=").append(genero);
        return sb.toString();
    }
    
   
}
