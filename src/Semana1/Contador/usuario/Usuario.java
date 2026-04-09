package Semana1.Contador.usuario;

public class Usuario {
//Ejercicio 2:
//Crea una clase Usuario con:
//- atributo private String nombre
//- atributo private static int totalUsuarios
//En el constructor:
//- asigna el nombre
//- incrementa totalUsuarios
//Añade:
//- getter de nombre
//- método static int getTotalUsuarios()
//Desde main, crea varios usuarios y después de crearlos muestra el total (tomándolo de la clase Usuario).

    private String nombre;
    private static int totalUsuarios;

    public Usuario(String nombre) {
        this.nombre = nombre;
        totalUsuarios++;
    }

    public String getNombre() {
        return nombre;
    }

    public static int getTotalUsuarios() {


        return totalUsuarios;
    }

}
