package semana2.Estudiante;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MainEstudiante {
    public static void main(String[] args) {

        // Crea una clase con main que tenga un conjunto de String con nombres de 5 asignaturas. En el main:
        //- Crea 2 estudiantes, "John" y "Wick".
        //- Recorre el array de asignaturas: para cada asignatura, pónsela a John y a Wick como aprobada o suspensa (haz un random de boolean);
        // no tienen por qué tener la misma asignatura con la misma calificación.
        //- Elige a uno de los dos estudiantes. Obtén una asignatura que haya suspendido. Apruébasela.
        // Imprime de nuevo su listado de asignaturas aprobadas.

      Estudiante e1=new Estudiante("John");
      Estudiante e2= new Estudiante("Wick");


      List<String> listaTodasAsignaturas=new ArrayList<>();

      listaTodasAsignaturas.add("matematicas");
      listaTodasAsignaturas.add("Sistemas");
      listaTodasAsignaturas.add("Fisica");
      listaTodasAsignaturas.add("Programacion");
      listaTodasAsignaturas.add("Quimica");

        Random random = new Random();

        for (String asignaturaActual:listaTodasAsignaturas){
            boolean notaJonh= random.nextBoolean();
            boolean notaWick= random.nextBoolean();

            e1.cursarAsignatura(asignaturaActual, notaJonh);
            e2.cursarAsignatura(asignaturaActual,notaWick);

        }
        e1.mostrarEstudiante();
        e2.mostrarEstudiante();

    }


}
