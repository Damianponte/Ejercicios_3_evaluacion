package semana2;

import java.util.Set;

public class Estudiante {
  //
   //Ejercicio 5:

  //Crea una clase Estudiante que tenga un nombre, un conjunto de asignaturas aprobadas y un conjunto de asignaturas pendientes.
  //Añade un método "cursarAsignatura(String asignatura, boolean aprobada)". Este método:
  //- Si la asignatura ya está en asignaturas aprobadas, imprime "Ya ha cursado esa asignatura".
  //- En caso contrario, tiene que poner la asignatura en "aprobadas" o en "pendientes" dependiendo del parámetro que se le pasa por entrada.
    // **Ten en cuenta que si ya la tenía en asignaturas pendientes, y ahora la aprueba,
    // también tienes que eliminarla de asignaturas pendientes - ahora está aprobada**

  //Añade un método mostrarEstudiante que imprima su nombre, las asignaturas que ha aprobado y las que tiene pendientes.

  //Añade un método "getAprobadas()" que devuelva el conjunto de asignaturas aprobadas.
  //Añade un método "getSuspensas()" que devuelva el conjunto de asignaturas suspensa.
  //Añade un método "getTodas()" que devuelva el conjunto de todas las asignaturas.


   // Crea una clase con main que tenga un conjunto de String con nombres de 5 asignaturas. En el main:
   //- Crea 2 estudiantes, "John" y "Wick".
   //- Recorre el array de asignaturas: para cada asignatura, pónsela a John y a Wick como aprobada o suspensa (haz un random de boolean);
    // no tienen por qué tener la misma asignatura con la misma calificación.
   //- Elige a uno de los dos estudiantes. Obtén una asignatura que haya suspendido. Apruébasela.
    // Imprime de nuevo su listado de asignaturas aprobadas.

    private String nombre;
    private Set<String> aprobadas;
    private Set<String> pendientes;

    public Estudiante(String nombre, Set<String> aprobadas, Set<String> pendientes) {
        this.nombre = nombre;
        this.aprobadas = aprobadas;
        this.pendientes = pendientes;
    }
//Añade un método "cursarAsignatura(String asignatura, boolean aprobada)". Este método:
    //- Si la asignatura ya está en asignaturas aprobadas, imprime "Ya ha cursado esa asignatura".
    //- En caso contrario, tiene que poner la asignatura en "aprobadas" o en "pendientes" dependiendo del parámetro que se le pasa por entrada.
    // **Ten en cuenta que si ya la tenía en asignaturas pendientes, y ahora la aprueba,
    // también tienes que eliminarla de asignaturas pendientes - ahora está aprobada**

    public void cursarAsignatura(String asignatura, boolean aprobada){
        if(aprobadas.contains(asignatura)){
            System.out.println("la asignatura ya esta aprobada");

            if (aprobada){
                aprobadas.add(asignatura);
                pendientes.remove(asignatura);
            }

        }else{
            pendientes.add(asignatura);


        }
    }


}
