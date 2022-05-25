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

public class Ejecutar {
    private ArrayList variables;
    private ArrayList metodos;
    String ambito;
    
    public Ejecutar(){
        variables = new ArrayList();
        metodos = new ArrayList();
    }

    /**
     * @return the variables
     */
    public ArrayList getVariables() {
        return variables;
    }

    /**
     * @return the metodos
     */
    public ArrayList getMetodos() {
        return metodos;
    }
    
    public void Obtener(NodoArbol nodo){
        switch(nodo.getTerm().getNombre()){
            case "INICIO":
            {
                ambito = "global";
                Obtener((NodoArbol)nodo.getHijos().get(0));
                break;
            }
            
            case "LCLASE":
            {
                for(int i = 0; i < nodo.getHijos().size(); i++){
                    Obtener((NodoArbol)nodo.getHijos().get(i));
                }
                break;
            }
            
            case "CLASE":
            {
                if(nodo.getHijos().size() == 2){
                    Obtener((NodoArbol)nodo.getHijos().get(1));
                }else{
                    Obtener((NodoArbol) nodo.getHijos().get(0));
                }
                break;
            }
            
            case "CONTENIDO":
            {
                for(int i = 0; i < nodo.getHijos().size(); i++){
                    Obtener((NodoArbol)nodo.getHijos().get(i));
                }
                break;
            }
            
            case "LSENTENCIAS":
            {
                for(int i = 0; i < nodo.getHijos().size(); i++){
                    Obtener((NodoArbol)nodo.getHijos().get(i));
                }
                break;
            }
            
            case "SENTENCIAS":
            {
                if(nodo.getHijos().size() == 1){
                    Obtener((NodoArbol)nodo.getHijos().get(0));
                }
                break;
            }
            
            case "DECLARACION":
            {
                if(nodo.getHijos().size() == 4){
                    
                }else if(nodo.getHijos().size() == 3){
                    
                }
                break;
            }
        }
    }
    
    public String getTipo(NodoArbol nodo){
        switch(nodo.getTerm().getNombre()){
            case "TIPO":
            {
                return getTipo((NodoArbol)nodo.getHijos().get(0));
            }
            case "int":
            {
                return nodo.getToken().getTexto();
            }
            case "String":
            {
                return nodo.getToken().getTexto();
            }
            case "boolean":
            {
                return nodo.getToken().getTexto();
            }
            case "char":
            {
                return nodo.getToken().getTexto();
            }
            case "double":
            {
                return nodo.getToken().getTexto();
            }
            case "id":
            {
                return nodo.getToken().getTexto();
            }
        }
        return "";
    }
    
}
