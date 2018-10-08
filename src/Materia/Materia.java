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
public class Materia {
private String nombre,aula;
private int clave,hora;


    public Materia() {
    }

    public Materia(String nombre, String aula, int clave, int hora) {
        this.nombre = nombre;
        this.aula = aula;
        this.clave = clave;
        this.hora = hora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return  nombre + "-" + aula + "-" + clave + "-" + hora;
    }
    

    

}
