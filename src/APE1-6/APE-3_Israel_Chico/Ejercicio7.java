
import java.util.Scanner;


public class Ejercicio7 {

    public static boolean esPalindromo(String palabra) {
        String original = palabra.toLowerCase();
        String invertida = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }

        return original.equals(invertida);
    }
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = tec.nextLine();

        if (esPalindromo(palabra)) {
            System.out.println("La palabra \"" + palabra + "\" es un palíndromo.");
        } else {
            System.out.println("La palabra \"" + palabra + "\" no es un palíndromo.");
        }
    }
}
