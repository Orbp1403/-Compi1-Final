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
public class Errores {
    private String tipo;
    private String descripcion;
    private int fila;
    private int columna;
    
    public Errores(String ptipo, String pdescripcion, int pfila, int pcolumna){
        tipo = ptipo;
        descripcion = pdescripcion;
        fila = pfila;
        columna = pcolumna;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @return the fila
     */
    public int getFila() {
        return fila;
    }

    /**
     * @return the columna
     */
    public int getColumna() {
        return columna;
    }
    
    
}
