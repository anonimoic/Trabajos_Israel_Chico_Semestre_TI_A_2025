import java.util.Scanner;

public class Ejercicio_10 {
      public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Ingrese un número entero (en forma decimal): ");
        int numero = tec.nextInt();

        System.out.print("Ingrese la base (entre 2 y 10): ");
        int base = tec.nextInt();

        if (base < 2 || base > 10) {
            System.out.println("La base debe estar entre 2 y 10.");
            return;
        }
        int num = numero;
        boolean pertenece = true;
        do {
            int digito = num % 10;
            if (digito >= base) {
                pertenece = false;
                break;
            }
            num = num / 10;
        } while (num > 0);

        if (pertenece) {
            System.out.println("El número " + numero + " pertenece a la base " + base + ".");
        } else {
            System.out.println("El número " + numero + " NO pertenece a la base " + base + ".");
        }
    }

}
