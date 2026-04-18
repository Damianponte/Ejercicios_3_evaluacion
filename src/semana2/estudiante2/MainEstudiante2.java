package semana2.estudiante2;

import semana2.Estudiante.Estudiante;

import java.util.*;


public class MainEstudiante2 {
    public static void main(String[] args) {


        Random random = new Random();
        // Crea una clase con main que tenga un conjunto de String con nombres de 5 asignaturas. En el main:
        //- Crea 2 estudiantes, "John" y "Wick".
        //- Recorre el array de asignaturas: para cada asignatura, pónsela a John y a Wick como aprobada o suspensa (haz un random de boolean);
        // no tienen por qué tener la misma asignatura con la misma calificación.
        //- Elige a uno de los dos estudiantes. Obtén una asignatura que haya suspendido. Apruébasela.
        // Imprime de nuevo su listado de asignaturas aprobadas.



        Estudiante e1 = new Estudiante("John");
        Estudiante e2 = new Estudiante("Wick");

         Map<String, Integer> asignatura = new HashMap<>();
         asignatura.put("entornos", random.nextInt(1,11));
        asignatura.put("Programacion", random.nextInt(1,11));
        asignatura.put("Sistemas", random.nextInt(1,11));
        asignatura.put("base de datos", random.nextInt(1,11));



        for (String asignaturaActual:asignatura.keySet()){
            boolean notaJonh= random.nextBoolean();
            boolean notaWick= random.nextBoolean();

            e1.cursarAsignatura(asignaturaActual, notaJonh);
            e2.cursarAsignatura(asignaturaActual,notaWick);

        }
        e1.mostrarEstudiante();
        e2.mostrarEstudiante();

    }
}
