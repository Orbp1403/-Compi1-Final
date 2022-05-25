/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compi1.final_201220165;

/**
 *
 * @author oscar
 */
public class Simbolo {
    private String tipo;
    private String nombre;
    private String fila;
    private String columna;
    private String ambito;
    private String rol;

    public Simbolo(String ptipo, String pnombre, String pfila, String pcolumna, String pambito, String prol){
        tipo = ptipo;
        nombre = pnombre;
        fila = pfila;
        columna = pcolumna;
        ambito = pambito;
        rol = prol;
    }
    
    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the fila
     */
    public String getFila() {
        return fila;
    }

    /**
     * @return the columna
     */
    public String getColumna() {
        return columna;
    }

    /**
     * @return the ambito
     */
    public String getAmbito() {
        return ambito;
    }

    /**
     * @return the rol
     */
    public String getRol() {
        return rol;
    }
}
