package semana2.estudiante2;

import semana2.Estudiante.MainEstudiante;

import java.util.*;

public class MainEstudiante2 {
    public static void main(String[] args) {

        Random random = new Random();

        Estudiante2 e1 = new Estudiante2("John");
        Estudiante2 e2 = new Estudiante2("Wick");

        Map<String, Integer> asignatura = new HashMap<>();
        asignatura.put("entornos", random.nextInt(1, 11));
        asignatura.put("Programacion", random.nextInt(1, 11));
        asignatura.put("Sistemas", random.nextInt(1, 11));
        asignatura.put("Base de datos", random.nextInt(1, 11));

        for (String asignaturaActual : asignatura.keySet()) {

            boolean notaJohn = random.nextBoolean();
            boolean notaWick = random.nextBoolean();

            e1.cursarAsignatura(asignaturaActual);
            e2.cursarAsignatura(asignaturaActual);
        }

        e1.mostrarEstudiante();
        e2.mostrarEstudiante();
    }
}