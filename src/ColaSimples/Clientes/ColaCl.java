/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColaSimples.Clientes;


import static javax.swing.JOptionPane.*;

/**
 *
 * @author jmanu
 */
public class ColaCl {

    private int tam, fin;
    private String C[];

    public ColaCl() {
    }

    public ColaCl(int tam) {
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
    public String ver(){
        String cad="";
        for (int i = 0; i <= fin; i++) {
            cad+=C[i]+"-";
        }
        return cad;
    }
    public int getFin() {
        return fin;
    }

    public int getTam() {
        return tam;
    }

    

}
