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

public class Arbol {
    NodoArbol raiz;
    boolean tieneerrores;
    ArrayList errores = new ArrayList();
    
    public Arbol(NodoArbol praiz){
        raiz = praiz;
        errores = new ArrayList();
    }
    
    public NodoArbol getRaiz(){
        return raiz;
    }
    
    public void AgregarError(Errores error){
        errores.add(error);
    }
}
