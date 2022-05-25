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
public class Metodo {
    private String tipo;
    private String numpar;
    private String nombre;
    
    public Metodo(String ptipo, String pnumpar, String pnombre){
        tipo = ptipo;
        numpar = pnumpar;
        nombre = pnombre;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @return the numpar
     */
    public String getNumpar() {
        return numpar;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
}
