package Repaso;

import java.util.Random;

/*
 * Array 20 posiciones 
 * Valores aleatorios [20-60]
 * Calcular el promedio 
 * Calcular el max , min
 * cuantos son pares y cauntos son impares 
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        double contador =0;
        double acumulador=0;
        double[] vector = new double[21];
        Random numero = new Random();
        for (int i = 0; i < 20; i++) {
            vector[i] = numero.nextDouble(20, 60);
        }
           for (int i = 0; i < 5; i++) {
            contador+=1;
            acumulador+=vector[i];
            System.out.println(vector[i]);
        }
        System.out.println(acumulador);
        System.out.println(contador);
        double Promedio=acumulador/contador;
        System.out.println("promedio" +Promedio);


    }

}
