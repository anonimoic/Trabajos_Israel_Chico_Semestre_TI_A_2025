package Metodos;

import java.util.Scanner;

/*
 * Convertir de C -> F y F -> C
 * Pregunta que conversion quiere
 * Ingresar la temperatura
 * Desea realizar de nuevo
 */
public class Ejercicio {

    public void IngresarCoF() {
        Scanner tec = new Scanner(System.in);
        double CelsiusFahrenheit, FahrenheitCelsius;
        double gradosf, gradosc;
        System.out.println("Que conversion desea realizar?");
        System.out.println("-- 1._ Celsius a Fahrenheit --");
        System.out.println("-- 2._ Fahrenheit a Celsius --");
        int r = tec.nextInt();
        switch (r) {
            case 1:
                System.out.println("Ingrese cuantos grados Celsius desea convertir a Fahrenheit ");
                gradosc = tec.nextDouble();
                CelsiusFahrenheit = CelsiusaFahrenheit(gradosc);
                System.out.println(gradosc + " Grados celsius equivale a " + CelsiusFahrenheit + " GRADOS Fahrenheit ");
                break;
            case 2:
                System.out.println("Ingrese cuantos grados Fahrenheit desea convertir a Celsius ");
                gradosf = tec.nextDouble();
                FahrenheitCelsius = FahrenheitaCelsius(gradosf);
                System.out.println(gradosf + " Grados Fahrenheit equivale a " + FahrenheitCelsius + " GRADOS Celsius ");
                break;
            default:
                System.out.println("OPCION INVALIDA");
                throw new AssertionError();
        }
    }

    public double CelsiusaFahrenheit(double grados) {
        double fc = (grados * 1.8) + 32;
        return fc;
    }

    public double FahrenheitaCelsius(double grados) {
        double cc = (grados - 32) / 1.8;
        return cc;
    }

    public static void main(String[] args) {
        int r = 1;
        while (r == 1) {
            Scanner tec = new Scanner(System.in);
            Ejercicio convertir = new Ejercicio();
            convertir.IngresarCoF();
            System.out.println("Desea realizar otra conversion?");
            System.out.println("| -- 1: Si -- | \n| -- 2: No -- |");
            r = tec.nextInt();
            if (r == 2) {
                System.out.println("Finalizando.......");
            }
        }
    }
}
