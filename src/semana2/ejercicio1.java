package semana2;

import java.util.HashSet;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {

        //Ejercicio 1:
        //Crea un programa que:
        //- Lea por teclado 3 palabras (un bucle...).
        //- Las guarde en una estructura de datos SIN duplicados
        //- Imprima todas las palabras en dicha estructura



        HashSet<String>palabras =new HashSet<String>();

        Scanner entrada = new Scanner(System.in);

        for(int i=0;i<3;i++){
            System.out.println("elije la palabra");
            String p= entrada.next();
            System.out.println("has elejido la palabra :" + p);
            palabras.add(p);
        }

          for(String p: palabras){
              System.out.println("las palabras sin repeticion son: " + p);
          }












    }
}
