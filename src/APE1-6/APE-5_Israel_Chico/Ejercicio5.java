
import java.util.Random;

public class Ejercicio5 {
    public static void CompletarMatriz(int [][] Matriz_ , int valori , int valorf){
        Random rd = new Random();
        for (int f = 0; f < Matriz_.length; f++) {
            for (int c = 0; c < Matriz_[0].length; c++) {
                Matriz_[f][c]= rd.nextInt(valori,valorf);
            }
            
        }
    }
    public static void ImprimirMatriz(int [][] Matriz_){
        for (int f = 0; f < Matriz_.length; f++) {
            for (int c = 0; c < Matriz_[0].length; c++) {
                System.out.print("V [" + f +" , " +c +" ] =");
                System.out.print(Matriz_[f][c] +"\t"); 
                System.out.print(" ");
            }
            System.out.println("\n");
        }
    }
    public static void ImprimirMatrizDouble(double [][] Matriz_){
        for (int f = 0; f < Matriz_.length; f++) {
            for (int c = 0; c < Matriz_[0].length; c++) {
                System.out.print("V [" + f +" , " +c +" ] =");
                System.out.print(Matriz_[f][c] +"\t"); 
                System.out.print(" ");
            }
            System.out.println("\n");
        }
    }
    
    public static void main(String[] args) {
        int [][] tienda = new int[][]{
                                    {5,	6,	8,	9,	4,	3,	5,	7},
                                    {3,	4,	5,	2,	7,	10,	8,	4},
                                    {1,	2,	7,	6,	2,	8,	2,	3},
        };
        //visualizar la matriz se utilizo de ejemplo
        //CompletarMatriz(tienda, 1, 10);
        System.out.println("Imprimir Matriz");
        ImprimirMatriz(tienda);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("--Item #1--");
        System.out.println("Mostrar el inventario total de cada producto.");
        for (int c = 0; c < tienda[0].length; c++) {
            int suma=0;
            for (int f = 0; f < tienda.length; f++) {
                suma=suma+tienda[f][c];
            }
            System.out.println("El producto " +(c+1) +" tiene un stock de " +suma +" unidades");
        }
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("--Item #2--");
        System.out.println("Calcular el inventario total en el almacén 1.");
        int suma = 0;
        for (int f = 0; f < tienda[0].length; f++) {
            suma=suma+tienda[0][f];
        }
        System.out.println("El almacen 1 cuenta con un inventario de " +suma +" unidades en stock ");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("--Item #3--");
        System.out.println("Mostrar el stock del producto 4 en el almacén 2.");
        System.out.println("En el almacen 2 hay una cantidad de " +tienda[1][3] +" unidades del producto 4");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("--Item #4--");
        System.out.println("Calcular el valor total del inventario de la cadena, asumiendo que el precio de\r\n" + //
                        "cada producto es: p1= $ 100, p2= $ 200, p3= $ 50, p4= $ 40, p5= $ 80, p6= $ 100,\r\n" + //
                        "p7= $ 60, p8= $ 50,");
        System.out.println("");
        int [] precio = new int[]{100,200,50,40,80,100,60,50};
        double [][] montos = new double[3][8];
        for (int f = 0; f < montos.length; f++) {
            for (int c = 0; c < montos[0].length; c++) {
                montos[f][c]=tienda[f][c]*precio[c];
            }
        }
        //ImprimirMatrizDouble(montos);
        double valorf=0;
        for (int f = 0; f < montos.length; f++) {
            double sumafila=0;
            for (int c = 0; c < montos[0].length; c++) {
                sumafila=sumafila+montos[f][c];
            }
            System.out.println("La suma de la fila " +(f+1) +" es " +sumafila);
            valorf=valorf+sumafila;
        }
        System.out.println("El valor total del inventario de la cadena de tienda es : " +(valorf));
    }

}
