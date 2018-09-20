/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

/**
 *
 * @author jmanu
 */
public class Libro {
    private String ISBN,Titulos;
    private float precio;

    public Libro() {
    }

    public Libro(String ISBN, String Titulos, float precio) {
        this.ISBN = ISBN;
        this.Titulos = Titulos;
        this.precio = precio;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulos() {
        return Titulos;
    }

    public void setTitulos(String Titulos) {
        this.Titulos = Titulos;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro{" +  Titulos + '}';
    }
    
    
}
