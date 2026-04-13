package semana2;

import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Ejercicio 2:
        //Crea una lista de números enteros. Recuerda que las listas son de Objetos,
        // no de tipos Básicos; Java implementa el objeto Integer para los enteros,
        // Double para los double, Float para los float, Boolean para los boolean...
        //- añade varios números
        //- muestra todos los números
        //- muestra cuantos números hay en total
        //- calcula la suma total
        //- calcula el número mayor



        ArrayList<Integer>numerosEnteros = new ArrayList<Integer>();
        numerosEnteros.add(25);
        numerosEnteros.add(12);
        numerosEnteros.add(98);
        numerosEnteros.add(34);
        numerosEnteros.add(54);
        numerosEnteros.add(78);


        System.out.println("los numeros son:");

        for(Integer n :numerosEnteros) {
            System.out.println(n);

        }
        System.out.println( "el total de numeros es:"+numerosEnteros.size());




        int suma=0;
        for(Integer n:numerosEnteros){

          suma= suma+n;
        }
        System.out.println("la suma es: " + suma);


        //calculamos mayor


        int mayor=numerosEnteros.get(0);
        for(Integer n:numerosEnteros) {
            if (n > mayor) {
                mayor = n;
            }
        }

        System.out.println("el valor mas alto es:" + mayor );

    }

}
