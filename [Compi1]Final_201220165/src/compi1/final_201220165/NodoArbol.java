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
import java.util.*;

public class NodoArbol {
    Token token;
    Term terminal;
    ArrayList hijos = new ArrayList();
    
    public NodoArbol(Token token, Term terminal){
        this.token = token;
        this.terminal = terminal;
        hijos = new ArrayList();
    }
    
    public void AgregarHijos(NodoArbol nodo){
        hijos.add(nodo);
    }
    
    public Token getToken(){
        return token;
    }
    
    public Term getTerm(){
        return terminal;
    }
    
    public String aString(){
        if(token == null){
            return "Terminal:\n" + terminal.getNombre();
        }else{
            return "Token\nNombre:" + terminal.getNombre() + "\nValor: " + token.getTexto();
        }
    }
    
    public ArrayList getHijos(){
        return hijos;
    }
}
