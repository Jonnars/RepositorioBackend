/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiateorica_guia10;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author SantiagoPaguaga
 */
public class DeteccionErrores_Pagina11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        
        HashMap<Integer, String> personas = new HashMap();
        String n1 = "Albus";
        String n2 = "Severus";
//        System.out.println("Ingrese el dni de Albus");
//        int dni1 = sc.nextInt();
        //personas.put(dni1, n1);
        personas.put(1, n1);
        personas.put(2, n2);
    }
    
}
