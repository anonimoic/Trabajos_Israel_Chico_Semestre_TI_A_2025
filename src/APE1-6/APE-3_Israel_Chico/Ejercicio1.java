
import java.util.Scanner;
public class Ejercicio1 {

    public static int factorial(int numero) {
        int factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int numero;
        System.out.println(" ------       FACTORIAL DE UN NUMERO       ------");
        System.out.println("Ingrese el numero que desea calcular el factorial");
        numero = tec.nextInt();
        int resultado = factorial(numero);
        System.out.println("El factorial de " + numero + " es: " + resultado);
    }
}
