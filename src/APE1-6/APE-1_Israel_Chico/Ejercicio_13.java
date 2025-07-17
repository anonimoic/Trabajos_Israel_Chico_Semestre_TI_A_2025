import java.util.Random;
import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Random random = new Random();

        int victoriasJugador = 0;
        int victoriasComputadora = 0;
        int rondas = 0;

        while (victoriasJugador < 2 && victoriasComputadora < 2 && rondas < 3) {
            rondas++;

            System.out.println("Ronda " + rondas);
            System.out.print("Elige Piedra, Papel o Tijeras: ");
            String eleccionJugador = tec.nextLine().toLowerCase();

            while (!eleccionJugador.equals("piedra") && !eleccionJugador.equals("papel") && !eleccionJugador.equals("tijeras")) {
                System.out.print("Entrada inválida. Por favor elige entre Piedra, Papel o Tijeras: ");
                eleccionJugador = tec.nextLine().toLowerCase();
            }

            int eleccionComputadoraInt = random.nextInt(3);
            String eleccionComputadora = "";
            if (eleccionComputadoraInt == 0) {
                eleccionComputadora = "piedra";
            } else if (eleccionComputadoraInt == 1) {
                eleccionComputadora = "papel";
            } else {
                eleccionComputadora = "tijeras";
            }

            System.out.println("Tu elección: " + eleccionJugador);
            System.out.println("Elección de la computadora: " + eleccionComputadora);

            if (eleccionJugador.equals(eleccionComputadora)) {
                System.out.println("Es un empate.");
            } else if ((eleccionJugador.equals("piedra") && eleccionComputadora.equals("tijeras")) ||
                       (eleccionJugador.equals("papel") && eleccionComputadora.equals("piedra")) ||
                       (eleccionJugador.equals("tijeras") && eleccionComputadora.equals("papel"))) {
                victoriasJugador++;
                System.out.println("¡Ganaste esta ronda!");
            } else {
                victoriasComputadora++;
                System.out.println("La computadora ganó esta ronda.");
            }

            System.out.println("Resultado después de esta ronda: ");
            System.out.println("Victorias del jugador: " + victoriasJugador);
            System.out.println("Victorias de la computadora: " + victoriasComputadora);
            System.out.println();
        }

        if (victoriasJugador > victoriasComputadora) {
            System.out.println("¡Felicidades! Has ganado el juego.");
        } else if (victoriasComputadora > victoriasJugador) {
            System.out.println("La computadora ha ganado el juego.");
        } else {
            System.out.println("Es un empate en el juego.");
        }
        
    }

}
