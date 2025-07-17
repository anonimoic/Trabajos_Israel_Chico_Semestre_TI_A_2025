
import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

    public static void CompletarMatriz(int[][] Matriz_) {
        Scanner tec = new Scanner(System.in);
        System.out.println(" Cargar Matrices ");
        for (int f = 0; f < Matriz_.length; f++) {
            for (int c = 0; c < Matriz_[0].length; c++) {
                System.out.print("Ingresa el valor en " + f + " " + c + " : ");
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
    public static void SumarFIlas(int[][] Matriz_){
        for (int i = 0; i < Matriz_.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < Matriz_[i].length; j++) {
                sumaFila = sumaFila+ Matriz_[i][j];
            }
            System.out.println("Suma de la fila " + (i + 1) + ": " + sumaFila);
        }
    }
    public static void SumarColumnas(int[][] Matriz_){
        for (int j = 0; j < Matriz_[0].length; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < Matriz_.length; i++) {
                sumaColumna += Matriz_[i][j];
            }
            System.out.println("Suma de la columna " + (j + 1) + ": " + sumaColumna);
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
        int[][] matriz = new int[5][5];
        //CompletarMatriz(matriz);
        CargarMatricesAleatorios(matriz, 1, 10);
        ImprimirMatriz(matriz);
        System.out.println("--Suma Filas--");
        SumarFIlas(matriz);
        System.out.println("--Suma Columnas--");
        SumarColumnas(matriz);

    }

}
