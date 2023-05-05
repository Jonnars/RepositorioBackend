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
package entidad;

public class Estudiante {
    private String nombre;
    private Double nota;
    
    public Estudiante(String nombre, double nota){
    this.nombre = nombre;
    this.nota = nota;    
}

    public Estudiante() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
       
}
