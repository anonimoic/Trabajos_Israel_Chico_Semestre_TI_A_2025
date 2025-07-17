package Vectores;

import java.util.Scanner;

public class Temperaturas {
    public static void IngresarDatos(double [] vector){
        Scanner tec = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingrese la temperatura: ");
            vector [i] = tec.nextDouble();
        }
    }
    public static void ImprimirVectooresDouble(double[] vector) {
        System.out.println("Imprimir vector ");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
    public static void CargarValoresEnVectorDouble(double [] vector){
        Scanner tec = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingrese la temperatura: ");
            vector [i] = tec.nextDouble();
        }
        //ImprimirVectooresDouble(vector);
    }
    public static void PromedioTemperatura(double [] vector){
        int contador=0;
        double suma=0;
        double promedio=0;
        for (int i = 0; i < vector.length; i++) {
            contador=contador+1;
            suma=suma+vector[i];
        }
        promedio=suma/contador;
        System.out.println("La suma de temperaturas es: " +suma);
        System.out.println("El promedio de todas las temperaturas es: " +promedio);
    }

    public static void main(String[] args) {
        double [] temperatura = new double[5];
        ImprimirVectooresDouble(temperatura);
        CargarValoresEnVectorDouble(temperatura);
        ImprimirVectooresDouble(temperatura);
        PromedioTemperatura(temperatura);
    }

}
