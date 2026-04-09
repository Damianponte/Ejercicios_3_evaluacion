package Semana1.Contador.usuario;

public class MainUsuario {
    public static void main(String[] args) {

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



        Usuario u1=new Usuario("Damian");
        System.out.println("Total de usuarios: " + Usuario.getTotalUsuarios());

        Usuario u2=new Usuario("alise");
        System.out.println("Total de usuarios: " + Usuario.getTotalUsuarios());


        Usuario u3=new Usuario("Ryu");

        System.out.println("Total de usuarios: " + Usuario.getTotalUsuarios());

        Usuario u4=new Usuario("Lion");
        System.out.println("Total de usuarios: " + Usuario.getTotalUsuarios());







    }
}
