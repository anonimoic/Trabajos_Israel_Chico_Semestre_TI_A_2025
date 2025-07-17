package Repaso;

import java.util.Random;

/*
 * matriz 3x3
 * suma filas y columnas 
 * determinar el mayor en filas y columnas
 */

public class EjerciciosMatriz {
    public static void main(String[] args) {
        Random rd = new Random();
        //Siempre siempre que te diga determinar el mayor o menor SIEMPRE VAN CON VECTORES!!!
        
        int [][] matriz = new int[5][4];
        int [] SumaFilas = new int[3]; //Un vector porque si no usas el vector se "queman" los valores 
        int [] SumaColumnas = new int[3];
        //Completas la matriz con aleatorios 
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                matriz[f][c]= rd.nextInt(1,10);
            }
        }
        //Imprimes la matriz que generas 
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[f][c] + "\t"); 
            }
            System.out.println("\n");
        }

        //Calculas la suma de filas y GUARDAS EN EL VECTOR 
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                SumaColumnas[c]+= matriz[f][c];  // La letra C porque el vector solo recorre columnas , tiene una unica fila 
            }
        }
        for (int c = 0; c < matriz[0].length; c++) {
            for (int f = 0; f < matriz.length; f++) {
                SumaFilas[f]+= matriz[f][c];  
            }
        }

        //Como es un vector donde guardamos las sumas , debes imprimir con un for SOLO PARA ESE VECTOR 
        System.out.println("Suma de cada columna");
        for (int i = 0; i < SumaColumnas.length; i++) {
            System.out.println("Columna " +(i+1) + " = " +SumaColumnas[i]);
            
        }
        System.out.println("Suma de cada fila");
        for (int i = 0; i < SumaFilas.length; i++) {
            System.out.println("Fila " +(i+1) + " = " +SumaFilas[i]);
            
        }
        //Ahora solo buscas el mayor ocn un IF
        int mayorFilas = SumaFilas[0]; //no sabes cual es el mayor en la fila entonces pones la primera posicion 
        for (int i = 0; i < SumaFilas.length; i++) {
            if (SumaFilas[i]>mayorFilas) {
                mayorFilas=SumaFilas[i];
            }

        }
        System.out.println("El nmumero mayor de la sumatoria de filas es: ");
        System.out.println(mayorFilas);
        //Ahora haces lo mismo para el mayor con columnas
        int mayorColumnas = SumaColumnas[0]; //no sabes cual es el mayor en la fila entonces pones la primera posicion 
        for (int i = 0; i < SumaColumnas.length; i++) {
            if (SumaColumnas[i]>mayorColumnas) {
                mayorColumnas=SumaColumnas[i];
            }

        }
        System.out.println("El nmumero mayor de la sumatoria de columnas es: ");
        System.out.println(mayorColumnas);
        System.out.println("                    ");
        int menorFilas = SumaFilas[0]; //no sabes cual es el mayor en la fila entonces pones la primera posicion 
        for (int i = 0; i < SumaColumnas.length; i++) {
            if (SumaColumnas[i]>menorFilas) {
                mayorColumnas=SumaColumnas[i];
            }

        }

        
    }

}
