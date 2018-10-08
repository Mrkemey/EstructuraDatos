/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materia;

/**
 *
 * @author jmanu
 */
public class NodoSEM {
    private Materia info;
    private NodoSEM sig;

    public NodoSEM(Materia info) {
        this.info = info;
        sig=null;
    }

    public Materia getInfo() {
        return info;
    }

    public void setInfo(Materia info) {
        this.info = info;
    }

    public NodoSEM getSig() {
        return sig;
    }

    public void setSig(NodoSEM sig) {
        this.sig = sig;
    }

    @Override
    public String toString() {
        return info+"";
    }
    
    
    
}
