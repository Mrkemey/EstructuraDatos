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
public class ListaDEM {
    
    private NodoDE inicio, fin;
    
    public ListaDEM() {
        inicio = fin = null;
        
    }
    
    public void insertar(Mascota m) {
        if (inicio == null) {
            inicio = fin = new NodoDE(m);
        } else {
            fin.setSig((new NodoDE(m)));
            fin.getSig().setAnt(fin);
            fin = fin.getSig();
        }
    }
    
    public NodoDE buscar(String nombre) {
        for (NodoDE i = inicio; i != null; i = i.getSig()) {
            if (i.getInfo().getNombre().equalsIgnoreCase(nombre)) {
                return i;
            }
            
        }
        return null;
    }

    public String buscarEs(String nombre) {
        String cad = "";
        for (NodoDE i = inicio; i != null; i = i.getSig()) {
            if (i.getInfo().getEspecie().equalsIgnoreCase(nombre)) {
                cad += i.toString() + "/" + "\n";                
            }          
        }
        return cad;
    }
    
    public boolean eliminar(String nombre) {
        NodoDE b = buscar(nombre);
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            if (b == null) {
                return false;
            }
            if (b == inicio) {
                inicio = inicio.getSig();
                inicio.setAnt(null);
            } else {
                b.getAnt().setSig(b.getSig());
                if (b != fin) {
                    b.getSig().setAnt(b.getAnt());
                } else {
                    fin = fin.getAnt();
                }
            }
        }
        return true;
    }

    public String ver() {
        String cad = "";
        for (NodoDE i = inicio; i != null; i = i.getSig()) {
            cad += i.toString() + "/" + "\n";
        }
        return cad;
    }
    
}
