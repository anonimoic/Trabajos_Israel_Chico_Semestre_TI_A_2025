package Repasos;

import java.util.Random;

public class EjercicioTabla {

    public static void ImprimirVectores(int[] v) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Posicion " + i + " " + v[i]);
        }
    }

    public static void SumaVectores(int[] v, int[] v2) {
        System.out.println("--Suma de vectores--");
        int r = 0;
        for (int i = 0; i < v2.length; i++) {
            r = v[i] + v2[i];
            System.out.println("La suma: " + r);
        }

    }

    public static void main(String[] args) {
        Random rd = new Random();
        int[] vector = new int[]{2,8,9};
        //Completas el vector 1 con aleatorios 
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rd.nextInt(1, 10);
        }
        ImprimirVectores(vector);
        int[] vector2 = new int[5];
        //Completas el vector 2 con aleatorios
        for (int i = 0; i < vector2.length; i++) {
            vector2[i] = rd.nextInt(1, 10);
        }
        ImprimirVectores(vector2);
        SumaVectores(vector, vector2);

    }

}
