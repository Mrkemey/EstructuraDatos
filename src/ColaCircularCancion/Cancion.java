/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColaCircularCancion;

/**
 *
 * @author jmanu
 */
public class Cancion {
    private String Nombre,Artista;
    private int duracion;

    public Cancion() {
    }

    public Cancion(String Nombre, String Artista, int duracion) {
        this.Nombre = Nombre;
        this.Artista = Artista;
        this.duracion = duracion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String Artista) {
        this.Artista = Artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return  Nombre + "-" + Artista + "-" + duracion ;
    }
    
}
