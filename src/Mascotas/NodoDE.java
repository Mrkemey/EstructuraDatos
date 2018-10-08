/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mascotas;

/**
 *
 * @author jmanu
 */
public class NodoDE {
    private Mascota info;
    private NodoDE ant,sig;

    public NodoDE(Mascota info) {
        this.info = info;
        ant=sig=null;
    }

    public Mascota getInfo() {
        return info;
    }

    public void setInfo(Mascota info) {
        this.info = info;
    }

    public NodoDE getAnt() {
        return ant;
    }

    public void setAnt(NodoDE ant) {
        this.ant = ant;
    }

    public NodoDE getSig() {
        return sig;
    }

    public void setSig(NodoDE sig) {
        this.sig = sig;
    }

    @Override
    public String toString() {
        return  info + "";
    }
    
}
