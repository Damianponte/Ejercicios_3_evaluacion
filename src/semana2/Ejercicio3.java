package semana2;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio3 {

    public static void main(String[] args) {

        //Ejercicio 3:
        //        //Crea un programa que almacene una variable inventario que contenga para cada tipo de item el número que poseemos.
        //        //- Añade 2 "anillo"
        //        //- Añade 1 "pulsera"
        //        //- Añade 3 "piercing"
        //        //- Añade 1 "anillo" más.
        //        //- Muestra la cantidad de cada uno que hay almacenada.
        //        //- Elimina la pulsera (que no aparezca).
        //        //- Comprueba que la pulsera ya no existe.

        //Debe permitir:
        //- añadir objetos
        //- incrementar cantidad si ya existe
        //- mostrar todos los objetos con su cantidad

        //En el mismo main, añade 2 objetos, muéstralos,


        Map<String, Integer> inventario = new HashMap<>();
        inventario.put("anillo", 2);
        inventario.put("pulsera", 1);
        inventario.put("piercing", 3);


        if (!inventario.containsKey("anillo")){
                inventario.put("anillo",1);
            }else{
                inventario.put("anillo",inventario.get("anillo")+1);

            }
            for(String i: inventario.keySet()){
                System.out.println("El inventario tiene " + inventario.get(i) +" "+  i );
            }



             System.out.println("");
            inventario.remove("pulsera",1);

            for(String i: inventario.keySet()){

                System.out.println("el inventario tiene " + inventario.get(i) + " "+ i);
            }

        //Debe permitir:
        //- añadir objetos
        //- incrementar cantidad si ya existe
        //- mostrar todos los objetos con su cantidad

        //En el mismo main, añade 2 objetos, muéstralos,


        System.out.println("");

            inventario.put("gorro",1);
            inventario.put("gafas",2);


            for (String i: inventario.keySet()){
                System.out.println("el inventario tiene " + inventario.get(i) + " "+ i);
            }



    }

}
