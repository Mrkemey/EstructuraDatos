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
public class ListaDEC {

    private NodoDEC inicio;

    public ListaDEC() {
        inicio = null;
    }

    public static void main(String[] args) {
        ListaDEC L = new ListaDEC();
        L.insertar(3);
    }

    public void insertar(int i) {
        if (inicio == null) {
            inicio = new NodoDEC(i);
            inicio.setAnt(inicio);
            inicio.setSig(inicio);
        } else {
            NodoDEC t = new NodoDEC(i);
            inicio.getAnt().setSig(t);
            t.setAnt(inicio.getAnt());
            inicio.setAnt(t);
            t.setSig(inicio);
        }
    }

    public NodoDEC buscar(int e) {
        for (NodoDEC i = inicio; i != inicio.getAnt(); i = i.getSig()) {
            if (i.getInfo() == e) {
                return i;
            }

        }
        if (inicio.getAnt().getInfo() == e) {
            return inicio.getAnt();
        }
        return null;
    }
    public boolean eliminar(int e){
        NodoDEC b=buscar(e);
        if (b==null) {
            return false;
        }
        if (b==inicio) {
            if (b.getAnt()==inicio&&b.getSig()==inicio) {
                inicio=null;
            } else {
                inicio=inicio.getSig();
                inicio.setAnt(b.getAnt());
                inicio.getAnt().setSig(inicio);
            }
            
        }else{
            b.getAnt().setSig(b.getSig());
            b.getSig().setAnt(b.getAnt());
        }
        return true;
    }

}
