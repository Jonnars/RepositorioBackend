/*Ejercicio integrador 
Para esto vamos a tener que crear un objeto de tipo Estudiante, sus atributos 
van a ser nombre y nota (representando la nota obtenida en el final). 

La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8 
estudiantes con sus respectivas notas. 
Una vez creado los estudiantes deberemos guardar los estudiantes en un 
arreglo de objetos tipo Estudiante, usando ese arreglo tenemos que realizar las 
dos tareas que nos ha pedido la escuela. 

1. Calcular y mostrar el promedio de notas de todo el curso 
2. Retornar otro arreglo con los nombre de los alumnos que recibieron una 
nota mayor al promedio del curso 
3. Por último, deberemos mostrar todos los estudiantes con una nota 
mayor al promedio. 
Nota: para crear un vector de objetos la definición es la siguiente: 
Objeto nombreVector[] = new Objeto[];*/
package servicio;

import entidad.Estudiante;
import java.util.Scanner;

public class EstudianteServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cargarEstudiante(Estudiante[] estudiantes) {
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("Ingrese el nombre del Estudiante");
            String nombre = leer.next();
            System.out.println("Ingrese la nota del Estudiante");
            double nota = leer.nextDouble();
            estudiantes[i] = new Estudiante(nombre, nota);
        }
    }

    public double sumarNotas(Estudiante[] estudiantes) {
        double sumarNotas = 0;
        for (int i = 0; i < estudiantes.length; i++) {
            sumarNotas += estudiantes[i].getNota();
        }
        double promedioNotas = sumarNotas / estudiantes.length;
        System.out.println("El promedio de todas las notas es de: " + promedioNotas);
        return promedioNotas;
    }

    public void estudiantesSuperior(Estudiante[] estudiantes){
        int contador = 0;
        double promedioNotas = sumarNotas(estudiantes);
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getNota() > promedioNotas) {
                contador++;
            }
        }
        String[] nombresEstudiantes = new String[contador];
        contador = 0;
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getNota() > promedioNotas) {
                nombresEstudiantes[contador] = estudiantes[i].getNombre();
                contador++;
            }
        }

        for (String nombre : nombresEstudiantes) {
            System.out.println("El Estudiante " + nombre + " supera el promedio de las notas");
        }
    }
}
