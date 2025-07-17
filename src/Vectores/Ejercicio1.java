package Vectores;

import java.util.Random;
import java.util.Scanner;

/*
 * Array 20 posiciones 
 * Valores aleatorios [20-60]
 * Calcular el promedio 
 * Calcular el max , min
 * cuantos son pares y cauntos son impares 
 */

public class Ejercicio1 {
    public static void Empezar(int [] vector){
        Random rd = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rd.nextInt(20,61);
        }
    }

    public static void Imprimir(int [] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
    public static void Promedio(int [] vector){
        double cont=0;
        double suma=0;
        double promedio=0;
        for (int i = 0; i < vector.length; i++) {
            cont=cont+1;
            suma=suma+vector[i];
        }
        promedio=suma/cont;
        System.out.println("La suma de los numeros es: " +suma);
        System.out.println("Existen " +cont +" numeros");
        System.out.println("El promedio de todos los numeros es: " +promedio);
    }

    public static void Maximo(int [] vector){
        int mayor = vector[0];
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]>mayor) {
                mayor=vector[i];
            }
        }
        System.out.println("El numero mayor es: " +mayor);
    }
     public static void Minimo(int [] vector){
        int minimo = vector[0];
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]<minimo) {
                minimo=vector[i];
            }
        }
        System.out.println("El numero mayor es: " +minimo);
    }

    public static void PareseImpares(int [] vector){
        int pares=0;
        int impares=0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]%2==0) {
                pares=pares+1;
            }else{impares=impares+1;}
        }
        System.out.println("Existen " +pares +" numeros pares");
        System.out.println("Existen " +impares +" numeros impares");
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int [] espacio;
        System.out.println("Ingrese la cantidad de numeros que desea ingresar: ");
        int longitud = tec.nextInt();
        espacio = new int[longitud];
        Empezar(espacio);
        System.out.println("--Imprimir numeros --");
        Imprimir(espacio);
        System.out.println("-- Imprimir el promedio -- ");
        Promedio(espacio);
        System.out.println("--Imprimir el numero mayor --");
        Maximo(espacio);
        System.out.println("--Imprimir el numero menor --");
        Minimo(espacio);
        System.out.println(" --Imprimir pares e impares --");
        PareseImpares(espacio);
    }

}
