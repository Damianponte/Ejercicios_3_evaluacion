package semana2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Estudiante2 {

//Ejercicio 6:
//Adapta el ejercicio 5. Ahora no queremos una lista de aprobadas y una de suspensas;
//ahora queremos que mantenga un mapa con las notas de las asignaturas.
//Todo el resto de comportamientos tiene que mantenerse igual.
//¿Qué cambios habría que hacer?
// - En vez de 2 listas/sets, mantenemos 1 hashmap de String a Integer (la clave es el nombre de la asignatura, el valor la nota)
//- cursarAsignatura ahora recibe la nota.
//- No permitimos cursar una asignatura ya aprobada - una asignatura que ya tenga un 5 o más.
//- Imprimir todas las aprobadas es recorrer el mapa mostrando sólo las que tengan 5 o más de nota.
// Imprimir las suspensas, las que tengan menos de 5.


    public String getNombre() {
        return nombre;
    }

    private String nombre;
    private Map<String,Integer> notas;

    public Estudiante2(String nombre) {
        this.nombre = nombre;
        this.notas = new HashMap<>();
    }
    public void cursarAsignatura(String asignatura){
        if(notas.get(asignatura)>=5){

            System.out.println("has aprobado la asignatura");

        }
    }

        public void mostrarEstudiante() {
            System.out.println("Estudiante:" + nombre);

            System.out.println("aprobadas:");

            for (Map.Entry<String, Integer> notasPorAsignatura : notas.entrySet()) {
                if (notasPorAsignatura.getValue() >= 5) {
                    System.out.println(notasPorAsignatura.getKey() + ": " + notasPorAsignatura.getValue());

                }
            }
            System.out.println("Suspensas:");

            for (Map.Entry<String, Integer> notasPorAsignatura : notas.entrySet()) {
                if (notasPorAsignatura.getValue() < 5) {
                    System.out.println(notasPorAsignatura.getKey() + ": " + notasPorAsignatura.getValue());
                }
            }

        }

}

