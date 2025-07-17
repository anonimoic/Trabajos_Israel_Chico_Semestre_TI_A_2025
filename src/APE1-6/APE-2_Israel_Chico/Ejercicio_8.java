import java.util.Scanner;

public class Ejercicio_8 {
     public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Ingrese un número entero positivo: ");
        int numero = tec.nextInt();
        int dm = 0;
        int digito;
        numero = Math.abs(numero);
        do {
            digito = numero % 10;
            if (digito > dm) {
                dm = digito;
            }
            numero = numero / 10;
        } while (numero > 0);
        System.out.println("El dígito mayor es: " + dm);

    }

}
