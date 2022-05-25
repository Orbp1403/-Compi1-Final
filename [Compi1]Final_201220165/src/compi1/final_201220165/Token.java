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
public class Token {
    String texto;
    int fila;
    int columna;
    
    public Token(String ptexto, int pfila, int pcolumna){
        texto = ptexto;
        fila = pfila;
        columna = pcolumna;
    }
    
    public String getTexto(){
        return texto;
    }
    
    public int getFila(){
        return fila;
    }
    
    public int getColumna(){
        return columna;
    }
}
