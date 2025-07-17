package Matrices;

import java.util.Random;
import java.util.Scanner;

public class MatricesJava {
    public static void CompletarMatriz(int [][] Matriz_){
        Scanner tec = new Scanner(System.in);
        System.out.println(" Cargar Matrices ");
        for (int f = 0; f < Matriz_.length; f++) {
            for (int c = 0; c < Matriz_[0].length; c++) {
                System.out.print("Ingresa el valor en " +f +" " +c +" : " );
                Matriz_[f][c] = tec.nextInt();
            }  
        }
    }
    public static void ImprimirMatriz(int [][] Matriz_){
        System.out.println(" Imprimir Matrices ");
        for (int f = 0; f < Matriz_.length; f++) {
            for (int c = 0; c < Matriz_[0].length; c++) {
                System.out.print("V[" +f +"," +c +"] = ");
                System.out.print(+Matriz_[f][c] +"\t");
                System.out.print("");
            }  
            System.out.println("\n ");
        }
    }
    public static void CargarMatricesAleatorios(int [][]Matriz_ , int _rangoinicial , int _rangofinal){
        Random rd = new Random();
        for (int f = 0; f < Matriz_.length; f++) {
            for (int c = 0; c < Matriz_[0].length; c++) {
                Matriz_[f][c] = rd.nextInt(_rangoinicial,_rangofinal);
            }  
        }

    }
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        //1) Longityd Fija
        // 1. Fila - 2. Columna
        int [][] matriz1 = new int[3][4];
        int [][] matriz4 = new int[2][2];

        //2) Valores definidos
        int [][] matriz2 = new int[][]{
                                    {1,2,3,4},
                                    {5,6,7,8,9},
                                    {9,10,11,12}
        };

        //3) Matrices con valores por demanda
        int [][] matriz3;
        int fila=3;
        int columnas=4;
        matriz3 = new int[fila][columnas];

        //Conocer el numero de filas y columnas de una matriz
        System.out.println("Numero de filas: " + matriz2.length);
        System.out.println("Numero de columnas: " + matriz2[0].length);

        // -- Carga manual --
        System.out.println(" Cargar Matrices ");
        //CompletarMatriz(matriz1);
        //CompletarMatriz(matriz3);
        //CompletarMatriz(matriz4);
        //ImprimirMatriz(matriz3);

        CargarMatricesAleatorios(matriz1, 10, 30);
        CargarMatricesAleatorios(matriz3, 1, 10);
        ImprimirMatriz(matriz1);
        ImprimirMatriz(matriz3);

        // -- Carga Aleatoria -- 


        
    }

}
