package Semana1.Contador.circulo;

public class Circulo {

    //Crea una clase Constantes con:
    //- Un atributo public static final double PI = 3.1416
    //Crea una clase círculo a la que le pasas en el constructor su radio.
    //- Tiene que tener un método double areaCirculo(double radio) que nos devuelva el área - usando el valor de PI de la otra clase.
    //Desde un main, crea varios círculos y calcula sus áreas.

    private double radio;
    private double area;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double areaCirculo(){

        double area =Constantes.PI * Math.pow(radio, 2);


        return area;
    }




}
