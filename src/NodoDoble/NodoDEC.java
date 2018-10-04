/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NodoDoble;

/**
 *
 * @author jmanu
 */
public class NodoDEC {
    private int info;
    private NodoDEC ant,sig;

    public NodoDEC(int info) {
        this.info = info;
        ant=sig=null;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public NodoDEC getAnt() {
        return ant;
    }

    public void setAnt(NodoDEC ant) {
        this.ant = ant;
    }

    public NodoDEC getSig() {
        return sig;
    }

    public void setSig(NodoDEC sig) {
        this.sig = sig;
    }

    @Override
    public String toString() {
        return "NodoDEC{" + "info=" + info + '}';
    }
    
     
    
}
