/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compi1.final_201220165;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oscar
 */
public class Graficar {
    int contador = 0;
    
    public Graficar(NodoArbol raiz){
        contador = 0;
        FileWriter fw = null;
        try {
            File archivo = new File("C:\\Users\\oscar\\Documents\\NetBeansProjects\\[Compi1]Final_201220165\\Arbol.dot");
            fw = new FileWriter(archivo);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("digraph{");
            pw.println("subgraph clusterarbol{");
            pw.println("label = \"Arbol AST\"");
            pw.println("nodo0[label=\"" + raiz.aString() + "\"];");
            contador = 1;
            pw.println(graficarNodos("nodo0", raiz));
            pw.println("}");
            pw.println("}");
            pw.close();
            Process proceso = Runtime.getRuntime().exec("dot -Tjpg C:\\Users\\oscar\\Documents\\NetBeansProjects\\[Compi1]Final_201220165\\Arbol.dot -o C:\\Users\\oscar\\Documents\\NetBeansProjects\\[Compi1]Final_201220165\\Arbol.jpg");
            Process proceso1 = Runtime.getRuntime().exec("rundll32.exe C:\\WINDOWS\\system32\\shimgvw.dll,ImageView_Fullscreen C:\\Users\\oscar\\Documents\\NetBeansProjects\\[Compi1]Final_201220165\\Arbol.jpg");
        } catch (IOException ex) {
            Logger.getLogger(Graficar.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Graficar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    public String graficarNodos(String padre, NodoArbol hijo){
        String aux = "";
        for(int i = 0; i < hijo.getHijos().size(); i++){
            String nombre = "nodo" + contador;
            NodoArbol aux1 = (NodoArbol)hijo.getHijos().get(i);
           aux += nombre + "[label=\"" + aux1.aString()+ "\"];\n";
                aux += padre + "->" + nombre + ";\n";
                contador++;
                aux += graficarNodos(nombre, aux1);
            }
            return aux;
    }
}
