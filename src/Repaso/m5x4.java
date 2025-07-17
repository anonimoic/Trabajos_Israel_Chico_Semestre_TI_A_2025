package Repaso;

import java.util.Random;

public class m5x4 {
    public static void main(String[] args) {
        Random rd = new Random();
        int []sumafilas=new int[5];
        int []sumacolumnas=new int[4];
        int[][] matriz = new int[5][4];
        int[] vector = new int[] { 5, 10, 15, 20 };
        int[][] m2 = new int[5][4];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                matriz[f][c] = rd.nextInt(1, 10);

            }

        }
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[f][c] + "\t");

            }
            System.out.println("\n");

        }
        System.out.println("Matriz llena");

        for (int f = 0; f < m2.length; f++) {
            for (int c = 0; c < m2[0].length; c++) {
                m2[f][c] = matriz[f][c] * vector[c];

            }

        }
        for (int f = 0; f < m2.length; f++) {
            for (int c = 0; c < m2[0].length; c++) {
                System.out.print(m2[f][c] + "\t");

            }
            System.out.println("\n");

        }
  
        System.out.println("Suma de filas");
     
        for (int f = 0; f < m2.length; f++) {
            for (int c = 0; c < m2[0].length; c++) {
                sumafilas[f]+=m2[f][c];
                
            }
            
        }
   for (int i = 0; i < sumafilas.length; i++) {
    System.out.println(sumafilas[i]);
    
   }
   System.out.println("Suma de columnas");
   for (int c = 0; c < m2[0].length; c++) {
    for (int f = 0; f < m2.length; f++) {
        sumacolumnas[c]+=m2[f][c];
        
    }
    
   }
   for (int i = 0; i < sumacolumnas.length; i++) {
    System.out.println(sumacolumnas[i]);
    
   }

    }

}
