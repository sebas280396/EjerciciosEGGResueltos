/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author sebas
 */
public class Libreria {
    private int Isbn;
    private String titulo;
    private String autor;
    private int paginas;

    public Libreria() {
    }

    
    public Libreria (int Isbn, String titulo, String autor, int paginas) {
        this.Isbn = Isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void setIsbn(int Isbn) {
        this.Isbn = Isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getIsbn() {
        return Isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    @Override
    public String toString() {
        return "Libreria{" + "Isbn=" + Isbn + ", titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + '}';
    }


    
    
}


