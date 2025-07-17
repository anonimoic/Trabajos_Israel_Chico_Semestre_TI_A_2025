import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Resolver un sistema de 2 ecuaciones por el método de Cramer:");
        System.out.println("Forma general: a1x + b1y = c1");
        System.out.println("                a2x + b2y = c2\n");

        // Ingreso de coeficientes
        System.out.print("Ingrese a1: ");
        double a1 = tec.nextDouble();
        System.out.print("Ingrese b1: ");
        double b1 = tec.nextDouble();
        System.out.print("Ingrese c1: ");
        double c1 = tec.nextDouble();

        System.out.print("Ingrese a2: ");
        double a2 = tec.nextDouble();
        System.out.print("Ingrese b2: ");
        double b2 = tec.nextDouble();
        System.out.print("Ingrese c2: ");
        double c2 = tec.nextDouble();

        // Mostrar el sistema
        System.out.println("\nSistema ingresado:");
        System.out.printf("%.2fx + %.2fy = %.2f\n", a1, b1, c1);
        System.out.printf("%.2fx + %.2fy = %.2f\n", a2, b2, c2);

        // Determinantes
        double D = a1 * b2 - a2 * b1;
        double Dx = c1 * b2 - c2 * b1;
        double Dy = a1 * c2 - a2 * c1;

        // Mostrar los pasos
        System.out.println("\nCálculo de determinantes:");
        System.out.printf("D  = (%.2f * %.2f) - (%.2f * %.2f) = %.2f\n", a1, b2, a2, b1, D);
        System.out.printf("Dx = (%.2f * %.2f) - (%.2f * %.2f) = %.2f\n", c1, b2, c2, b1, Dx);
        System.out.printf("Dy = (%.2f * %.2f) - (%.2f * %.2f) = %.2f\n", a1, c2, a2, c1, Dy);

        if (D != 0) {
            double x = Dx / D;
            double y = Dy / D;

            System.out.println("\nAplicando las fórmulas:");
            System.out.printf("x = Dx / D = %.2f / %.2f = %.2f\n", Dx, D, x);
            System.out.printf("y = Dy / D = %.2f / %.2f = %.2f\n", Dy, D, y);

            System.out.println("\nSolución del sistema:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        } else {
            System.out.println("\nEl sistema no tiene solución única (D = 0).");
        }

    }
}
