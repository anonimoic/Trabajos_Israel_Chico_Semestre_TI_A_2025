
import java.util.Scanner;

public class Ejercicio4 {

    public static void ImprimirMatriz(double[][] Matriz_) {
        System.out.println(" Imprimir Matrices ");
        for (int f = 0; f < Matriz_.length; f++) {
            for (int c = 0; c < Matriz_[0].length; c++) {
                System.out.print("V[" + f + "," + c + "] = ");
                System.out.print(+Matriz_[f][c] + "\t");
                System.out.print("");
            }
            System.out.println("\n ");
        }
    }

    public static void main(String[] args) {
        double[] precioArticulo = new double[]{10, 20, 30, 40, 50};
        int[][] cantidadesVendidas = new int[][]{
            {5, 6, 10, 1, 1},
            {3, 4, 5, 3, 10},
            {10, 2, 3, 8, 6},
            {4, 3, 2, 5, 2},};
        //item 1 - Las cantidades totales de cada artículo.
        System.out.println("__________________________________________________________________________________");
        System.out.println("--Item #1 --");
        System.out.println(" Las cantidades totales de cada artículo. ");

        for (int c = 0; c < cantidadesVendidas[0].length; c++) {
            int sumatoria = 0;
            for (int f = 0; f < cantidadesVendidas.length; f++) {
                sumatoria = sumatoria + cantidadesVendidas[f][c];

            }
            System.out.println("Cantidad Articulo " + (c + 1) + " = " + sumatoria);
        }
        System.out.println("__________________________________________________________________________________");
        System.out.println("--Item #2 --");
        System.out.println(" La cantidad de artículos en la sucursal 2. ");
        int suma = 0;
        for (int c = 0; c < cantidadesVendidas[0].length; c++) {
            suma = suma + cantidadesVendidas[1][c];
        }
        System.out.println("Hay " + suma + " articulos en la sucursal 2");
        System.out.println("__________________________________________________________________________________");
        System.out.println("--Item #3--");
        System.out.println(" La cantidad del articulo 3 en la sucursal 1. ");
        System.out.println("En la sucursal 1 hay " + cantidadesVendidas[0][2] + " cantidades del articulo 3");
        System.out.println("__________________________________________________________________________________");
        System.out.println("--Item #4--");
        System.out.println(" La recaudación total de cada sucursal. ");
        double[][] montos = new double[4][5];
        Scanner tec = new Scanner(System.in);
        System.out.println(" Cargar Matrices ");
        for (int f = 0; f < montos.length; f++) {
            for (int c = 0; c < montos[0].length; c++) {
                montos[f][c] = cantidadesVendidas[f][c] * precioArticulo[c];
            }
        }
        //Visualizar la matriz de montos
        ImprimirMatriz(montos);
        System.out.println("--Recaudacion Obtenida --");
        for (int f = 0; f < montos.length; f++) {
            double recaudación = 0;
            for (int c = 0; c < montos[0].length; c++) {
                recaudación = recaudación + montos[f][c];
            }
            System.out.println("La recaudacion de la Sucursal " + (f + 1) + " fue de " + recaudación + " $ ");
        }
        System.out.println("__________________________________________________________________________________");
        System.out.println("--Item #5--");
        System.out.println(" La recaudación total de la empresa. ");
        double sum = 0;
        for (int f = 0; f < montos.length; f++) {
            for (int c = 0; c < montos[0].length; c++) {
                sum = sum + montos[f][c];
            }
        }
        System.out.println("La empresa tuvo una recaudacion total de : " + sum);
        System.out.println("__________________________________________________________________________________");
        System.out.println("--Item #6--");
        System.out.println(" La sucursal de mayor recaudación. ");
        double[] precio = new double[4];
        for (int f = 0; f < montos.length; f++) {
            double recaudación = 0;
            for (int c = 0; c < montos[0].length; c++) {
                recaudación = recaudación + montos[f][c];
            }
            precio[f] = recaudación;
        }
        for (int i = 0; i < precio.length; i++) {
            System.out.println("Monto Sucursal " + (i + 1) + " fue de " + precio[i] + " $ ");
        }
        int posicion=0;
        double mayor=precio[0];
        for (int i = 0; i < precio.length; i++) {
            if (mayor<=precio[i]) {
                mayor=precio[i];
                posicion = i;
            }
        }
        System.out.println("La sucursal de mayor recaudacion es " +(posicion+1) + " con un monto de " +mayor +"$");
        System.out.println("__________________________________________________________________________________");


    }

}
