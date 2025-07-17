import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de múltiplos de 5 que desea ver: ");
        int n = tec.nextInt();

        int contador = 0;
        int numero = 1; 

        System.out.println("Los primeros " + n + " múltiplos de 5 son:");

        do {
            if (numero % 5 == 0) {
                System.out.println(numero);
                contador++;
            }
            numero++;
        } while (contador < n);

    }
}
