import java.util.Scanner;

public class Ejercicio4 {

    public static int numeroPalabras(String frase) {
        String[] palabras = frase.trim().split("\\s+");
        return palabras.length;
    }

    public static int numeroLetras(String frase) {
        int contador = 0;
        for (char c : frase.toCharArray()) {
            if (Character.isLetter(c)) {
                contador++;
            }
        }
        return contador;
    }

    public static int NumeroVocales(String frase) {
        int contador = 0;
        frase = frase.toLowerCase();
        for (char c : frase.toCharArray()) {
            if ("aeiouáéíóú".indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String respuesta;

        do {
            System.out.print("Ingrese una frase: ");
            String frase = tec.nextLine();

            int nPalabras = numeroPalabras(frase);
            int nLetras = numeroLetras(frase);
            int nVocales = NumeroVocales(frase);

            System.out.println(" ");
            System.out.println("Resultados:");
            System.out.println("Numero de palabras: " + nPalabras);
            System.out.println("Numero de letras: " + nLetras);
            System.out.println("Numero de vocales: " + nVocales);

            System.out.print("\n¿Desea analizar otra frase? (s/n): ");
            respuesta = tec.nextLine().toLowerCase();

        } while (respuesta.equals("s"));

        System.out.println("Programa finalizado.");
    }
}

