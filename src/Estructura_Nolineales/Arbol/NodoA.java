/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura_Nolineales.Arbol;

/**
 *
 * @author jmanu
 */
public class NodoA {
    private int dato;
    private NodoA izq,der;

    public NodoA(int dato) {
        this.dato = dato;
        izq=der=null;
    }

    @Override
    public String toString() {
        return "NodoA{" + dato + '}';
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoA getIzq() {
        return izq;
    }

    public void setIzq(NodoA izq) {
        this.izq = izq;
    }

    public NodoA getDer() {
        return der;
    }

    public void setDer(NodoA der) {
        this.der = der;
    }
    
    
}
