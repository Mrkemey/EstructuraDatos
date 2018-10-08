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
public class ListaSEM {

    private NodoSEM inicio, fin;

    public ListaSEM() {
        inicio = fin = null;
    }

    public boolean vacio() {
        return (inicio == null);
    }

    public void insertar(Materia m) {
        if (inicio == null) {
            inicio = fin = new NodoSEM(m);
        } else {
            fin.setSig((new NodoSEM(m)));
            fin = fin.getSig();
        }
    }

    public NodoSEM buscar(String nombre) {
        for (NodoSEM i = inicio; i != null; i = i.getSig()) {
            if (i.getInfo().getNombre().equalsIgnoreCase(nombre)) {
                return i;
            }

        }
        return null;
    }

    public boolean eliminar(String nombre) {
        NodoSEM b = buscar(nombre);
        if (b == null) {
            return false;
        }
        if (inicio == null) {
            inicio = fin = null;
        } else {
            if (inicio == fin) {
                inicio = fin = null;
            } else {
                if (b != inicio || fin != b) {
                    NodoSEM temp = inicio;
                    System.out.println(temp.getInfo());
                    while (temp != b) {
                        System.out.println(temp.getInfo());
                        if (temp.getSig() == b) {
                            break;
                        }
                        temp = temp.getSig();

                    }
                    if (temp.getSig() == fin) {
                        temp.setSig(null);
                        fin=temp;
                    } else {
                        if (temp == inicio) {
                            inicio = temp.getSig();
                        inicio.setSig(temp.getSig().getSig());
                        temp.setSig(null);
                        } else {
                            temp.setSig(b.getSig());
                            b.setSig(null);
                        }
                    }
                }
            }

        }
        return true;
    }

    public String ver() {
        String cad = "";
        for (NodoSEM i = inicio; i != null; i = i.getSig()) {
            cad += i.toString() + "/" + "\n";
        }
        return cad;
    }
}
