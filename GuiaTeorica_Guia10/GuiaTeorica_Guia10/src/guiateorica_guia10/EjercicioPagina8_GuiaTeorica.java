/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiateorica_guia10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

/**
 *
 * @author SantiagoPaguaga
 */
public class EjercicioPagina8_GuiaTeorica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a cada uno.
        
        ArrayList<Integer> listado = new ArrayList();
        TreeSet<String> nombres = new TreeSet();
        HashMap<Integer, String> personas = new HashMap();
        
        
        
        listado.add(20); listado.add(30); listado.add(40); listado.add(50); listado.add(60);
        
        nombres.add("Pedro"); 
        nombres.add("Marcos");
        nombres.add("Noelia");
        nombres.add("Lucas");
        nombres.add("Juan");
        
        personas.put(1, "Pedro");
        personas.put(2, "Marcos");
        personas.put(3, "Noelia");
        personas.put(4, "Lucas");
        personas.put(5, "Juan");
        
        //Toma la Lista, el Conjunto y el Mapa que hiciste previamente y elimina en cada uno un objeto de
        //cada forma que aprendiste arriba.
    
        //listado.remove(1); //Enviamos como parámetro el indice como int
        listado.remove(Integer.valueOf(50)); //Enviamos como parámetro un objeto integer
        
        nombres.remove("Lucas");
        
        personas.remove(5);
             
        mostrarListado(listado);
        mostrarNombres(nombres);
        mostrarPersonas(personas);
        
        Iterator<Integer> iterador = listado.iterator();
        
        while(iterador.hasNext()){
            if(iterador.next() > 30){
                iterador.remove();
            }  
        }
        
        Iterator<Integer> iterador2 = listado.iterator();
        
        while(iterador2.hasNext()){
            System.out.println(iterador2.next() + " ");
        }
    }
    
    public static void mostrarListado(ArrayList<Integer> lista){
        String aux = "[ ";
        for (Integer numero : lista) {
            aux += numero + " ";
        }    
        System.out.println(aux + " ]");
    }  
    
    public static void mostrarNombres(TreeSet<String> nombres){
        String aux = "[ ";
        for (String nombre : nombres) {
            aux += nombre + " ";
        }    
        System.out.println(aux + " ]");
    }  
    
    public static void mostrarPersonas(HashMap<Integer, String> personas){
        for (Map.Entry<Integer, String> persona : personas.entrySet()) {
            System.out.println("DNI: " + persona.getKey() + " Nombre: " + persona.getValue());
        }    
    }  
}