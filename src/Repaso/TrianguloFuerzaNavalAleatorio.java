package Repaso;
import java.util.Random;

public class TrianguloFuerzaNavalAleatorio {

    public static void main(String[] args) {
        Random rand = new Random();

        // Coordenadas aleatorias entre -10 y 10
        int x1 = 0;
        int y1 = 0;
        int x2 = 4;
        int y2 = 0;

        System.out.println("Coordenadas aleatorias generadas:");
        System.out.println("Punto A: (" + x1 + ", " + y1 + ")");
        System.out.println("Punto B: (" + x2 + ", " + y2 + ")");

        // Cálculo del punto medio
        double mx = (x1 + x2) / 2.0;
        double my = (y1 + y2) / 2.0;

        // Diferencias
        double dx = x2 - x1;
        double dy = y2 - y1;

        // Rotación 60° hacia arriba
        double x3_up = mx + (Math.sqrt(3) / 2) * (y1 - y2);
        double y3_up = my + (Math.sqrt(3) / 2) * (x2 - x1);

        // Rotación -60° hacia abajo
        double x3_down = mx - (Math.sqrt(3) / 2) * (y1 - y2);
        double y3_down = my - (Math.sqrt(3) / 2) * (x2 - x1);

        // Lado
        double lado = Math.sqrt(dx * dx + dy * dy);
        double area = (Math.sqrt(3) / 4) * lado * lado;
        double perimetro = lado * 3;

        // Resultados
        System.out.println("\nTriángulo 1 (hacia arriba):");
        System.out.printf("Vértices: (%.2f, %.2f), (%.2f, %.2f), (%.2f, %.2f)\n",
                (double) x1, (double) y1, (double) x2, (double) y2, x3_up, y3_up);
        System.out.printf("Área: %.4f\n", area);
        System.out.printf("Perímetro: %.4f\n", perimetro);

        System.out.println("\nTriángulo 2 (hacia abajo):");
        System.out.printf("Vértices: (%.2f, %.2f), (%.2f, %.2f), (%.2f, %.2f)\n",
                (double) x1, (double) y1, (double) x2, (double) y2, x3_down, y3_down);
        System.out.printf("Área: %.4f\n", area);
        System.out.printf("Perímetro: %.4f\n", perimetro);
    }
}
