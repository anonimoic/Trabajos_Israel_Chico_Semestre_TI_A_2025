import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de las matrices (n): ");
        int n = tec.nextInt();

        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        int[][] suma = new int[n][n];
        int[][] producto = new int[n][n];

        // Ingreso de valores para la matriz A
        System.out.println("Ingrese los elementos de la matriz A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = tec.nextInt();
            }
        }

        // Ingreso de valores para la matriz B
        System.out.println("Ingrese los elementos de la matriz B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                B[i][j] = tec.nextInt();
            }
        }

        int sumaTotal = 0;
        int mayor = Integer.MIN_VALUE;

        // Suma de matrices y cálculo de promedio y elemento mayor
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                suma[i][j] = A[i][j] + B[i][j];
                sumaTotal += A[i][j] + B[i][j];
                if (suma[i][j] > mayor) {
                    mayor = suma[i][j];
                }
            }
        }

        double promedio = (double) sumaTotal / (n * n * 2);

        // Producto de matrices A * B
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                producto[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    producto[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Mostrar resultados
        System.out.println("\n1. Matriz Suma:");
        mostrarMatriz(suma);

        System.out.println("\n2. Promedio de todos los elementos de ambas matrices: " + promedio);

        System.out.println("\n3. Matriz Producto (A * B):");
        mostrarMatriz(producto);

        System.out.println("\n4. El elemento mayor de la matriz suma es: " + mayor);
    }

    // Método para mostrar matrices
    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }
}
