import java.util.Scanner;

public class Ejercicio_11 {
     public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Ingrese el número inicial del rango: ");
        int inicio = tec.nextInt();

        System.out.print("Ingrese el número final del rango: ");
        int fin = tec.nextInt();
        int contadorPrimos = 0;
        int numero = inicio;
        do {
            if (esPrimoDoWhile(numero)) {
                contadorPrimos++;
            }
            numero++;
        } while (numero <= fin);
        System.out.println("Hay " + contadorPrimos + " números primos entre " + inicio + " y " + fin + ".");
    }
    public static boolean esPrimoDoWhile(int n) {
        if (n <= 1) return false;
        int i = 2;
        boolean esPrimo = true;
        do {
            if (n % i == 0) {
                esPrimo = false;
            }
            i++;
        } while (i <= Math.sqrt(n) && esPrimo);
        return esPrimo;
    }
}
