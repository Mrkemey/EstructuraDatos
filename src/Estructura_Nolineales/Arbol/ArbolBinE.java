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
public class ArbolBinE {

    private NodoA raiz;

    public ArbolBinE() {
        raiz = null;
    }

    public static void main(String[] args) {
        ArbolBinE a = new ArbolBinE();
        a.insertar(3);
        a.insertar(4);
    }

    public void insertar(int i) {
        if (raiz == null) {
            raiz = new NodoA(i);
        } else {
            NodoA temp = raiz;
            if (temp.getDato() <= i && temp.getDer() == null) {
                temp.setDer(new NodoA(i));
            } else {
                if (temp.getDato() <= i) {
                    temp = temp.getDer();
                    insertar(i);
                } else {

                }
            }
        }
    }
    
}
