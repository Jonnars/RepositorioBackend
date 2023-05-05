
package giaTeorica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class DeteccionErrores {
    
    //Deteccíon de errores pag. 7
    
    public static void main(String[] args) {
     ArrayList<Integer> listado = new ArrayList();
     TreeSet<String> nombres = new TreeSet();
     HashMap<Integer, String> personas = new HashMap(); 
    
       //AÑADIR 5 OBJETOS (ELEMENTOS) A CADA COLECCIÓN
       
       //se añade a la lista
    listado.add(10);
    listado.add(20);
    listado.add(30);
    listado.add(40);
    listado.add(50);
    
    //se añade al conjunto
    nombres.add("Jonatan");
    nombres.add("Matías");
    nombres.add("Leonel");
    nombres.add("Abderzon");
    nombres.add("Pedro");
    
    //se añade al mapa
    personas.put(1, "Jonatan");
    personas.put(2, "Matías");
    personas.put(3, "Leonel");
    personas.put(4, "Abderzon");
    personas.put(5, "Pedro");
    
    
    ///ELIMINAR UN ELEMENTO (OBJETO) DE UNA COLECCIÓN
    
    //Tomar la Lista, el Conjunto y el Mapa que hiciste previamente y elimina en cada
    //objeto de cada forma que aprendiste arriba.
    
     //Eliminar de Lista
     listado.remove(0); //Se elimina con el indice
     listado.remove(Integer.valueOf(50)); //Se elimina con el valor
     
     //Eliminar de Conjunto
     nombres.remove("Jonatan");
     
     //Eliminar de Mapa
     personas.remove(1);
     
     
     //Declarar los nombres es importante, si no los lee. 
     mostrarListado(listado);
     mostrarNombres(nombres);
     mostrarPersonas(personas);
     
    }
        
    public static void mostrarListado (ArrayList<Integer> lista){
        String aux = "[ ";
        for (Integer numero : lista){
            aux += numero + " ";
        }
        System.out.println(aux + " ]");
    }
     
        public static void mostrarNombres (TreeSet<String> nombres){
        String aux = "[ ";
        for (String nombre : nombres){
            aux += nombre + " ";
        }
        System.out.println(aux + " ]");
    }
             
        public static void mostrarPersonas(HashMap<Integer,String> personas){
            for(Map.Entry<Integer, String> persona : personas.entrySet()){
                System.out.println("DNI: " + persona.getKey() + " Nombre: " + persona.getValue());
            }
        }
/// SE LO PUEDE USAR CUANDO SOLO SE QUIERE IMPRIMIR UN ATRIBUTO DE UN OBJERO EN EL MAPA
         
        /*  public static void mostrarListado (HashMap<String> nombres){
        String aux = "[ ";
        for (String nombre : nombres){
            aux += nombre + " ";
        }
        System.out.println(aux + " ]");
    }*/
        
    
     
}