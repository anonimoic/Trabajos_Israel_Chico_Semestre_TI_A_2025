package Matrices;

import java.util.Random;

public class DadosMatrices {
    public static void LanzarDados(int [][]Matriz_ , int _rangoinicial , int _rangofinal){
        Random rd = new Random();
        for (int f = 0; f < Matriz_.length; f++) {
            for (int c = 0; c < Matriz_[0].length; c++) {
                Matriz_[f][c] = rd.nextInt(_rangoinicial,_rangofinal);
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
    public static void Victorias(int [][] Matriz_){
        int vic =0;
        for (int f = 0; f < Matriz_.length; f++) {
            if (Matriz_[f][0]==Matriz_[f][1]) {
                vic=vic+1;
                
            }
        }
        System.out.println("Total de vistorias : " +vic);

    }
    public static void main(String[] args) {
        int [][] dado = new int[20][2];
        LanzarDados(dado, 1, 6);
        ImprimirMatriz(dado);
        Victorias(dado);

    }

}
