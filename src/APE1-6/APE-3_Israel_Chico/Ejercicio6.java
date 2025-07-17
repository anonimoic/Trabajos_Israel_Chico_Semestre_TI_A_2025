
import java.util.Scanner;


public class Ejercicio6 {
    public static void procesarNumero(int numero) {
        int sumaPares = 0;
        int sumaImpares = 0;

        int n = Math.abs(numero);

        while (n > 0) {
            int digito = n % 10;
            if (digito % 2 == 0) {
                sumaPares += digito;
            } else {
                sumaImpares += digito;
            }
            n /= 10;
        }

        System.out.println("Suma de dígitos pares: " + sumaPares);
        System.out.println("Suma de dígitos impares: " + sumaImpares);
    }
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = tec.nextInt();
        procesarNumero(numero);
    }
}
