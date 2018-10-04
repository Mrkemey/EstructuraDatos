/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColaSimples;

import static javax.swing.JOptionPane.*;

/**
 *
 * @author jmanu
 */
public class ColaString {

    private int tam, fin;
    private String C[];

    public ColaString() {
    }

    public ColaString(int tam) {
        this.tam = tam;
        fin = -1;
        C = new String[tam];
    }

    public boolean llena() {
        return fin == tam - 1;
    }

    public boolean vacia() {
        return fin == -1;
    }

    public void entrada(String s) {
        if (!llena()) {
            C[++fin] = s;
        } else {
            showMessageDialog(null, "Cola Llena");
        }
    }
    public String salida(){
        if (!vacia()) {
            String s=C[0];
            fin--;
            for (int i = 0; i <= fin; i++) {
                C[i]=C[i+1];
            }
            return s;
        } else {
            showMessageDialog(null, "Cola Vacia");
            return null;
        }
    }
    public void ver(){
        String cad="";
        for (int i = 0; i <= fin; i++) {
            cad+="["+C[i]+"]\n";
        }
        showMessageDialog(null, cad);
    }
    public static void main(String[] args) {
        ColaString c=new ColaString(5);
        do {            
            c.entrada("hola");
        } while (showConfirmDialog(null,"Otro dato")==0);
        c.ver();
        c.salida();
        c.ver();
    }

}
