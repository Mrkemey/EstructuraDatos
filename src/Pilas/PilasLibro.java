/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

import static javax.swing.JOptionPane.*;

/**
 *
 * @author jmanu
 */
public class PilasLibro {

    private int tam, tope;
    private Libro P[];

    public PilasLibro() {
    }

    public PilasLibro(int tam) {
        this.tam = tam;
        tope = -1;
        P = new Libro[tam];
    }

    public boolean vacia() {
        return tope == -1;
    }

    public boolean llena() {
        return tope == tam - 1;
    }

    public void meter(Libro d) {
        if (llena()) {
            showMessageDialog(null, "Pila llena");
        } else {
            P[++tope] = d;
        }
    }

    public Libro sacar(){
        if (vacia()) {
            showMessageDialog(null, "Pilla Vacia");return null;
        } else {
            return P[tope--];
        }
    }
    public void verPila(){
        String cad="";
        for (int i = tope; i >= 0; i--) {
            cad+=P[i]+"\n";           
        }
        showMessageDialog(null, cad);
    }
    public static void main(String[] args) {
        PilasLibro a=new PilasLibro(5);
        a.meter(new Libro("123","hola",100));
        a.meter(new Libro("463","ho",102));
        a.meter(new Libro("1ca3","ha",130));
        a.verPila();
        a.sacar();
        a.verPila();
    }
}
