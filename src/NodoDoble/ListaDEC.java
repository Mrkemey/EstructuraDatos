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

}
